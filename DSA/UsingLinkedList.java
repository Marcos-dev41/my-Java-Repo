package DSA;
// Almost similiar syntax to ArrayList
/*
It stores its elements in containers 
the list has a link to the first container and each container has a link to the next container in the list

WHEN TO USE
-Use an ArrayList for storing and accessing data and a LinkedList to manipulate data

Method	    Description	 

addFirst()	    Adds an element to the beginning of the list	
addLast()	    Add an element to the end of the list	
removeFirst()	Remove an element from the beginning of the list	
removeLast()	Remove an element from the end of the list	
getFirst()	    Get the element at the beginning of the list	
getLast()	    Get the element at the end of the list

Alos all the other ArrayList methods on topn of this are used in linked list

For sorting we iimport the Collections class from the util package 
 it contains methods like :
 .sort()
 
 .reverseOrder()
*/
import java.util.Collections;
import java.util.LinkedList;

public class UsingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("Atenxa");
        cars.add("Fit");
        cars.add("Audi");
        cars.addFirst("cayenne");
        cars.removeFirst();
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
    }
}
