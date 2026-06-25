package core_java_practice.scenario_based_problems;

import java.util.*;

public class Kingdom_Tax_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalTax = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter income of citizen " + i + ": ");
            double income = sc.nextDouble();

            double tax;
            String bracket;

            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            } else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            } else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            System.out.println();

            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);

    }
}
