import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for loop = executes a block of code a limited amount of times

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

//        for (int i = 0; i <= number; i++) {
//            System.out.println("Number: " + i);
//        }

        for (int i = number; i >= 0; i--) {
            System.out.println("Countdown: " + i);
        }

        System.out.println("Happy new year!");

        sc.close();
    }
}