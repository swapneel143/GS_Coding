package org.example;

public class powerOFTenProblem14 {
    public static void main(String[] args) {
        int number =1000;

        if (powerOfTen(number)) {
            System.out.println(number + " is a power of 10.");
        } else {
            System.out.println(number + " is not a power of 10.");
        }
    }

    public static boolean powerOfTen(int n )
    {
        if(n<=0)
        {
            return false;
        }
        while (n%10==0)
        {
            n/=10;
        }
        return n==1;

    }

}
