import java.io.*;

public class writeFile {

  public static void main(String args[]) {
    try {
      FileOutputStream fw = new FileOutputStream("one.txt");
      fw.write("Hi my name is Dhairya Ostwal\nCSE, VIT'23".getBytes());
      fw.close();
      System.out.println("File written");
    } catch (Exception e) {
      System.out.println("Error occured");
    }
  }
}
