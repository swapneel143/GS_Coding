package org.example;

public class problem_21 {
    public static void main(String[] args) {
        int[] result1 = addFractions(1, 3, 3, 9);
        System.out.println("Result: " + result1[0] + "/" + result1[1]); // Output: 2/3

        int[] result2 = addFractions(1, 2, 3, 2);
        System.out.println("Result: " + result2[0] + "/" + result2[1]); // Output: 2/1
    }

    private static int[] addFractions(int numerator1, int denominator1, int numerator2, int denominator2) {
        // Calculate the new numerator and denominator
        int numeratorSum = numerator1 * denominator2 + numerator2 * denominator1;
        int denominatorSum = denominator1 * denominator2;

        // Simplify the result
        int gcd = gcd(Math.abs(numeratorSum), Math.abs(denominatorSum));

        // Reduce the fraction
        numeratorSum /= gcd;
        denominatorSum /= gcd;

        // Ensure the denominator is positive
        if (denominatorSum < 0) {
            numeratorSum = -numeratorSum;
            denominatorSum = -denominatorSum;
        }

        return new int[]{numeratorSum, denominatorSum};
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
