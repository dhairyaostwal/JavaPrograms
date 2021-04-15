// to list all the file in the directoryjav
import java.io.*;

class io2 {

  public static void main(String[] args) {
    File f = new File("Users/dhairyaostwal/Desktop/Academics/");
    String filenames[] = f.list();
    for (String filename : filenames) {
      System.out.println(filename);
    }
  }
}
