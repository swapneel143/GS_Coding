package org.example;

public class problem_27 {

    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        int loopLength = findLoopLength(arr);
        System.out.println("Length of the loop: " + loopLength); // Output: 3
    }

    public static int findLoopLength(int[] arr) {
        int n = arr.length;
        int slow = 0;
        int fast = 0;

        // Step 1: Use Floyd's Cycle Detection Algorithm
        do {
            slow = move(slow, arr, n); // Move slow by 1 step
            fast = move(move(fast, arr, n), arr, n); // Move fast by 2 steps

            if (slow == -1 || fast == -1) {
                return -1; // If we go out of bounds
            }
        } while (slow != fast);

        // Step 2: Find the length of the loop
        int loopLength = 0;
        do {
            slow = move(slow, arr, n);
            loopLength++;
        } while (slow != fast);

        return loopLength;
    }

    private static int move(int index, int[] arr, int n) {
        if (index < 0 || index >= n) {
            return -1; // Out of bounds
        }
        return (index + arr[index] + n) % n; // Apply the movement rules
    }
}
