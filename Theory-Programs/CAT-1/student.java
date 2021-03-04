import java.util.*;

class student {

  String stuname;
  int mark[] = new int[10];
}

class averageCal {

  public static void main(String ar[]) {
    int tot = 0;
    student st = new student();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter name of the student: ");
    st.stuname = s.nextLine();
    System.out.println("Enter the marks of five subjects: ");
    for (int i = 0; i < 5; i++) {
      st.mark[i] = s.nextInt();
      tot = tot + st.mark[i];
    }
    int avg = tot / 5;
    System.out.println(st.stuname + " Total and Average is " + tot + " " + avg);
  }
}
