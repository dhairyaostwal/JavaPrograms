class thiskey {

  int a;
  int b;

  // Parameterized constructor
  thiskey(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void display() {
    //Displaying value of variables a and b
    System.out.println("a = " + a + "  b = " + b);
  }

  public static void main(String[] args) {
    thiskey t = new thiskey(10, 20);
    thiskey u = new thiskey(100, 200);
    t.display();
    u.display();
  }
}

class thiskey1 {

  int a;
  int b;

  thiskey1() {
    this(10, 20);
    System.out.println("Inside  default constructor \n");
  }

  thiskey1(int a, int b) {
    this.a = a;
    this.b = b;
    System.out.println(a + b);
    System.out.println("Inside parameterized constructor");
  }

  public static void main(String[] args) {
    thiskey1 t = new thiskey1();
  }
}
