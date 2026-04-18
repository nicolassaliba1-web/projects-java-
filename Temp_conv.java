import java.util.Scanner;
public class Temp_conv {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double C;
        double F;
        double K;
        int b;
        int c;
        System.out.println("Please enter the temperature without worrying about the unit for now: ");
        double a= sc.nextDouble();
        do {
            System.out.println("Enter the unit of measurement that you'd like to start with\n 1 for Celsius\n 2 for Fahrenheit\n 3 for kelvin ");
            b = sc.nextInt();
            System.out.println("Now enter the second unit of measurement that you'd like to be converted to:\n 1 for C\n 2 for F \n 3 for K ");
            c=sc.nextInt();

            if (b== 1 && c==2){
                double CF= (a * 9/5) + 32 ;
                System.out.printf("The output is %f",CF);

            }
            else if(b==2 && c==1){
                double FC= (a - 32) * 5/9;
                System.out.printf("The output is %.2f",FC);
            }
            else if(b==3 && c==1){
                double KC= a - 273.15;

                System.out.printf("The output is %.2f",KC);
            }
            else if(b==1 && c==3){
                double CK= a + 273.15;
                System.out.printf("The output is %.2f",CK);
            }
            else if(b==3 && c==2) {
                double KF = (a - 273.15) * 9 / 5 + 32;
                System.out.printf("The output is %.2f", KF);
            }
            else if(b==2 && c==3) {
                    double FK = (a - 32) * 5 / 9 + 273.15;
                    System.out.printf("The output is %.2f", FK);
                }
        }while(b!=1 && b!=2 && b!=3);



    }
}
