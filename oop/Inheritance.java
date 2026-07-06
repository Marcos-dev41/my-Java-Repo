package oop;

//we implement inheritance by the use of  the Extends keyword 
// super keyword - used to refer to the parent classof a subclass;
  /* Typiclly used to :
    1. access attributes and methods from the parentclass;
    2. call the parent class constructor
   */




 class Vehicle {
    protected String modelName = "ford";

    public void honk(){
        System.out.println("make noise");
    }
    
}

 class Car extends Vehicle {
    private String modelName= "Mustang";
    public void honk(){
        // calling the parent class constructor 
        //  super();- its injected iimplictly by java though
        // Requires explicit typing out when your parent class has fields that need initializing at startup where you'll use super(args);

        System.out.println(super.modelName);
        super.honk(); //calling the parent method 
        System.out.println(modelName);
        System.out.println("pops and bangs");
    }
//   super-> helps avoid confusion when accessing attr and methods of the parent class in subclasses;

    
}

public class Inheritance {
     public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
    }
}