package org.example;

import java.util.Arrays;

public class tripletSumInArray {

    public static void main(String[] args) {

        int a[] = {2,5,2,7,1,1};
        int sum = 4;
        System.out.println(tripletSum(a,sum));

    }

    public static int tripletSum (int [] a ,int sum)
    {

        Arrays.sort(a);
        int count =0;
 String res = "";
        for(int i=0;i<a.length-2;i++)
        {
            int left =i+1;
            int right = a.length-1;

            while(left<right)
            {
                int currentSum  = a[i]+a[left]+a[right];

                if(currentSum==sum)
                {
                    count++;
                    left++;
                    right--;

                }
                else if(currentSum<sum)
                {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        System.out.println(res);
        return count;
    }

}
