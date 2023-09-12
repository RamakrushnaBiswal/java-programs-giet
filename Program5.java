//	Program5: Write a program to print Fibonacci Series using loop
import java.util.*;
class Fibo1 {
    void fibonaci(int a1) {
        int first = 0, second = 1;
        for (int i = 1; i <= a1; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
public class Program5 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int a1 = s1.nextInt();
        Fibo1 fib = new Fibo1();
        fib.fibonaci(a1);
    }
}
