public class Main {
    public static void main(String[] args) {

        String message;

        if (args.length > 0) {

            message = "Hello, " + String.join(", ", args) + "!";
        } else {

            message = "Hello, World!";
        }

        System.out.println(message);
    }
}