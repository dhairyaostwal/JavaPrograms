import java.lang.StringBuilder;

class stringBuild {

  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("Welcome");
    sb.replace(1, 4, "Java");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.delete(1,4);
    System.out.println(sb);
    sb.insert(0,"Geeks for Geeks + ");
    System.out.println(sb);
  }
}
