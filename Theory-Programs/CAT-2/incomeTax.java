import java.util.*;

class incomeTax extends Exception {

  incomeTax(String s) {
    super(s);
    // System.out.println(s);
  }
}

class userDefinedExc {

  static void check(int salary) throws incomeTax {
    if (salary > 500000) {
      throw new incomeTax("PAY TAX!!!");
    } else {
      System.out.println("No need to pay tax");
    }
  }

  public static void main(String args[]) {
    int n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your annual salary");
    n = s.nextInt();
    try {
      check(n);
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
