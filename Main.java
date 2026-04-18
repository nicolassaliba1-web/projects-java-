import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new  Scanner(System.in);
        int x;
        int a=0;
        int even=0;
        int[] teven= new int[10];

        do {
            System.out.println("Enter the size of te array that you want to fill: ");
            x = sc.nextInt();
        }while(x<1 || x>10);
        int [] t =new int[x];

        for(int i=0; i<t.length;i++) {
            System.out.println("Fill the array: ");
            t[i]= sc.nextInt();

        }
        System.out.println("The array is as follows: ");
        for(int i=0;i<t.length;i++) {
            System.out.println(t[i]);
            ;
        }
        for(int i=0;i<t.length;i++){
            int p=t[i];
            if(p%2==0){
                teven[i]= sc.nextInt();
            }
        }

    }
        }