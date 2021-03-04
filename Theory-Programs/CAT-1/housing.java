/*
Write a java program to create a class called as housing which takes the input as housing type - "independent", "duplex", "villa" etc.
size of the house as 2345 sq ft etc
price - Rs.456.67

create a method called getdetails() from the user
create another method called pricecal() to calculate the price of a house.

on considering the price value you have say buying which type of house is better.

ie if the sqft is high and the price is less then it is better house
ex. sqft = 3000 price/sqft = 100
then total = 3000*100 = 300000 (cheap)

sqft = 600 price/sqft=3500
then total 600*3500 = 2100000 (costly)

*/
class housing{
  int sqft = 0;
  int pricePerSqft = 0;
  int price = 0;

  void getDetails(String type, int squareFeet, int pPS){
      sqft = squareFeet;
      pricePerSqft = pPS;
  }

    void priceCal(){
        price = sqft*pricePerSqft;
        System.out.println("Price = "+price);
   } 

  void verdict(){
      if(pricePerSqft<sqft){
          System.out.println("Cheap House");
      }
      else{
          System.out.println("Costly House");
      }

  }   
}

class housing2{
    public static void main(String a[]){
        housing h = new housing();
        h.getDetails("Independent", 3000, 100);
        h.priceCal();
        h.verdict();
    }
}