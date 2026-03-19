// public class Main {
//     public static void main(String[] args) {
//         String name = args[0];
//         System.out.println("Hello," + name+ "!");
//     }
// }

public class Main {
    public static void main(String[] args){
        String name = "World";

        if(args.length > 0){
            name = args[0];
        }
        System.out.println("Hello" + name + "!");
    } 
}