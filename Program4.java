//	Program4: Write a program to find largest of 3 numbers
import java.util.*;
class Ln {
    int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();
        Ln largestNumberFinder = new Ln();
        int largest = largestNumberFinder.findLargest(n1, n2, n3);

        System.out.println("The largest number is: " + largest);
    }
}
