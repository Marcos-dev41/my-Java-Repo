package IOStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// cpying a binary file...
public class FileInputSream {
    public static void main(String[] args) {
        // try-with-resources: FileInputStream will be closed automatically
    try (FileInputStream input = new FileInputStream("images.jpg");
            FileOutputStream output = new FileOutputStream("copy.jpg")) {

      int i;  // variable to store each byte that is read

      // Read one byte at a time until end of file (-1 means "no more data")
      while ((i = input.read()) != -1) {
         output.write(i);
        // Convert the byte to a character and print it to the console
        System.out.print((char) i);
      }
      

    } catch (IOException e) {
      // If an error happens (e.g. file not found), print an error message
      System.out.println("Error reading file.");
    }
    }
}
