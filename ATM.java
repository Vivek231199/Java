import java.util.InputMismatchException;
import java.util.Scanner;
class ATM{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Pin:");
        int pin = sc.nextInt();
        int store_pin = pin;
        System.out.println(pin);
        if(pin == store_pin){
            double current_balance = 50000;
            boolean keepRunning = true;
            while(keepRunning){
                System.out.println("O.Current Balance");
                System.out.println("1.Deposit");
                System.out.println("2.Check Balance");
                System.out.println("3.Credite Amount");
                System.out.println("4.Exit");
                System.out.println("Select Service options");
                try {
                    Scanner service_option = new Scanner(System.in);
                    int service_option_choice = service_option.nextInt();
                    switch(service_option_choice){
                        case 0: System.out.println("Change pin option is selected...");
                                System.out.println("your current pin is:" + pin);
                                Scanner new_pin_scan = new Scanner(System.in);
                                int new_pin = new_pin_scan.nextInt();
                                System.out.println("Your new pin is:" + new_pin);
                                pin = new_pin;
                                store_pin = pin;
                                System.out.println("your new pin after change" + pin);
                                break;
                    
                        case 1: System.out.println("Deposit option is selected...");
                                // int current_balance = 50000;
                                System.out.println("Before Deposit amount is:" + current_balance);
                                try {
                                    System.out.println("Enter Deposited amount:");
                                    Scanner amount_deposit = new Scanner(System.in);
                                    double amount_to_decrease = amount_deposit.nextDouble();
                                    System.out.println("Your Deposited amont is:" + amount_to_decrease);
                                    if(amount_to_decrease > current_balance){
                                        System.out.println("Please Enter amount is lessthan current balance");
                                        break;
                                    }
                                    current_balance = current_balance - amount_to_decrease;
                                    System.out.println("After Deposit amount current balance is:" + current_balance);
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("mismatch integer");
                                }
                                

                        case 2: System.out.println("Check Balance option is selected...");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("Current Balance is:" + current_balance);
                                System.out.println("-------------------------------------------------------------------------------------------");
                                break;

                        case 3: System.out.println("Credite option is selected...");
                                System.out.println("Before Credited amount is:" + current_balance);
                                try {
                                    System.out.println("Enter Credite amount:");
                                    Scanner amount_credite = new Scanner(System.in);
                                    
                                    double amount_to_increase = amount_credite.nextDouble();
                                    System.out.println("Your Credited amount is:" + amount_to_increase);
                                    current_balance = current_balance + amount_to_increase;
                                    System.out.println("After Credited amount current balance is:" + current_balance);
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("mismatch integer");
                                }
                                
                               
                        
                        case 4: 
                                keepRunning = false;
                                break;
                        
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("That is not valid integer");
                }
                 

            }
            
        }
    }
}