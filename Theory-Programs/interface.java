// create an interface called application where courses are abstract methods tobe
// used by 2 or more students to give their details

// application is abstract; cannot be instantiated

// all methods declared inside interface are abstract

interface application {
  void appTemplate(); // abstract method
}

class student1 implements application {

  public void appTemplate() { // use of public mandatory
    System.out.println("BTech Application");
  }
}

class student2 implements application {

  public void appTemplate() {
    System.out.println("MTech Application");
  }
}

class interfaceMain{
    public static void main(String arg[]){
        // application ap = new application();
        student1 s1 = new student1();
        student2 s2 = new student2();

        s1.appTemplate();
        s2.appTemplate();
    }
}