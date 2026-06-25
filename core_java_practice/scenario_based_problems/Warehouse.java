package core_java_practice.scenario_based_problems;

import java.util.*;

public class Warehouse {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        int[] stock = {50, 20, 70, 20, 90, 50, 40};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int qty : stock) {
            if (qty > max) max = qty;
            if (qty < min) min = qty;
            total += qty;
        }

        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int qty : stock) {
            if (!seen.add(qty)) {
                duplicates.add(qty);
            }
        }

        System.out.println("Duplicate Quantities = " + duplicates);

        int k = 2;
        rotateArray(stock, k);

        System.out.print("Array after rotation by " + k + ": ");
        for (int qty : stock) {
            System.out.print(qty + " ");
        }

        int[][] shelf = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposed = transpose(shelf);

        System.out.println("\n\nTransposed Shelf Grid:");

        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
