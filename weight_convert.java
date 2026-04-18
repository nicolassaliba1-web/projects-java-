import java.util.Scanner;
public class weight_convert {
    public static void main(String[]args){
        double p;
        double r;
        double n;
        double t;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle(aka: the amount you started with): \n");
        p= sc.nextDouble();

        System.out.print("Enter the interest rate by percentage(example: 4): \n");
        r = sc.nextDouble();
        r= r/100;
        System.out.print("Enter the amount of years that you will leave the money without changing anything about the amount or anything else: \n");
        t= sc.nextDouble();

        System.out.print("Enter the number of times it's compounded per year(aka: the amount of times it increases): \n");
        n = sc.nextDouble();

        double A=(p*Math.pow((1+r/n),n*t));
        System.out.printf("The total amount compounded is %.3f: \n", A);

    }
}
