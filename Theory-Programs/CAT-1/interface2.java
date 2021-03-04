interface audio {
  void listen();
}

interface video {
  void show();
}

class movie implements audio, video {

  public void listen() {
    System.out.println("Awesome song!");
  }

  public void show() {
    System.out.println("Excellent scene");
  }
}

class multiInher {

  public static void main(String arg[]) {
    movie m = new movie();
    m.show();
    m.listen();
  }
}
