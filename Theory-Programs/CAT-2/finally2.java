// class finnaly2 {

//   public static void main(String args[]) {
//     try {
//       int a = 10, b = 0, c;
//       c = a / b;
//       System.out.println(c);
//     } catch (Exception e) {
//       System.out.println(e);
//     }
//     System.out.println("program continues...");
//   }
// }

class finally2 {

  public static void main(String args[]) {
    try {
      try {
        int a[] = new int[10];
        a[23] = 45;
      } finally {
        int a = 10, b = 0;
        int c = a / b;
        System.out.println(c);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("program continues...");
  }
}
