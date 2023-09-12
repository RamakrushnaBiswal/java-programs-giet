//Write a Java program that prints all real solutions to the quadratic equation ax2 + bx +c=0.
// Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative,
// display a message stating that there are no real solutions (Using Buffered Reader concept).
import java.util.*;
import java.math.*;
class Quard{
    double r1;
    void display(int a,int b,int c){
        r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("Requird answer is :"+r1);
    }
}
class Ass3Prog5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a :");
        int n1 = sc.nextInt();
        System.out.print("Enter the value for b :");
        int n2 = sc.nextInt();
        System.out.print("Enter the value for c :");
        int n3 = sc.nextInt();
        Quard q1 = new Quard();
        q1.display(n1,n2,n3);
    }
}