class student extends Thread {

  int amount = 2500; // total balance

  void withdraw(int amount){
      synchronized(this){
      System.out.println("Withdrawing...");
      if(this.amount<amount){
          System.out.println("Low Balance");
          try{
              wait();
          }
          catch(Exception e){          }
      }
      this.amount = this.amount - amount;
      System.out.println("--- Withdrawl Complete ---");
  }
}

synchronized void deposit(int amount){
    System.out.println("Going to deposit");
    this.amount = this.amount+amount;
    System.out.println("--- Deposit Complete ---");
    notify();
}   
}

class interth{
    public static void main(String args[]){
        student s = new student();
        new Thread(){
            public void run(){
                s.withdraw(1500);} // withdrawl #1
            }.start();
        new Thread(){
            public void run(){
             s.withdraw(1000);} // withdrawl #2
            }.start();
        
    }
}