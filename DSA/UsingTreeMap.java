package DSA;
// TreeMap - collection that stores key vaue pairs in a sorted order;

import java.util.TreeMap;

public class UsingTreeMap {
      public static void main(String[] args) {
        TreeMap <String,String> capitalCities = new TreeMap<>();

    capitalCities.put("England", "london");
    capitalCities.put("Kenya", "Nairobi");
    capitalCities.put("Uganda", "Kampala");
    capitalCities.put("England", "london");
    capitalCities.put("Russia", "St.petersberg");

    for(String i : capitalCities.keySet()){
        System.out.println(i + ": " + capitalCities.get(i));
    }

    for (String i: capitalCities.values()){
        System.out.println(i);
    }
    System.out.println(capitalCities.keySet());
 }
      }

