class Test {

  interface myInterface {
    void demo();

    interface myChildInterface {
      void demo2();
    }
  }
}

public class InterfaceInsideClass
  implements Test.myInterface, Test.myInterface.myChildInterface {

  public void demo() {
    System.out.println("\nInterface inside Class\n");
  }

  public void demo2() {
    System.out.println("\nInterface inside Interface\n");
  }

  public static void main(String args[]) {
    InterfaceInsideClass obj = new InterfaceInsideClass();
    obj.demo();
    obj.demo2();   
  }
}
