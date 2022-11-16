public class Main {

    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int forsearch = 4;
        boolean isThere = false;
        for (int number : numbers) {
            if (number == forsearch) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            givingMessage("number exist: "+ forsearch);
        } else {
            givingMessage("number is not exist: "+ forsearch);
        }
    }
    public static void givingMessage(String message){
        System.out.println(message);
    }
}