package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
// Reading files 
/*
Scanner - best for simple text and when you want to parse numbers or words easily.
BufferedReader - best for large text files, because it is faster and reads line by line.
FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes
 */

public class ReadFiles {
    public static void main(String[] args) {
         File myObj = new File("books.txt");

        try(Scanner myReader= new Scanner(myObj)){
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
}
