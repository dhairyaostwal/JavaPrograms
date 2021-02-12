class absclass {

  abstract void show() {
    System.out.println("Show Method");
  }

  abstract void display();
}

class absMain{
    public static void main(String arg[]){
        absclass a = new absclass();
        a.show();
    }
}

// 1 how to access concrete methods in abstract class
// 2 how to give body to nonConcrete methods(only method declaration without body)