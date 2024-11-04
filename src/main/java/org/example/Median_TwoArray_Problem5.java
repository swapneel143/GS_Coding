package org.example;

public class Median_TwoArray_Problem5 {

    public static void main(String[] args) {
        int arr1[] = {1,3};
        int arr2[] = {2,4,5,6};
        System.out.println("Median of two array "+ medianOfArray(arr1,arr2));
    }

    public static double medianOfArray(int[]A,int []B)
    {
        int L=0;
        int R = A.length;

        while (L<=R)
        {
            int pickA = L+(R-L)/2;// find mid point
            int pickB = (A.length + B.length+1)/2-pickA; //to get extra element to right
//            or we are not adding 1 or the next element is we have to take from left array

            int l1 = pickA==0 ? Integer.MIN_VALUE:A[pickA-1];

/*

   A={1,3}
    B = {2,4,6,7}

    pick A = 1    3
    pick B = 2    4,6,7

 */
            int l2 = pickB==0 ? Integer.MIN_VALUE:B[pickB-1];
            int r1= pickA==A.length? Integer.MAX_VALUE:A[pickA];
            int r2= pickB==B.length?Integer.MAX_VALUE:B[pickB];

            if(l1<=r2 && l2<=r1)
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
