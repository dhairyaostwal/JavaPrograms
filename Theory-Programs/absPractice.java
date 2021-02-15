abstract class animal {

  public abstract void sound();

  public void sleep() {
    System.out.println("zZZ");
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
