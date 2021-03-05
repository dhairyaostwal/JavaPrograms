package algorithm;

import java.util.*;

public class array {

  public static int a[] = new int[5];
  Scanner s = new Scanner(System.in);

  public void to_get() {
    System.out.println("Enter the value of n = ");
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }

    System.out.println("Elements of array = ");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
