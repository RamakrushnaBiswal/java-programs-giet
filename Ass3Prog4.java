//Program4: Write a Java program to convert a binary number to decimal number.
import java.util.*;
import java.math.*;
class Bina{
    double i=0,sum=0 ;
    void display(int n){
        while(n>0){
            int rem=n%10;
            sum=sum+Math.pow(2,i)*rem;
            n=n/10;
            i++;
        }
        System.out.println("decimal is"+sum);
    }
}
class Ass3Prog4{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number you want to convert binary Decimal :"); //
        int n1 = s1.nextInt();
        Bina w=new Bina();
        w.display(n1);
    }
}