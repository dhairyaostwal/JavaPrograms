/* write a java program to get a string from the user 
as mail id and split the username domain 
name seperately

ex. vituniversity@vit.ac.in
output :
username- vituniversity
domainname - vit.ac.in

*/

import java.lang.String;
import java.util.*;

class stHW {

  public static void main(String args[]) {
    System.out.println("Enter your input: ");
    Scanner s = new Scanner(System.in);
    String inp = s.nextLine();
    System.out.println("\nOutput: ");
    StringTokenizer st = new StringTokenizer(inp, "@ .");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
