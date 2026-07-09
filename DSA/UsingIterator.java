package DSA;
// Iterator is an object that can be used to loop through collections ie arraylist and hashset

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("mazda");
        cars.add("vitz");
        cars.add("volvo");
        cars.add("peugot");

        Iterator<String> it = cars.iterator();
// printing the 1st item
        // System.out.println(it.next());

        while(it.hasNext()){
            String i = it.next();
            if (i.equals("volvo"))
            it.remove();
        }
    System.out.println(cars);

        // removing items
         
    }
}
