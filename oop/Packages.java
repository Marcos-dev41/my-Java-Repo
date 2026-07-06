package oop;

import java.util.Scanner;

// its used to group related classes
/*
     how to import them:
     import package.name.class - for a specific class
     import package.name.* - for the whole package 
 */
public class Packages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name  =  scan.nextLine();
        scan.close();
        System.out.println("Enter name: " + name);
    }
}
