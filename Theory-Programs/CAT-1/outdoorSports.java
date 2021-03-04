import SportsCompany.sports;

class outdoorSports implements sports {

  public void players(String game, int numOfPlayers) {
    System.out.println(game + " " + numOfPlayers);
  }
}

class innerSports implements sports {

  public void players(String game, int numOfPlayers) {
    System.out.println(game + " " + numOfPlayers);
  }
}

class SportsMain {

  public static void main(String arg[]) {
    outdoorSports o = new outdoorSports();
    innerSports i = new innerSports();
    o.players("Tennis", 4);
    o.players("Cricket", 11);
    i.players("Chess", 2);
    i.players("Piano", 2);
  }
}
