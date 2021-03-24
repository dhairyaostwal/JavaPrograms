// Thread Practice

class pt1 extends Thread {

  public void run() {
    System.out.println("Thread Started...");
  }

  public static void main(String args[]) {
    pt1 p = new pt1();
    p.start();
    System.out.println("Main Thread");
  }
}

class pt21 extends Thread {

  public void run() {
    try {
      sleep(3000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Thread1 Running...");
  }
}

class pt22 extends Thread {

  public void run() {
    try {
      sleep(3000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Thread2 Running...");
  }
}

class pthread {

  public static void main(String args[]) {
    pt21 p21 = new pt21();
    pt22 p22 = new pt22();
    p21.start();
    p22.start();
    System.out.println("Finished Main...");
  }
}
