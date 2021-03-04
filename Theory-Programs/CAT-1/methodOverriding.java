// Method overriding

class parent {

  parent() {
    System.out.println("Parent Constructor");
  }

  // use of final prevents overriding
  final void show() {
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
    // use of super keyword helps us access parent method
  }
}

class override {

  public static void main(String arg[]) {
    child c = new child();
    c.show();
  }
}
