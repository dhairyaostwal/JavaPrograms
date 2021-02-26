package university;

import school.student;
import school.teacher;

public class academic {

  public int semester;
  public int semCourseCredits;
  public String semModeOfExam;

  public academic() {
    this.semester = 1;
    this.semCourseCredits = 23;
    this.semModeOfExam = "Offline - University";
  }

  public void showAcadDetails(){
      System.out.println("\nAcademic Details: \nSemester: "+semester+"\nCourse Credits(Min): "+semCourseCredits+"\nMode of Exam: "+semModeOfExam+"\n");
  }

  public static void main(String args[]) {
    student s1 = new student();
    student s2 = new student();
    s1.stuID = 1;
    s1.stuName = "Dhairya";
    s1.marksObtained = 99;
    s2.stuID = 2;
    s2.stuName = "Gaurav";
    s2.marksObtained = 95;

    teacher t1 = new teacher();
    teacher t2 = new teacher();
    t1.teacherID = 5;
    t1.teacherName = "DelhiBabu Sir";
    s1.display();
    t1.display();
    academic a1 = new academic();
    a1.semester=3;
    a1.semCourseCredits=25;
    a1.semModeOfExam="Online - CodeTantra";

    a1.showAcadDetails();

    s2.display();
    t2.display();

    academic a2 = new academic();
    a1.showAcadDetails();
  }
}
