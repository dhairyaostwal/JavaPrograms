package algorithm.manipulation;

import algorithm.*;

public class sort extends array {

  public void sort(int a[]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    System.out.println("\n\nArray elements are: ");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  public static void main(String args[]) {
    sort c = new sort();
    c.to_get();
    c.sort(a);
  }
}
