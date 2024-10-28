package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle_Problem29 {

    public static void main(String[] args) {
        int numberOfRows = 5; // Change this value for more rows
        printPascalTriangle(numberOfRows);
        System.out.println(getPascalRow(4));
    }

    public static int getPascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // The edges of the triangle
        }
        return getPascalValue(row - 1, col - 1) + getPascalValue(row - 1, col);
    }

    public static void printPascalTriangle(int rows) {

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getPascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> getPascalRow(int row) {
        List<Integer> pascalRow = new ArrayList<>();
        for (int col = 0; col <= row; col++) {
            pascalRow.add(getPascalValue(row, col));
        }
        return pascalRow;
    }
}

