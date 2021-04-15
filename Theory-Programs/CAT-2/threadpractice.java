class multipleOf3 extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("3 x " + i + " = " + 3 * i);
      try {
        sleep(3000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class multipleOf5 extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("5 x " + i + " = " + 5 * i);
      try {
        sleep(5000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class threadpractice {

  public static void main(String args[]) {
    multipleOf3 m1 = new multipleOf3();
    multipleOf5 m2 = new multipleOf5();
    m1.start();
    m2.start();
    System.out.println("Main Thread...");
  }
}


// output printed would be

/*

Main Thread...
5 x 1 = 5
3 x 1 = 3
3 x 2 = 6
5 x 2 = 10
3 x 3 = 9
3 x 4 = 12
5 x 3 = 15
3 x 5 = 15
5 x 4 = 20
5 x 5 = 25

*/