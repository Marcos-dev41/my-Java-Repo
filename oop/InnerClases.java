package oop;
// where classes are nested in each other
// it groups classes that belong together imporving code readability
public class InnerClases {
    int y= 10;
    static class InnerInnerClass{
        int x = 5;


    }
    
        public static void main(String[] args) {
            InnerInnerClass  val1 = new InnerInnerClass();
            InnerClases  val2 = new InnerClases();

            System.out.println(val1.x + val2.y);
        }
}
