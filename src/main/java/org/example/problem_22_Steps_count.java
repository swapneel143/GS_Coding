package org.example;

public class problem_22_Steps_count {
    public static void main(String[] args) {

        int numberOfStep = 3;

        System.out.println(countWays(numberOfStep));


        /* fabonicess series code
        for (int i=0;i<=numberOfStep;i++)
        {
            System.out.print(countWays(i)+" ");
        }

         */
    }

    static int countWays(int n) {

        // Base cases: If there are 0 or 1 stairs,
        // there is only one way to reach the top.
        if (n == 0 || n == 1)
            return 1;

        return countWays(n - 1) + countWays(n - 2);
    }
}
