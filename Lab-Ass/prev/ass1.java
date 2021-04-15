/*
Write a java program to implement the queue structure having an interface called queue, 
which is implemented in to two classes such as static queue and dynamic queue. 
The static queue have the size of the queue to be fixed by declaring it as final. 
Whereas the dynamic queue is to get the input from the user using scanner class, 
the size of the queue to proceed with the insert() and delete() operations on the 
above mentioned two classes.
*/

import java.util.*;

interface queue {
  void insertQueue();
  void deleteQueue();
}

// Static Queue

class staticQueue implements queue {

  final int n = 5;
  int j = 1;
  int a[] = new int[20];
  int m = n;

  public void insertQueue() {
    for (int i = 0; i < n; i++) {
      a[i] = i + 1;
    }
  }

  public void deleteQueue() {
    if (n == 0) {
      System.out.println("Queue Underflow");
    } else {
      for (int i = 0; i < n - 1; i++) {
        a[i] = a[i + 1];
      }
      m--;
    }
  }

  void show() {
    System.out.println("Elements in the array are : \n");
    for (int i = 0; i < m; i++) {
      System.out.println(a[i]);
    }
  }

  public static void main(String ar[]) {
    staticQueue s = new staticQueue();
    s.insertQueue();
    s.show();
    s.deleteQueue();
    s.show();
  }
}

// Dynamic Queue

class dynamicQueue implements queue {

  Scanner s = new Scanner(System.in);

  int n;
  int j = 1;
  int rearEnd = 0;

  void getCapacity() {
    System.out.println("Enter the size of the queue: ");
    n = s.nextInt();
  }

  int a[] = new int[20];

  public void insertQueue() {
    if (rearEnd == n) {
      System.out.println("Queue Overflow");
    } else {
      System.out.println("\n Enter elements in queue: \n");
      a[rearEnd] = s.nextInt();
      rearEnd++;
    }
  }

  public void deleteQueue() {
    if (n == 0) {
      System.out.println("Queue Underflow");
    } else {
      for (int i = 0; i < n - 1; i++) {
        a[i] = a[i + 1];
      }
      n--;
    }
  }

  void show() {
    System.out.println("Elements in the array are : \n");
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }

  public static void main(String arg[]) {
    dynamicQueue d = new dynamicQueue();
    d.getCapacity();
    d.insertQueue();
    d.insertQueue();
    d.insertQueue();
    d.insertQueue();
    d.insertQueue();
    d.show();
    d.deleteQueue();
    d.show();
  }
}
