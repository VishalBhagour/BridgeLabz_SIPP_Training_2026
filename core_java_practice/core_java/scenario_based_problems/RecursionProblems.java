package core_java_practice.scenario_based_problems;

import java.util.Scanner;

public class RecursionProblems {

    static int moveCount = 0;

    public static void towerOfHanoi(int n, char source,
                                    char auxiliary,
                                    char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from "
                    + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source,
                destination, auxiliary);

        System.out.println("Move Disk " + n
                + " from " + source
                + " to " + destination);

        moveCount++;

        towerOfHanoi(n - 1, auxiliary,
                source, destination);
    }

    public static int binarySearch(int[] arr,
                                   int low,
                                   int high,
                                   int target) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr,
                    low, mid - 1, target);

        return binarySearch(arr,
                mid + 1, high, target);
    }

    public static int sumOfDigits(int num) {

        if (num == 0)
            return 0;

        return (num % 10)
                + sumOfDigits(num / 10);
    }

    public static String reverseString(String str) {

        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1))
                + str.charAt(0);
    }

    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    public static boolean checkBalance(String str,
                                       int index,
                                       int count) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return checkBalance(str,
                    index + 1, count + 1);

        if (ch == ')')
            return checkBalance(str,
                    index + 1, count - 1);

        return checkBalance(str,
                index + 1, count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int disks = sc.nextInt();

        System.out.println("\nTower of Hanoi Moves:");
        towerOfHanoi(disks, 'A', 'B', 'C');

        System.out.println("Total Moves = "
                + moveCount);

        int[] prices = {100, 200, 300, 400, 500};

        System.out.print(
                "\nEnter price to search: ");
        int target = sc.nextInt();

        int result = binarySearch(prices,
                0,
                prices.length - 1,
                target);

        if (result != -1)
            System.out.println(
                    "Found at index: " + result);
        else
            System.out.println("Not Found");

        System.out.print(
                "\nEnter number for digit sum: ");
        int number = sc.nextInt();

        System.out.println(
                "Sum of Digits = "
                        + sumOfDigits(number));

        sc.nextLine();

        System.out.print(
                "\nEnter string to reverse: ");
        String text = sc.nextLine();

        System.out.println(
                "Reversed String = "
                        + reverseString(text));

        System.out.print(
                "\nEnter parentheses expression: ");
        String expr = sc.nextLine();

        System.out.println(
                "Balanced = "
                        + isBalanced(expr));

        sc.close();
    }
}