package firstpackage.simplepackage1;

import firstpackage.simplepackage2.*;

// Don't forget the class needs to be public
public class simple1 {

  public static void main(String arg[]) {
    simple2 s2 = new simple2();
    s2.display();
    System.out.println("Printing from simple1");
  }
}
