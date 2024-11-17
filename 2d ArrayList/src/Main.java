import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2d ArrayList = a dynamic list of lists
        // You can change the size of these list during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

//        System.out.println(bakeryList);
//        System.out.println(bakeryList.get(0));

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.getFirst());
        System.out.println(groceryList.getFirst().getFirst());

    }
}