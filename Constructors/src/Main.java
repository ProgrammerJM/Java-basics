public class Main {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)

        Human human1 = new Human("John", 23, 165.23);
        Human human2 = new Human("Jane", 22, 120.23);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.drink();
        human2.eat();

    }
}