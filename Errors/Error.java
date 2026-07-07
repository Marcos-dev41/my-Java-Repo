package Errors;
/* TYPES OF ERRORS
 1. Compile time error-  detected by compiler ... prevens code fro running
 2. Runtime Error - Occurs while the program is running ,often causes crashes(" throws exceptions")
    eg - Arithmetic exceptions
        -arrayindexoutofboundsexceptions
 3. Logical error - code runs but gives incorrect results

 */
// Exception handling

/* handled using try and catch blocks
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

Throw statement allows you too create a custom error; used together with the exception type
 */

// TRY WITH RESOURCES
/*
Useful when working with files, streams or other resouces...where its important to close them to release memory holding them;
with try with resources basically you add the reosources into the try parenthesis egtry (FileOutputStream output = new FileOutputStream("filename.txt")) {}
 */
public class Error {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied- too young");
        }
        else{
            System.out.println("granted");
        }
    }
    public static void main(String[] args) {
        checkAge(19);
        try{
            int[] myNumbers= {1,2,3};
            System.out.println(myNumbers[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        catch(Exception e){
            
            System.out.println("something went wrong");
        }finally{
            System.out.println("try catch is finished");
        }
    }
}
/*
you can also chain them like this :
catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
  System.out.println("Math error or array error occurred.");
}
 */


