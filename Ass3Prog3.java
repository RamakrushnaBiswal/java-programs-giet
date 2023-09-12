//Write a Java program to define Scanner class which reads the int, string and double value as an input
 import java.util.*;
 class Printa{
    void Int1(int a){
        System.out.println("Integer value is :"+a);
    }
    void String1(String b){
        System.out.println("String value is :"+b);
    }
    void Double1(double c){
        System.out.println("Double value is :"+c);
    }
 }

 class Ass3Prog3{
    public static void main(String[] args){
        Scanner e1 = new Scanner(System.in);
        System.out.print("Enter the Integer vlaue :");
        int i1 = e1.nextInt();
        System.out.print("Enter the String vlaue :");
        String s1=e1.next();
        System.out.print("Enter the Double vlaue :");
        double d1=e1.nextDouble();
        Printa p1=new Printa();
        p1.Int1(i1);
        p1.String1(s1);
        p1.Double1(d1);
    }
 }