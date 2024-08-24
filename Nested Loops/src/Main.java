import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // nested loop = a loop inside a loop

        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter # of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter symbol to used: ");
        symbol = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for(int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }


    }
}