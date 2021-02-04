import java.util.Scanner;

public class simpleInterest{
    String name;
    int age;
    float priAmt;
    float years;
    float rateOfInt;

    void getDetails(){
        System.out.println("Enter details:");
        Scanner s = new Scanner(System.in);
        name = s.next();
        age=s.nextInt();
        priAmt=s.nextFloat();
        years=s.nextFloat();
        rateOfInt=s.nextFloat();
    }

    void calculate(){
        float si = (priAmt*years*rateOfInt)/100;
        System.out.println("SI of "+ name + " is " + si);
    }

    public static void main(String a[]){
        simpleInterest s = new simpleInterest();
        s.getDetails();
        s.calculate(); 
    }
}
