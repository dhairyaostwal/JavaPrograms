// To run

// javac -d . arithPackage.java
// java packageHW.arithPackage

package packageHW;

public class arithPackage {

  int multiply(int a, int b) {
    return a * b;
  }

  int add(int a, int b) {
    return a + b;
  }

  int subtract(int a, int b) {
    return a - b;
  }

  int divide(int a, int b) {
    return a / b;
  }

  public static void main(String arg[]) {
    arithPackage a = new arithPackage();
    System.out.println(a.add(5, 6));
    System.out.println(a.multiply(5, 6));
    System.out.println(a.subtract(5, 6));
    System.out.println(a.divide(5, 6));
  }
}
