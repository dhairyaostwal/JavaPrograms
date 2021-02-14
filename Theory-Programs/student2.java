import java.util.*;

class student2 {

  String subject;
  int marks;
}

class perSubjectMarks {

  public static void main(String ar[]) {
    student2 st = new student2();
    int tot = 0;

    Scanner s = new Scanner(System.in);

    String subjectName[] = new String[10];
    int marksArray[] = new int[10];

    for (int i = 0; i < 5; i++) {
      System.out.println("Enter name of the subject: ");
      st.subject = s.next();
      subjectName[i] = st.subject;
      System.out.println("Enter the marks obtained in that subject: ");
      st.marks = s.nextInt();
      marksArray[i] = st.marks;
      s.nextLine();

      tot = tot + st.marks;
    }

    // printing out marks obtained per subject

    System.out.println("====================================");

    for (int i = 0; i < 5; i++) {
      System.out.println("Subject: " + subjectName[i]);
      System.out.println("Marks Obtained: " + marksArray[i]);
    }

    System.out.println("====================================");

    int avg = tot / 5;
    System.out.println("Total and Average marks are: " + tot + " " + avg);
  }
}
