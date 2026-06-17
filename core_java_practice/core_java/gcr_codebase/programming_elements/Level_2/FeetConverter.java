package core_java_practice.gcr_codebase.programming_elements.Level_2;

import java.util.Scanner;

public class FeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards 
            + " while the distance in miles is " + miles);

        input.close();
    }
}