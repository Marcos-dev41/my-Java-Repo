package DSA;
// The set inteface is used to stroe a collection of unique elements
// it doesnot allow duplicates and doesnpt preserve order of elements 

import java.util.HashSet;

/*COMMON CLASSES
HashSet -> fast and unordered
TreeSet -> Sorted set
LinkedSet -> Ordered by insertion

Method	Description
add()	    Adds an element if it's not already in the set
remove()	Removes the element from the set
contains()	Checks if the set contains the element
size()	    Returns the number of elements
clear()	    Removes all elements

 */
public class UsingHashSets {
    public static void main(String[] args) {
        // using HashSet
        // each element is unique
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("Atenza");
        cars.add("Fit");
        cars.add("Audi"); 
        cars.add("Audi");
        for(String i : cars){
            System.out.println(i);
        }
        
        System.out.println(cars.contains("Fit"));


    }
}
