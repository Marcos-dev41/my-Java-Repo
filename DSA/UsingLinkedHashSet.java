package DSA;

import java.util.LinkedHashSet;
// Stores unique elements and remembers the order they were added;

public class UsingLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("Atenza");
        cars.add("Fit");
        cars.add("Audi"); 
        cars.add("Audi");
        for(String i : cars){
            System.out.println(i);
        }
    }
}
