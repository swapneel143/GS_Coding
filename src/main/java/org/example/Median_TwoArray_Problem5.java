package org.example;

public class Median_TwoArray_Problem5 {

    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 8};
        int arr2[] = {10, 12, 14, 16, 18,1};
        System.out.println("Median of two array "+ medianOfArray(arr1,arr2));
    }

    public static double medianOfArray(int[]A,int []B)
    {
        int L=0;
        int R = A.length;

        while (L<=R)
        {
            int pickA = L+(R-L)/2;// find mid point
            int pickB = (A.length + B.length+1)/2-pickA; //to get extra element to right side

            int l1 = pickA==0 ? Integer.MIN_VALUE:A[pickA-1];
            int l2 = pickB==0 ? Integer.MIN_VALUE:B[pickB-1];
            int r1= pickA==A.length? Integer.MAX_VALUE:A[pickA];
            int r2= pickB==B.length?Integer.MAX_VALUE:B[pickB];

            if(l1<=r2 && l2<r1)
            {
                if((A.length+ B.length)%2==0)
                {
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2;
                }
                else return Math.max(l1,l2);
            }
            else
                if(l1>r2)
                {
                  R=  pickA-1;
                }
                L=pickA+1;

        }
    throw new IllegalArgumentException("Invalid input");
    }


}
