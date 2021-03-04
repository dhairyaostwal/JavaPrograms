class sport {

  String name = "Hockey";
  int players;
  int year;

  sport() {
    name = "Default Name";
    System.out.println("Default Constructor"); // Default Constructor
  }

  sport(String name, int players, int year) {
    System.out.println(name + " " + players + " " + year);
  }

  void show() {
    System.out.println("Welcome");
  }

  // Copy Constructor
  sport(sport sportDetails) {
    name = sportDetails.name;
    players = sportDetails.players;
    year = sportDetails.year;

    System.out.println(name + " " + players + " " + year);
  }
}

class sportMain {

  public static void main(String ar[]) {
    sport s = new sport("Cricket", 11, 2021);
    sport s1 = new sport(); // Default Constructor called. No values assigned
    sport s2 = new sport(s); // Copy Constructor called
    s.show();
    s2.show();
    System.out.println(s2.name);
    sport s3 = s1; // Another way of Copy Constructor being called
    System.out.println(s3.name);
  }
}
