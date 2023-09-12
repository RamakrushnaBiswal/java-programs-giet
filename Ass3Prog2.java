//Program2: Write a Java program by using a Command Line Argument (CMD). 
public class Ass3Prog2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            System.out.println("Number of arguments: " + args.length);
            System.out.println("Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}