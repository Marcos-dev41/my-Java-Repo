 package DSA;

import java.util.LinkedHashMap;
// stores  key value in the same order you put them in 

public class UsingLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String,String> capitalCities = new LinkedHashMap<>();
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