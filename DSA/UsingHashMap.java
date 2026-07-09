package DSA;
// Map - a collections framework used to store key value pairs: each key must be unique but values can be duplicated 
/*
HashMap - fast and unordered
TreeMap - sorted by key
linkedHashMap - ordered by insertion

Method	        Description

put()	        Adds or updates a key-value pair
get()	        Returns the value for a given key
remove()	    Removes the key and its value
containsKey()	Checks if the map contains the key
keySet()	    Returns a set of all keys

--instead of accessing elements by an index you use a key to retrieve its associated value
 */

import java.util.HashMap;

public class UsingHashMap {
 public static void main(String[] args) {
    HashMap <String,String> capitalCities = new HashMap<>();
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
