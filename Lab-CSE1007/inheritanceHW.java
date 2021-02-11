/* create a single inheritance java program to implement the concept of train details

parent train - long train details
child train - short train details

output - report of all the trains between some route
*/

class parentTrain {

  int trainID = 1001;
  float ticketPrice = 1234.56f;
  String trainName = "Delhi2Chennai";
}

class childTrain extends parentTrain {

  String midDestination = "Katpadi";
  int stops = 5;
}

class sinher {

  public static void main(String ar[]) {
    childTrain c = new childTrain();
    childTrain c1 = new childTrain();
    childTrain c2 = new childTrain();
    c1.trainName = "SampleTrainName";
    c1.midDestination = "Pritampur";
    c1.trainID = 1234;

    if (c1.midDestination != "Katpadi") {
      System.out.println(c1.trainName + " " + c1.trainID);
    }

    System.out.println(c.trainName);
  }
}
