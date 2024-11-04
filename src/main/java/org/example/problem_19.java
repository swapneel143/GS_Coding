package org.example;

import java.util.HashMap;

public class problem_19 {

    public static void main(String[] args) {
        System.out.println(fractionToString(1, 2));
    }

    public static String fractionToString(int numerator, int denominator) {
        // Handle sign
        if (numerator == 0) return "0"; // Special case for zero

        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Work with absolute values
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);

        // Integer part
        result.append(num / denom);
        long remainder = num % denom;

        if (remainder == 0) {
            return result.toString(); // No fractional part
        }

        result.append(".");
        HashMap<Long, Integer> remainderMap = new HashMap<>();
        remainderMap.put(remainder, result.length());

        // Fractional part
        while (remainder != 0) {
            remainder *= 10;
            result.append(remainder / denom);
            remainder %= denom;

            if (remainderMap.containsKey(remainder)) {
                int index = remainderMap.get(remainder);
                result.insert(index, "("); // Insert opening parenthesis
                result.append(")"); // Append closing parenthesis
                break;
            } else {
                remainderMap.put(remainder, result.length());
            }
        }

        return result.toString();
    }
}
