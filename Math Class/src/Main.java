import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        double x = 3.14;
//        double y = 10;

//        double z = Math.max(x, y);
//        double z = Math.min(x, y);
//        double z = Math.abs(y);
//        double z = Math.sqrt(y);
//        double z = Math.round(x);
//        double z = Math.floor(x);

//        System.out.println(z);

        // Example Activity (Hypotenuse of a Triangle)

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Height of Triangle: ");
        double height = sc.nextDouble();
        System.out.println("Input the Base of Triangle: ");
        double base = sc.nextDouble();

        double hypotenuse = Math.sqrt((height * height) + (base * base));

        System.out.println("The hypotenuse of triangle is: " + hypotenuse);

        sc.close();
    }
}