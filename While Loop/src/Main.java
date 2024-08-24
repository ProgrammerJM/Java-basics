import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true

        Scanner sc = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter you name");
            name = sc.nextLine();
        }

        System.out.println("Hello " + name);

        sc.close();
    }
}