class parentemp {

  int empid = 1001;
  float salary = 43.56f;
  String ename = "Ram";
}

class childemp extends parentemp {

  String destination = "Jaipur";
  int age = 45;
}

class sinher {

  public static void main(String ar[]) {
    childemp c = new childemp();
    System.out.println(c.empid);
    System.out.println(c.ename);
  }
}
