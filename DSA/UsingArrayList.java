package DSA;
import java.util.*;
// housed in the List interface in the java collections framework
/*
Common list methods inlcude:
add()	Adds an element to the end of the list
get()	Returns the element at the specified position
set()	Replaces the element at the specified position
remove()	Removes the element at the specified position
size()	Returns the number of elements in the list
 */
// ArrayList -> is a resizable array with fast random access
public class UsingArrayList {
    
    public static void main(String[] args) {
    ArrayList <String> myArray = new ArrayList<String>();

        myArray.add("hello"); 
        myArray.add("there");
        myArray.add(1,"Mark");
        myArray.get(0);
        myArray.set(2,"John");
        myArray.remove(2);
        // myArray.clear();
        myArray.size();
        Collections.sort(myArray);
        System.out.println(myArray); 
        for (String i : myArray){
            System.out.println(i);
        }
    }
    
    
}
