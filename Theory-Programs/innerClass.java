// member inner class

class out {

  private int a = 100;

  class in {

    void display() {
      System.out.println("a: " + a);
    }
  }

  public static void main(String arg[]) {
    out o = new out();
    out.in i = o.new in();
    i.display();
  }
}

// anonymous inner class

abstract class Emp {

  abstract void working();
}

class aina {

  public static void main(String args[]) {
    Emp e = new Emp() {
      void working() {
        System.out.println("I am a SE!");
      }
    };
    e.working();
  }
}
