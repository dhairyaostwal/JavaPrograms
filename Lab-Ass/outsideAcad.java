import university.academic;

public class outsideAcad {

  public static void main(String args[]) {
    academic a = new academic();
    a.showAcadDetails();

    academic a3 = new academic();
    a3.semester = 4;
    a3.semCourseCredits = 27;
    a3.semModeOfExam = "Online - NEWW--CodeTantra";

    a3.showAcadDetails();
  }
}
