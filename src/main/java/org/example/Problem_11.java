package org.example;

public class Problem_11 {

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1

        int[] arr2 = {1, 2, 3, 4};
    }

    public static int minimunElement(int a[])
    {
        int result = a[0];

        for(int i=0;i<a.length;i++)
        {
            if(result<a[i])
            {
                result = a[i];
            }
        }
        return result;
    }
}
