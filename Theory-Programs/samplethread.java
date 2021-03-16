/*

// if entends Thread not provided then start() taken as simple method

class samplethread extends Thread {

  public void run() {
    System.out.println("Thread Started");
  }

  public static void main(String args[]) {
    samplethread sa = new samplethread();
    sa.start(); // start() enables exec. of thread
    // start() req. run()
    System.out.println("Main thread");
  } // main
} // class


*/

// Using Sleep() inside Thread class

class thread1 extends Thread {

  public void run() {
    try {
      sleep(5000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Thread1 Running...");
  }
}

class thread2 extends Thread {

  public void run() {
    try {
      sleep(3000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Thread2 Running...");
  }
}

class samplethread {

  public static void main(String args[]) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    t1.start();
    t2.start();
    // t1.start(); // you cannot restart already runnable state
    System.out.println("Main Thread...");
  }
}
// Thr following would be a simple java program
/*

class thread1 {

  public void run() {
    System.out.println("Thread1 Running...");
  }
}

class thread2 {

  public void run() {
    System.out.println("Thread2 Running...");
  }
}

class samplethread {

  public static void main(String args[]) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    t1.run();
    t2.run();
    System.out.println("Main Thread...");
  }
}

*/
