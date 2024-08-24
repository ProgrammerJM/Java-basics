import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* logical operators = used to connect two or more expressions
         * && = (AND) both conditions must be true
         * || = (OR) either condition must be true
         * ! = (NOT) reverses boolean value of condition
         */

//        FOR AND OPERATOR

//        int temp = 15;
//
//        if (temp > 30) {
//            System.out.println("It is hot outside");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("It it warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }

//        FOR OR OPERATOR
        Scanner sc = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = sc.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }

//      FOR NOT OPERATOR
//        if(!response.equals("q") && !response.equals("Q")) {
//            System.out.println("You are still playing the game");
//        } else {
//            System.out.println("You quit the game");
//        }


        sc.close();
    }
}