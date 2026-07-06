package oop;
// class - its a temlate for objects blueprint
// object - an instance of a class
/* accessing attributes:
    1. creating an object of the class using the . syntax
 */


// Constructors - special method used to initialize objects
//              - called when an object is being created
//              **constructor name matches the classname and has no return type

// This keyword - refers to the current object in a method or constructor
//                - helps avoid confusion when class attr have the same name as method/constructor params

// consturctor chaining - usually happens when you want to define ultiple constructors with some having default values asssigned 
/*
When to use this?
--When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
--To call another constructor in the same class and reuse code
 */

// MODIFIERS
// Access modifiers for classes
/*
    Public-> the clas is accesible by any other class
    default -> class is only accesible by classes in the same papckage ..used when a modifier is not defined 
 */
// Access modifiers for attributes,methods and constructors
/*
    Public-> code is accessible for all classes

    Private-> code is accesible within the decalred class

    Default-> code is only accesible in the same package 

    Protected-> code is accesible in the same package and subclasses;
 */
// Non-Access Modifiers
/*
    final-> contants

    static-> tells us that a mthod belongs to that class and you can call it without creating an object in the class

    abstract method-> its a mthod that belongs to the abstract class ,ans it doesnot have a body.
        - the body is provided in the subclass

    Abstract class -> is a class that cannot be used to create objects

    Transient -> attributes and methods are skiped when serializing the object containing them

    Synchronied -> methods can only be accesed by one thread at a time

    volatile -> attribute value is not cached thread0locally and is always read from main memory

        */

// ENCAPSULATION

/*
means ensuring sensitive data is hidden from users
employs use of private attributes and getters and setters to access and modify them
 */
public class Oop {
    private String name;
    // private int age;

    // //  chained contstructor
    // public Oop(String name){
    //     this(name,30);
    // }

    // // master constructor - you can add centralizeed validation logic here before assigning the values to attributes 
    // // class constructor fro the Oop class
    // public Oop(String name,int age){
    //     this.name = name;
    //     this.age = age; //refers to the class variable x
    // }
    // setters and getters
    public void setName(String name){
        this.name =  name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Oop obj = new Oop();
        obj.setName("Mark");
        System.out.println(obj.getName());     


    }
}
