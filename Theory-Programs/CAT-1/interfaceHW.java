interface area {
  int area();
}

interface volume extends area {
  void volume();
}

public class interfaceHW implements area, volume {

  int length = 5;
  int breadth = 4;
  int height = 3;

  public int area() {
    return (length * breadth);
  }

  public void volume() {
    System.out.println("Area: " + this.area());
    System.out.println("Volume: " + this.area() * height);
  }

  public static void main(String arg[]) {
    interfaceHW m = new interfaceHW();
    m.volume();
  }
}
