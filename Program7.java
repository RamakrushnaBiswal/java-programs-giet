//Write a Java program that calculate mathematical constant ‘e’ using the formula e=1+1/2!+1/3!+........ up to 5 .
class ECalc {
    double calculateE() {
        //let take
        double e = 1.0;
        int n=5;
        for (int i = 1; i <= n; i++) {
            e += 1.0 / factorial(i);
        }
        return e;
    }
    int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}

public class Program7{
    public static void main(String[] args) {

        ECalc eCalculator = new ECalc();
        double result = eCalculator.calculateE();

        System.out.println("Value of 'e' using the formula: " + result);
    }
}
