package oop;
// Abstractin is the process of hiding cetain details and only showing essential information to the user;
// Can b achieved using abstarct classes or interfaces 

/*
 Abstarct class is a restricted class that cannot be used to create objects (to access it it must be inherited from another class);
 Abstract method - can only be used  in an abstract class and doesnot have a body 
 */

//  used when and why
//      To achieve security-hide certain details and only show the important details of an obj;
abstract class Abstract {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzz");
    } 
}

 class Pig extends Abstract {
public void animalSound(){
    System.out.println("oink");
}   
}
class Main{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
    }
}