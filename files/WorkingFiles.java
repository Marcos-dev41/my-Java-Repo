package files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// Start by importing the file package from java.io
// To use the File class, create an object of the class, and specify the filename or directory name:
/*
 Method	            Type	     Description
canRead()	        Boolean	    Tests whether the file is readable or not
canWrite()	        Boolean	    Tests whether the file is writable or not
createNewFile()	    Boolean	    Creates an empty file
delete()	        Boolean	    Deletes a file
exists()	        Boolean	    Tests whether the file exists
getName()	        String	    Returns the name of the file
getAbsolutePath()	String	    Returns the absolute pathname of the file
length()	        Long	    Returns the size of the file in bytes
list()	            String[]	Returns an array of the files in the directory
mkdir()         	Boolean	    Creates a directory
 */

public class WorkingFiles {
    public static void main(String[] args) {
       try {
         File myObj = new File("books.txt");
         if(myObj.createNewFile()){
            System.out.println("file created : " + myObj.getName());
         }else{
            System.out.println("File already exists");
         }

       } catch (IOException e) {
        System.err.println(e);
       }
    //     append node ("books.txt",true)
       try (FileWriter myWriter = new FileWriter("books.txt", true)){
        
        myWriter.write("Hello world");
        myWriter.write("\n appended textttttttttts");
        // myWriter.close(); trycacth with resources ensures the writer is closed after exceution;
        System.out.println("wrote succesfully");
       } catch (IOException e) {
        System.err.println(e);
       }

        
    }
}
