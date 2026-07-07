package oop;
// used to override methods of an existing class or interface without writing a separeate class file;

/*
Use anonymous classes when you need to create a short class for one-time use. For example:

Overriding a method without creating a new subclass
Implementing an interface quickly
Passing small pieces of behavior as objects
 */

class Animal{
    public void makeSound(){
        System.out.println("moow");
    };
}

public class Anonymous{
    public static void main(String[] args) {
        Animal dog = new Animal(){
            public void makeSound(){
                System.out.println("bleat");
            }
        };
        dog.makeSound();
    }
}
