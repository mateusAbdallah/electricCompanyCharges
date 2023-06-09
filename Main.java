import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double unitsConsumed;
       int selection;
       
       //Getting the number of units consumed
       //And computing the total bill amount
       
       System.out.println("Enter the number of units consumed do you have:");
       unitsConsumed = input.nextInt();
       if(unitsConsumed <= 200){
           unitsConsumed *= 2.5;
           System.out.println("The total bill amount is $"+ unitsConsumed);
       } else if (unitsConsumed>=201 && unitsConsumed<=500) {
           unitsConsumed *= 3.5*2.5;
           System.out.println("The total bill amount is $"+ unitsConsumed);
       } else if (unitsConsumed >= 501){
           unitsConsumed *= 5*3.5*2.5;
           System.out.println("The total bill amount is $"+ unitsConsumed);
       }
       
       //Analyzing if the bill will be paid within 15 days or after 15 days
       
       System.out.println("Do you going to pay within 15 days?");
       System.out.println("1 - Yes");
       System.out.println("2 - No");
       selection = input.nextInt();
       while (selection <= 0 || selection > 2){
           System.out.println("Please select the correct option");
           selection = input.nextInt();
       }
        if(selection == 1) {
            discount10(unitsConsumed);

        } else if (selection == 2) {
            surCharge5(unitsConsumed);
        }
    }

    //Method to compute the discount of 10%
    
    private static void discount10(double unitsConsumed){
    	System.out.println("---------------");
        System.out.println("Payment within 15 days will have a discount of 10%");
        double discount = unitsConsumed * 0.1;
        double adjustedBill = unitsConsumed - discount;
        System.out.println("So the total bill adjusted with discount is $"+ adjustedBill);
        System.out.println("---------------");
    }
    
    //Method to compute the surcharge of 5%

    private  static void surCharge5(double unitsConsumed){
    	System.out.println("---------------");
        System.out.println("Payment after 15 days will have a surcharge of 5%");
        double surCharge = unitsConsumed * 1.05;
        System.out.println("So the total bill adjusted with surcharge is $" + surCharge);
        System.out.println("---------------");
    }
}
