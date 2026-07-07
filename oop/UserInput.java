package oop;

import java.util.Scanner;

// how user input is retrived using the Scanner method
    /*
    nextBoolean()->Reads a boolean value from the user
    nextByte()->Reads a byte value from the user
    nextDouble()->Reads a double value from the user
    nextFloat()->Reads a float value from the user
    nextInt()->Reads a int value from the user
    nextLine()->Reads a String value from the user
    nextLong()->Reads a long value from the user
    nextShort()->Reads a short value from the user
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userName = input.nextLine();
        input.close();
        System.out.println(userName);
    }
}
