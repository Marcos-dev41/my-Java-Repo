package files;
import java.io.File;

// to delete a folder just follow the same steps ..also the folder must be empty;
// Done sunig .delete() method
public class DeleteFiles {
public static void main(String[] args) {
    
    File myObj = new File("books.txt");

    
    if(myObj.delete()){
            System.out.println("deleted" + myObj.getName());
        }else{
            System.out.println("failed to delete");
        }
}
    

    

}
