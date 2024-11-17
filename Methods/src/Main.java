public class Main {

    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

//         void method

        String name = "John Mark";
        int age = 21;

        hello(name, age);

//        return Method

        int x = 3;
        int y = 4;

        int result = add(x, y);
        System.out.println(result);

    }

//    void method

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
    }

//      return method

      static int add(int x, int y) {
        return x + y;
    }

}