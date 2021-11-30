package Basic.java;

import java.util.Map;
import java.util.TreeMap;

public class Country_Map {
    final Map<String, String> map = new TreeMap<String, String>   (String.CASE_INSENSITIVE_ORDER);
   public void CountryCodes() {

    map.put("India", "Rajasthan");
    map.put("England", "London");
   }

   public String getCode(String country){
   String countryFound = map.get(country);
   if(countryFound==null){
           countryFound="UK";
   }
   return countryFound;
   }
}
