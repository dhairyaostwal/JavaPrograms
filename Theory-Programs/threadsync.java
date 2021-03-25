class multi {

  synchronized void multiplication(int n) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(n + " x " + i + " = " + n * i);
      try {
        Thread.sleep(400);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class thread1 extends Thread {

  multi m;

  thread1(multi t) {
    this.m = t;
  }

  public void run() {
    m.multiplication(5);
  }
}

class thread2 extends Thread {

  multi m;

  thread2(multi t) {
    this.m = t;
  }

  public void run() {
    m.multiplication(10);
  }
}

class threadsync {

  public static void main(String aa[]) {
    multi m = new multi();
    thread1 t1 = new thread1(m);
    thread2 t2 = new thread2(m);
    t1.start();
    t2.start();
  }
}
