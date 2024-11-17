import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexible

//      String[] animals = {"Cat", "Dog", "Rat", "Bird"};
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");

        for (String animal : animals) {
            System.out.println(animal);
        }

    }
}