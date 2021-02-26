import java.util.*;

class stringTokenizer {

  public static void main(String args[]) {
    StringTokenizer s = new StringTokenizer("Hey my name is Dhairya", " ");
    while (s.hasMoreTokens()) {
      System.out.println(s.nextToken());
    }
  }
}
