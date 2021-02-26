package school;

public class teacher {

  public int teacherID = 1;
  public String teacherName;

  public teacher() {
    this.teacherID = 1;
    this.teacherName = "Akila V";
  }

  public void display() {
    System.out.println("Invigilator details: " + teacherID + " " + teacherName);
  }
}
