package org.example;

public class problem_23_2D_Martix {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 10,  2,  0, 20,  4},
                { 1,  0,  0, 30,  2,  5},
                { 0, 10,  4,  0,  2,  0},
                { 1,  0,  2, 20,  0,  4}
        };

        int result = maxPathSum(matrix);
        System.out.println("Maximum Path Sum: " + result); // Output: 74
    }

    public static int maxPathSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Create a DP table
        int[][] dp = new int[m][n];

        // Initialize the top-left corner
        dp[0][0] = matrix[0][0];

        // Fill in the DP table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Only update for the top-left corner
                if (i == 0 && j == 0) continue;

                // Calculate maximum path sum to this cell
                int maxFromNeighbors = Integer.MIN_VALUE;

                // Check all possible directions: up, down, left, right, and diagonally
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        if (di == 0 && dj == 0) continue; // skip the current cell itself

                        int prevRow = i + di;
                        int prevCol = j + dj;

                        // Check bounds
                        if (prevRow >= 0 && prevRow < m && prevCol >= 0 && prevCol < n) {
                            maxFromNeighbors = Math.max(maxFromNeighbors, dp[prevRow][prevCol]);
                        }
                    }
                }

                // Update the dp table with the maximum sum to this cell
                dp[i][j] = matrix[i][j] + maxFromNeighbors;
            }
        }

        // The result is the maximum path sum in the bottom-right corner
        return dp[m - 1][n - 1];
    }
}
