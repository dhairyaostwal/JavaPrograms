class finalmain {

  static final int finvar = 100;

  //   final int finvar = 100;

  void getData() {
    // finvar = 2000; // you cannot assign a value to final variable finvar
    System.out.println(finvar);
  }
}

class finMain {

  public static void main(String ar[]) {
    finalmain fm = new finalmain();
    System.out.println(fm.finvar);
  }
}
