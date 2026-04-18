import java.util.Random;
import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class NumberGuesser {

    public static void main(String[]args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String b="no";
        System.out.println("Welcome to the very first and original game of number guessing game: ");
        System.out.println();
        do {
            int guess;
            double ran;
            int a;
            int attempt = 0;

            System.out.println("Enter the range of numbers you want to have (Ps: it can't be a negative or decimal number: )");
            a = sc.nextInt();
            ran = Math.round(Math.random() * a);
            System.out.println();
            do {
                System.out.printf("Take a guess hint(The number is a whole number between 0(it can be 0) and %d: )", a);
                guess = sc.nextInt();
                if(guess>ran){
                    System.out.println("Too high try lower");
                    System.out.println();
                }
                else if(guess<ran){
                    System.out.println("Too low try higher");
                    System.out.println();
                }
                attempt += 1;

            } while (guess != ran);
            System.out.println();
            System.out.printf("Congrats you got the answer correct! It was in fact %.0f good job!!\nAnd it only took you %d trys", ran, attempt);
            System.out.println();
            System.out.println("Would you like to play again?: ");
            b = sc.next();
            b=b.toLowerCase();
        } while (b.equals("yes") || b.equals("yeh") || b.equals("yep") || b.equals("yup") || b.equals("y") || b.equals("ye") );
    }

}
//no AI was used to make this code, Made by NS a human.