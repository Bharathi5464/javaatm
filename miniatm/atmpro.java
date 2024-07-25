package atmproject;

import java.util.*;

public class atmpro {
    

    public static void main(String args []) {
        
        int pin = 123;
        int balance = 15000;

        int Addamount = 0;
        int withdrawal = 0;

        // user detailes
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your pin number : ");
            int password = scanner.nextInt();

            if (password == pin) {
                System.out.println("Enter your name : ");
                name = scanner.next();
                System.out.println("Welcom !!" + name);

                while (true) {
                    System.out.print("press 1 to Check your Balance : ");
                    System.out.print("press 2 to  Add Amount : ");
                    System.out.print("press 3 to Withdrawal : ");
                    System.out.print("press 4 to get your Recipt : ");
                    System.out.print("press 5 to Exit : ");

                    int opts = scanner.nextInt();
                    switch (opts) {
                        case 1:
                            System.out.println("your current Balances is : " + balance);
                            break;
                        case 2:
                            System.out.print("How much Amount you want to Add to your Bank Accont : ");
                            Addamount = scanner.nextInt();
                            System.out.println(" Successfully Credited :) !!");
                            balance = balance + Addamount;
                            System.out.print(" Your Balance : " + balance);
                            break;
                        case 3:
                            System.out.print("Enter Withdrawal Amount : ");
                            withdrawal = scanner.nextInt();
                            if (withdrawal > balance) {
                                System.out.println("your Balance is InSufficient " + balance + " : Current Balance");
                                System.out.println("Try less than : " + balance);
                            } else {
                                System.out.println("Withdrawal Successfully ");
                                balance = balance - withdrawal;
                                System.out.println(" your Current Balance  " + balance);
                            }
                            break;
                        case 4:
                            System.out.println("Welcome to Growmore ATM...");
                            System.out.print("Availabel balance    : " + balance);
                            System.out.print("Withdrawal Amount    : " + withdrawal);
                            System.out.println(" Deposited Amount  : " + Addamount);
                            System.out.println(" Thank you \n    visit Again :) ");
                            break;

                        default:
                            System.out.println(" Enter the Number below 5.");
                            break;
                    }
                    if (opts == 5) {
                        System.err.println("Thank you .");
                    }

                   }

                }
             else
             {
                System.out.println("Wrong pin Number ");
            }
        }
    }

}
