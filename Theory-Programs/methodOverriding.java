// Method overriding

class parent {

  parent() {
    System.out.println("Parent Constructor");
  }

  void show() {
    System.out.println("Parent show method");
  }
}

class child extends parent {

  child() {
    System.out.println("Child Constructor");
  }

  void show() {
    System.out.println("Child show method");
    super.show();
  }
}

class override {

  public static void main(String arg[]) {
    child c = new child();
    c.show();
  }
}
