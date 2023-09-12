//Write a program to Convert seconds to hour, minute and seconds
import java.util.*;
class Hrs{
    void hour1(float h1){
        float c=h1/3600;
        System.out.println("Seconds to hour"+c);
    }
    void minute1(float m1){
        float r = m1 % 3600;
        float u = r / 60;
        float h = r % 60;
        System.out.println("Seconds to minutes"+u);
        System.out.println("Seconds to seconds"+h);
    }
}
class Program3{
    public static void main(String[] args){
        try (Scanner s1 = new Scanner(System.in)){
            System.out.println("Enter Seconds");
            float a1=s1.nextInt();
            Hrs ob1= new Hrs();
            ob1.hour1(a1);
            ob1.minute1(a1);
        }
    }
}