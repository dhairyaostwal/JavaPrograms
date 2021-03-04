import java.lang.String;

class string1 {

  public static void main(String args[]) {
    String a = "C++";
    a = "Java";
    // a.concat(" Programming"); // string in Java is immutable
    a = a.concat(" Programming");
    System.out.println(a);
  }
}
