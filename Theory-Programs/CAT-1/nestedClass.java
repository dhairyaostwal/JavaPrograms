class school {

  void outerOP() {
    System.out.println("Output: Outer class");
  }

  class kindergarden {

    void innerOP() {
      System.out.println("Output: Inner class");
    }
  }
}

class nestedMain {

  public static void main(String arg[]) {
    school s = new school();
    s.outerOP();
    school.kindergarden kg = s.new kindergarden();
    kg.innerOP();
  }
}
