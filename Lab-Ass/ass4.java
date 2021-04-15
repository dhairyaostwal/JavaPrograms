import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class vote {

  public static int c1 = 0, c2 = 0, c3 = 0;
  public static int arr[] = new int[270];
  public int result1 = 0;

  //   synchronized void update(int count) {
  //     this.count = this.count + 1;
  //   }

  public void random() {
    Random r = new Random();

    int sum = 0, result = 0;

    for (int i = 0; i < 270; i++) {
      int a = r.nextInt();
      arr[i] = a + 1;
      sum += arr[i];
    }

    if (sum < 0) {
      sum = sum * -1;
    }

    System.out.println("Sum = " + sum);

    while (sum != 0) {
      result += sum % 10;
      sum = sum / 10;
    }

    while (result != 0) {
      result1 += result % 10;
      result /= 10;
    }

    System.out.println("Vote = " + result1);
  }
}

class thread1 extends Thread {

  vote v = new vote();

  public void run() {
    if (v.result1 >= 0 && v.result1 <= 3) {
      v.c1 += 1;
      //   v.update(v.c1);
    }
  }
}

class thread2 extends Thread {

  vote v = new vote();

  public void run() {
    if (v.result1 >= 4 && v.result1 <= 7) {
      v.c2 += 1;
      //   v.update(v.c2);
    }
  }
}

class thread3 extends Thread {

  vote v = new vote();

  public void run() {
    if (v.result1 >= 8 && v.result1 <= 9) {
      v.c3 += 1;
      //   v.update(v.c3);
    }
  }
}

class ass4 {

  public static void main(String args[]) {
    vote v = new vote();

    v.random();
    System.out.println(v.result1);

    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    thread3 t3 = new thread3();

    t1.start();

    t2.start();

    t3.start();

    System.out.println("DMK Votes: " + v.c1);
    System.out.println("ADMK Votes: " + v.c2);
    System.out.println("BJP Votes: " + v.c3);

    if (v.c1 > v.c2 && v.c1 > v.c3) {
      System.out.println("DMK Wins! with a total votes of " + v.result1);
    } else if (v.c2 > v.c1 && v.c2 > v.c3) {
      System.out.println("ADMK Wins! with a total votes of " + v.result1);
    } else if (v.c3 > v.c1 && v.c3 > v.c2) {
      System.out.println("BJP Wins! with a total votes of " + v.result1);
    }
  }
}
