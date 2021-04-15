package algorithm.manipulation;

import algorithm.*;
import java.util.*;

public class search extends array {

  public void search(int a[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter key value: ");
    int key = s.nextInt();
    for (int i = 0; i < a.length; i++) {
      if (a[i] == key) {
        System.out.println("Found at pos: " + i);
      }
    }
  }

  public static void main(String args[]) {
    search d = new search();
    d.to_get();
    d.search(a);
  }
}

