import java.util.*;

class checkage extends Exception {

  checkage(String s) {
    System.out.println(s);
  }
}

class voting {

  public void voting() throws checkage {
    Scanner s = new Scanner(System.in);
    int age = s.nextInt();
    if (age < 18) {
      throw new checkage("Age Below 18. NO ENTRY");
    } else {
      System.out.println("Allowed");
    }
  }
}

class votingmain {

  public static void main(String args[]) {
    voting v = new voting();
    try {
      v.voting();
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
    System.out.println("Handled exception well");
  }
}
