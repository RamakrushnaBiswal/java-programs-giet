//Write a Java program to implement Polymorphism.(Note: Consider a scenario, Bank is a class that provides method to get the rate of interest.
// But, rate of interest may differ according to banks. 
//For example, SBI, ICICI and AXIS banks are providing 8.4%, 7.3% and 9.7% rate of interest.
class Bank {
    double getInterestRate() {
        return 0.0; // Default interest rate
    }
}
class SBI extends Bank {
    double getInterestRate() {
        return 8.4;
    }
}
class ICICI extends Bank {
    double getInterestRate() {
        return 7.3;
    }
}
class AXIS extends Bank {
    double getInterestRate() {
        return 9.7;
    }
}
public class Ass4Prog3 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("AXIS Interest Rate: " + axis.getInterestRate() + "%");
    }
}