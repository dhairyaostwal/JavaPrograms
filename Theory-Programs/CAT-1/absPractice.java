class check{
  System.out.println("Checking");
}


abstract class animal {

  public abstract void sound();

  public void sleep() {
    System.out.println("zZZ");
  }

  animal() {
    System.out.println("Constructor of abstract class");
  }

  public static void main(String ar[]){
    check c = new check();
    System.out.println("Abstract Main");
  }
}

class pig extends animal {

  public void sound() {
    System.out.println("oink");
  }
}

class absPracticeMain {

  public static void main(String ar[]) {
    pig p = new pig();
    p.sound();
    p.sleep();
  }
}
