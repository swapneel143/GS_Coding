package org.example;

public class problem_11_min_of_sortedArray {

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(findMin(arr1)); // Output: 1
        System.out.println(findMin(arr2)); // Output: 1
    }


    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid element is greater than the rightmost element
            if (arr[mid] > arr[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half (including mid)
                right = mid;
            }
        }
        return arr[left];
    }
}
