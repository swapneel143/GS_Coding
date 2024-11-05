package org.example;

public class problem_13_shortestSubArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2,1};// K = 12

        System.out.println(minSumOfShortSubArray(arr,12));
        System.out.println(minSubArrayApproach2(arr,12));
    }

    // brute force approach
    public static int minSumOfShortSubArray(int a[], int k)
    {
        int length = -1;
     for(int i=0;i<a.length;i++)
     {
         int sum =0;
         for (int j=i;j<a.length;j++)
         {
            sum+=a[j];

             if(sum==k)
             {
                 length = j-i+1;

             }

         }
     }

        return length;
    }

    public static int  minSubArrayApproach2(int a[],int k )
    {
       int currentSum = 0;
       int minLength = Integer.MAX_VALUE;
       int left =0;

       for(int right =0;right<a.length;right++)
       {

           currentSum+=a[right];

           while (currentSum==k)
           {
               minLength = Math.min(minLength,right-left+1);
               currentSum-=a[left];
               left++;

           }
       }

       return minLength==Integer.MAX_VALUE?-1:minLength;
    }
}
