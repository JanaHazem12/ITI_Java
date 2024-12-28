

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Exercise2 {

    public static void main(String[] args) {
        

        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        InMemoryWorldDao inMemoryWorldDao = InMemoryWorldDao.getInstance();
        List <Country> countries = countryDao.findAllCountries();

        List <City> highestPopulatedCities = countries.stream()
        .map(eachCountry -> eachCountry.getCities().stream()
        .max(Comparator.comparing(City::getPopulation)))
        .filter(Optional::isPresent)
        .map(Optional::get).collect(Collectors.toList());

        // FIND THE MOST POPULATED CITY IN EACH CONTINENT //

        // get the city by country code THEN get Continent by country code

        // here, it's a set of strings NOT list
        // List <String> continents = inMemoryWorldDao.getAllContinents().stream().collect(Collectors.toList());
        
         // converted continents to stream
         
         //we can stream on a set 3ady, does NOT have to be a list
         inMemoryWorldDao.getAllContinents().stream()
         // map each continent to a list of highly populated cities
         .map(continent -> highestPopulatedCities.stream()
        // filter the cities by continent (check if this city is in this continent)        
         .filter(f->countryDao.findCountryByCode(f.getCountryCode()).getContinent().equals(continent))
         // get the most populated city in this continent
         .max(Comparator.comparing(City::getPopulation)))
         // filter the null values
         .filter(Optional::isPresent)
         // map the optional to the value
         .map(Optional::get).forEach(x->System.out.println(x));

         /*inMemoryWorldDao.findCitiesByCountryCode(null);
         inMemoryWorldDao.findCountriesByContinent(null);
         inMemoryWorldDao.*/
    }

}
