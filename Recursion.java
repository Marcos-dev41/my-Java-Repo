// Recursion - technique of making a function call itself
// typically used to add a range of numbers together by breaking it dwn into sinmple tasks of adding 2  numbers
/*
 When sum method is called ,it adds parameter k to the sum of all numbers smaller than k and returns the result when k is 0 the method returns 0
 */

public class Recursion {
 static int myFunc(int k){
    if (k < 11){
        System.out.println(k);
        return k + myFunc(k+1);
    }
    else{
        System.out.println("compeleted");
        return 0;
    }
 }
 static int myFact(int y){
    if(y > 1){
        System.out.println(y);
        return y * myFact(y-1);
    }
    else{
        return 1;
    }
 }
 public static void main(String[] args){
    System.out.println(myFunc(5));

    System.out.println("Factorial");

    System.out.println(myFact(5));
 }
    
}