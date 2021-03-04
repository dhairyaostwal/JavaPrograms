class autoun {

  public static void main(String args[]) {
    Integer i = new Integer(10); // Wrapper class type
    int j = i; // Primitive type
    System.out.println("Value of i: " + i);
    System.out.println("Value of j: " + j);

    // Unboxing

    // Character a = 'A'; 
    // char c = a; 

    // Autoboxing

    char a = 'A';
    Character c = a;

    System.out.println("Value of a: " + a);
    System.out.println("Value of c: " + c);
  }
}
