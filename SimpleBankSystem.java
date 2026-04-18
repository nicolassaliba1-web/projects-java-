import java.util.Scanner;
public class SimpleBankSystem {
    //First the menu.
    public static void showBalance(double balance){

        System.out.printf("Your balance is equal to %.2f\n",balance);
    }

    public static void main(String[]args){
        double balance=0;
        double withdraw;
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the 'Simple bank system programme'");
        do {
            System.out.println("Choose the option that corresponds to the action that you'd like to do: ");
            System.out.println();
            System.out.println("Deposit?: 1");
            System.out.println("Withdraw?: 2");
            System.out.println("Check balance?: 3");
            System.out.println("EXIT?: 4");
            System.out.println("Just type the number of the option you want: ");
            choice = sc.nextInt();
            if (choice == 1) {
                do {
                    System.out.println("Amount to be deposited: ");
                    balance = sc.nextDouble();
                }while(balance<=0);

            }
            else if (choice == 2) {
                System.out.println("Amount to be withdrawn: ");
                withdraw = sc.nextDouble();
                balance = balance - withdraw;
            } else if (choice == 3) {
                showBalance(balance);
            }
        }while(choice != 4 );

    }
}

