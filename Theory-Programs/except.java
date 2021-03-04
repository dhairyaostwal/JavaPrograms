class exp1 {

  public static void main(String args[]) {
    try {
      int a = 50 / 0;
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("lines of code continues"); // will not be printed if exception not handled
  }
}

class exp2 {

  public static void main(String args[]) {
    try {
      String s = "hello";
      int a[] = new int[5];
      a[5] = Integer.parseInt(s); // this creates exception
    } catch (ArrayIndexOutOfBoundsException e) { // exception doesn't have any prioritisation
      System.out.println("\nArray Index: " + e);
    } catch (NumberFormatException e) {
      System.out.println("\nNumber format: " + e);
    } catch (Exception e) {
      System.out.println("\n" + e);
    }
    System.out.println("\nlines of code continues"); // will not be printed if exception not handled
  }
}

class exp3 {

  public static void main(String args[]) {
    try {
      try {
        String s = "helo";
        int a = Integer.parseInt(s);
      } catch (NumberFormatException e) {
        System.out.println("\nNumber Format: " + e);
      }

      try {
        int a[] = new int[5];
        a[5] = 100;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("\nArray Index: " + e);
      }
    } catch (Exception e) {
      // System.out.println("\nException:\n" + e);
      System.out.println("General exeception.....");
    }
    System.out.println("\nprogram continues...");
  }
}

// class exp3
// {​​​​
//   public static void main(String args[]){​​​​
//   try{​​​​
//   String a =1;
// }
// ​​​​catch(Exception e)
// {​​​​
// System.out.println("General exeception.....");
// }​​​​
// System.out.println("\nprogram continues...");
// }​​​​
// }​​​​
// try
// {​​​​
// String s = "helo";
// int a = Integer.parseInt(s);
// }​​​​ catch (NumberFormatException e ){​​​​
// System.out.println("\nNumber format:"+e);
// }​​​​
// try
// {​​​​
// int a[] = new int[5];
// a[5]= 100;
// }​​​​catch(ArrayIndexOutOfBoundsException e)
// {​​​​
// System.out.println("\nArray index: "+e);
// }​​​​
