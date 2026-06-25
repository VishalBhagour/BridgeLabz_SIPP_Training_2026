package core_java_practice.gcr_codebase.programming_elements.Level_1;

import java.util.*;

public class FeeDiscountInput {
    public static void main(String[] args) {
        double fee, discountPercent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
        input.close();
    }
}

