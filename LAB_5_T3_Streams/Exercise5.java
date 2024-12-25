



import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        InMemoryWorldDao inMemoryWorldDao = InMemoryWorldDao.getInstance();
        List <Country> countries = countryDao.findAllCountries();
        List <City> cities;

         List <City> highestPopulatedCities = countries.stream()
         .map(eachCountry -> eachCountry.getCities().stream()
         .max(Comparator.comparing(City::getPopulation)))
         .filter(Optional::isPresent)
         .map(Optional::get).collect(Collectors.toList());

        // FIND THE HIGHEST POPULATED CAPITAL CITY //
        // filter to check if the highest populated city is the capital or NOT //
        countries.stream()
        .map(g->highestPopulatedCities.stream()
        .filter(city->cityDao.findCityById(countryDao.findCountryByCode((city.getCountryCode())).getCapital()).getName().equals(city.getName()))
        .max(Comparator.comparing(City::getPopulation)))
        .filter(Optional::isPresent)
        .distinct()
        .map(Optional::get)
        .forEach(x->System.out.println(x));
    }

}