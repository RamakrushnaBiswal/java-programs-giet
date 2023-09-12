//Write a program to display (“Hello”, “Welcome to Java World”, “A very good morning”) and addition of two numbers by using function.
import java.util.*;
class GoodMorning{
    void display(){
    System.out.println("Hello");
    System.out.println("A very good morning");
    System.out.println("Welcome to Java World");
    }
    int add(int a1,int b1){
        int c=a1+b1;
        return c;
    }
}
class Program2{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number =");
            int a=sc.nextInt();
            System.out.print("Enter a number =");
            int b=sc.nextInt();
            GoodMorning ob1=new GoodMorning();
            ob1.display();
            System.out.println("addition of two number is =" + ob1.add(a,b));
        }
    }
}