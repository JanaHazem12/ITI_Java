

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      CityDao cityDao= InMemoryWorldDao.getInstance();
      //write your answer here
      List <Country> countries = countryDao.findAllCountries();

      // FIND THE HIGHEST POPULATED CITY IN EACH COUNTRY //

      // convert list to stream - DONE
      // map the stream of countries to a list of cities //      
      // I'm holding 'eachCountry' ha3mel beeha eih ?? hageeb ALL cities in 'eachCountry'

      countries.stream()
      .map(eachCountry -> eachCountry.getCities().stream()
      .max(Comparator.comparing(City::getPopulation)))
      .filter(Optional::isPresent) // filters NULL values
      .map(Optional::get) // converting from optional to the data we want
      .forEach(x -> System.out.println(x));
   }

}