package org.example;

import java.util.Stack;

public class Problem_LeetCode_739_daily_Temp {

    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};


        for (int i:dailyTemperatures(temp))
        {
            System.out.print(i+" ");
        }
    }


    public static  int[]  dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] ans = new int[n];  // Result array to store the answer
            Stack<Integer> stack = new Stack<>();  // Stack to store indices of temperatures

            // Iterate through each temperature
            for (int i = 0; i < n; i++) {
                // While the stack is not empty and the current temperature is greater than the
                // temperature at the index stored at the top of the stack
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int index = stack.pop();  // Pop the index from the stack
                    ans[index] = i - index;  // Calculate days to wait for a warmer temperature
                }

                stack.push(i);  // Push the current day's index onto the stack
            }

            // The answer array will already have 0 for all indices where no warmer day is found
            return ans;
        }

}
