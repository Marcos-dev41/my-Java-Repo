package IOStreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {
  public static void main(String[] args) {
    try (BufferedWriter writing = new BufferedWriter(new FileWriter("filename.txt"))) {
          writing.write("Hello");
          writing.write("\n");
          writing.write("lorem ipsum");
          System.out.println("File written");
      
      }
    
    catch (IOException e) {
      System.out.println("Error reading file.");
    }
    
  
    try(BufferedReader br = new BufferedReader(new FileReader("filename.txt"));) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
        System.out.println("file read");
    } }
    catch(FileNotFoundException e){
      System.err.println(e);
    }
    catch(IOException e){
      System.err.println(e);
    }
    
  }
}