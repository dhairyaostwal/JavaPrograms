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
    Emp e = new Emp() { // anonymous inner class
      void working() {
        System.out.println("I am a SE!");
      }
    };
    e.working();
  }
}

// class local inner

class localInner {

  private int a = 300;

  void display() {
    class local {

      void show() {
        System.out.println(a);
      }
    }
    local l = new local();
    l.show();
  }

  public static void main(String args[]) {
    localInner lo = new localInner();
    lo.display();
  }
}
