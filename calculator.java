import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double x;
        String y;
        double z;
        int q;

        System.out.println("This is the Calculator programme, Welcome");

        do {
            System.out.println("Enter the first number: ");
            x = sc.nextDouble();

            System.out.println("Enter the second number: ");
            z = sc.nextDouble();

            System.out.println("Enter either + , - , * , / : ");
            y = sc.next();
            if(z==0&& y.equals("/")){
                System.out.println("Error");
                break;
            }else {
                switch (y) {
                    case "+" -> System.out.printf("Answer is %f ", x + z);
                    case "-" -> System.out.printf("Answer is %f ", x - z);
                    case "*" -> System.out.printf("Answer is %f ", x * z);
                    case "/" -> System.out.printf("Answer is %f ", x / z);
                    default -> System.out.printf("Sorry but %s is not an option", y);
                }
                System.out.println("Would you like to do another calculation?\nenter 1 for yes \n2 for no ");
                q = sc.nextInt();
            }
        }while(q!=2);
    }
}
