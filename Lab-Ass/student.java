/*
3. 
Create two classes student and teacher (as two files) in a package school.
Write atleast one method and a constructor. Create a class academic in a
package university. Include student, teacher objects in academic. Add two
instance variable and methods in academic. Show the academic details of the
university from inside the package and outside the package

*/

package school;

public class student {
    public int stuID;
    public String stuName;
    public int marksObtained;

  public student() {
    this.stuID = 1;
    this.stuName = "Ram";
    this.marksObtained = 35;
  }

  public void display() {
    System.out.println("Student details:" +"\nStudentID: " + stuID +"\nStudentName: " +stuName +"\nMarks Obtained by Student: " +marksObtained);
  }
}
