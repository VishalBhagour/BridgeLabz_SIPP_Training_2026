package core_java_practice.scenario_based_problems;
import java.util.Scanner;
class MathWizard {

    // Instance Variable
    int instanceVar = 100;

    // Prime Check
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial using iteration (int)
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded Factorial (double)
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci
    public int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    // GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Scope Demonstration
    public void showScope() {

        // Local Variable
        int instanceVar = 50;

        System.out.println("Local Variable: " + instanceVar);
        System.out.println("Instance Variable: " + this.instanceVar);
    }
}

public class MathWizardDemo {
    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Prime Check (17): " + mw.isPrime(17));

        System.out.println("Factorial(5): " + mw.factorial(5));

        System.out.println("Factorial(6.0): " + mw.factorial(6.0));

        System.out.println("Fibonacci(8): " + mw.fibonacci(8));

        System.out.println("GCD(24, 36): " + mw.gcd(24, 36));

        System.out.println("LCM(24, 36): " + mw.lcm(24, 36));

        System.out.println("Power(2, 5): " + mw.power(2, 5));

        System.out.println("\nScope Demonstration:");
        mw.showScope();
    }
}