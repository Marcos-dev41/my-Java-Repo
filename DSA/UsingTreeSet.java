package DSA;
import java.util.TreeSet;
// Treeset is a collection that stores unique elements in sorted order;
// slower due to sorting
public class UsingTreeSet{
    public static void main(String[] args){
        TreeSet<String> cars = new TreeSet<String>();
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