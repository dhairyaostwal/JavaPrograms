class player {

  int regNo;
  String name;
  String team;

  player() {
    regNo = 21;
    name = "Virat Kohli";
    team = "India";

    System.out.println("Default Details: \n" + regNo + name + team);
  }

  void printData() {
    System.out.println("On Printing Details: \n" + regNo + name + team);
  }

  // parametrized constructor
  player(int regNo, String name, String team) {
    this.regNo = regNo;
    this.name = name;
    this.team = team;
    System.out.println(
      "Given values as parameter: " + regNo + " " + name + " " + team
    );
  }

  // copy constructor
  player(player playerDetails) {
    regNo = playerDetails.regNo;
    name = playerDetails.name;
    team = playerDetails.team;

    System.out.println("\nCopy Constructor Details: " + regNo + name + team);
  }
}

class constructor2 {

  public static void main(String ar[]) {
    player p = new player();
    player p1 = new player(7, "MS Dhoni", "India");

    player p2 = new player(p);
    // p.printData();
  }
}
