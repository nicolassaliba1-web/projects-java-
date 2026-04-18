import java.util.Scanner;
public class symbol_printer {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        String symbol;
        System.out.println("Welcome to the symbol printer program :");
        System.out.println();
        System.out.println("What would you like to print out?: ");
        symbol= scan.nextLine();
        System.out.println("For how many rows: ?");
        int row=scan.nextInt();
        System.out.println("For how many columns: ?");
        int col=scan.nextInt();

        for(i=1;i<=col;i++){
            System.out.println();
            for(j=1;j<=row;j++){
                System.out.print(symbol+" ");
            }

        }
//This program was made by a human, by NS.
    }
}