class runnable implements Runnable {

  public void run() {
    System.out.println("Thread is running");
  }

  public static void main(String args[]) {
    runnable m1 = new runnable();
    Thread t1 = new Thread(m1);
    t1.start();
    Thread t2 = new Thread(m1);
    t2.start();
  }
}

class threadrunnable extends Thread {

  public void run() {
    System.out.println("Thread is running");
  }

  public static void main(String args[]) {
    threadrunnable t1 = new threadrunnable();
    t1.start();
  }
}
