class mensuration {

  interface area {
    void area();
  }

  interface volume {
    void volume();
  }
}

public class interfaceHW implements mensuration.area, mensuration.volume {

  int length = 5;
  int breadth = 4;
  int height = 3;

  public void area() {
    System.out.println("Area: " + length * breadth);
  }

  public void volume() {
    System.out.println("Volume: " + length * breadth * height);
  }

  public static void main(String arg[]) {
    interfaceHW m = new interfaceHW();
    m.area();
    m.volume();
  }
}
