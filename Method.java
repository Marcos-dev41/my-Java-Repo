// Static - means a mthods belongs to the main method
// Void - means the method has no return type
// parameters - information passed to a method after the parenthesis-whena param is passed to a methhod it becomes the argument ...in this case "Mark"
// Return values - requires you to prefix your method with the primitive type of data that is being returned

// method overloading - multiple methods can have the dame name with different params;
public class Method{
    static void myMethod(String fname){
        System.out.println(fname + " this is my method");
    }
    // return value
    static int myCal(int x,int y){
        return x + y ;
    }
    static double myCal (double x,double y){
        return x + y;
    }
    public static void main(String[] args){
        // you can store the method with a return value to a variable .
        int z = myCal(6, 7);
        double y = myCal(4.5, 4.5);
        myMethod("Mark");
        System.out.println("normal : " + z);
        System.out.println("Overloaded : " + y);
    }}

