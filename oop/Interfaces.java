package oop;
// this is a completely "abstract class" that is used to group related methods with empty bodies;
// uses the implements keyword
// specifies what a class must have or do;
// to access them the interface must be implemented by another class where the body of the interface method is defined;
// works best for decoupling(what needs to happen from how it happpens)
public interface Interfaces {
public void flee();
    
}
class Rabbit implements Interfaces{
public void flee(){
    System.out.println("hopps");
}
}
class Goat implements Interfaces{
public void flee(){
    System.out.println("Running goat");
}
 public static void main(String[] args) {
        Goat newG = new Goat();
        newG.flee();
    }
    

}



