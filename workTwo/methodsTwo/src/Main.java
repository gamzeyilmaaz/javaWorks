public class Main {

    public static void main(String[] args) {
        String message = "Weather is nice today.";
        System.out.println(message);
        String newMessage = city();
        System.out.println(newMessage);
        int number = collection(5, 7);
        System.out.println(number);
        int collections = collectionTwo(1, 2, 3, 4, 5);
        System.out.println(collections);
    }

    public static void add() {
        System.out.println("added");
    }

    public static void delete() {
        System.out.println("deleted");
    }

    public static void update() {
        System.out.println("updated");
    }

    public static int collection(int number1, int number2) {
        return number1 + number2;
    }

    public static int collectionTwo(int... numbers) {
        int collection = 0;
        for (int number : numbers) {
            collection += number;
        }
        return collection;
    }

    public static String city() {
        return "Ankara";
    }

}
