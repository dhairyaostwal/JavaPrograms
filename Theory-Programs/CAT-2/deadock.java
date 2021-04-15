class deadlock {

  public static void main(String args[]) {
    final String a = "Printer 1";
    final String b = "Printer 2";

    Thread t1 = new Thread() {
      public void run() {
        synchronized (a) {
          System.out.println("Person 1: Locked Printer 1");
          try {
            Thread.sleep(100);
          } catch (Exception e) {
            System.out.println(e);
          }
        }

        synchronized (b) {
          System.out.println("Person 1: Locked Printer 2");
        }
      }
    };

    Thread t2 = new Thread() {
      public void run() {
        synchronized (a) {
          System.out.println("Person 2: Locked Printer 1");
        }

        synchronized (b) {
          System.out.println("Person 2: Locked Printer 2");
          try {
            Thread.sleep(100);
          } catch (Exception e) {
            System.out.println(e);
          }
        }
      }
    };
  }
}
