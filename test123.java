import java.util.Scanner;
public class test123 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n,max ;
        do {
            System.out.println("Enter the size of the array that you want");
            n = sc.nextInt();
        } while (n < 2 );
        int[][] t = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Now fill the array each number one by one: ");
                t[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("THE answer is "+t[i][j]+"\t");

            }
            System.out.println();
        }

        max=t[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    if(t[i][j]>max){
                        max=t[i][j];
                    }
                }
            }
        }
        System.out.println("The maximum in the main diagnose is "+max);
    }
    }

