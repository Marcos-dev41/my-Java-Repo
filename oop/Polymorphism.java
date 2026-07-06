package oop;

// it means many froms - allows us to perform a single action in different ways
/* types of ppolymorphism
        1.Static binding /compile-time /method overloading
    -resolved by the compiler during compilation
    -> Happens when a class has multiple methods with identical name but different parameter lists(types,args ,ordertypes)
        
        2.Runtime/dynamic binding / method overriding
    -resolved during runtime
    ->Occurs when a subclass provides a specific implementation for a method already defined in its superclass;
        */

class Student {
protected int stdId;
String stdName;
String stdCourse;
String stdFaculty;
    // method overloading
public void stdBasics(int id ,String name){
    stdId = id;
    stdName = name;
    System.out.println("Id: " + stdId + " name: " + stdName);
}
public void stdBasics(int id ,String name,String course,String faculty){
    stdId = id;
    stdName = name;
    stdCourse = course;
    stdFaculty = faculty;
    System.out.println("Id: " + stdId + " name: " + stdName + " Course: "+stdCourse + " faculty: " + stdFaculty);
}

 public void registerStd(){
    System.out.println("taking student name and id!!");

}}


// method overrrding

 class PryStudents extends Student {
    @Override
    public void registerStd(){
    System.out.println("taking primary student name and id!!");
}}

 class HighStudents extends Student {
    @Override
    public void registerStd(){
    System.out.println("taking high school student name and id!!");
}}

public class Polymorphism{
    public static void main (String[] args) {
        Student std1 = new Student();
        // method overloading
        std1.stdBasics(001, "mary njoki");
        std1.stdBasics(001, "Mark Ndwaru", "IT", "CIT");

        // method overriding
        Student std0 = new PryStudents();
        Student std01 = new HighStudents();

        std0.registerStd();
        std01.registerStd();

    }
}
