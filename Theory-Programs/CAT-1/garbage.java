class garbage {

  public void finalize() {
    System.out.println("Object is garbage collected");
  }

  public static void main(String arg[]) {
    garbage g1 = new garbage();
    garbage g2 = new garbage();
    garbage g3 = new garbage();

    g1 = null;
    g2 = null;
    g3 = null;
    System.gc();
    System.out.println("SADF");
  }
}
