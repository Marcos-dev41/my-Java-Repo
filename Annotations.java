// Are special notes you add to your java code  they give extra informantion to the compiler or tools
/*Annotation	Description
@Override	Indicates that a method overrides a method in a superclass
@Deprecated	Marks a method or class as outdated or discouraged from use
@SuppressWarnings	Tells the compiler to ignore certain warnings*/

import java.util.ArrayList;

public class Annotations {
      @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    ArrayList cars = new ArrayList();
    cars.add("Volvo");
    System.out.println(cars);
  }
}
