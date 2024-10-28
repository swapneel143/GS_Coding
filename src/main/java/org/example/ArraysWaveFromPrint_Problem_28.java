package org.example;

public class ArraysWaveFromPrint_Problem_28 {

    public static void main(String[] args) {


        int[] arr = {1,4,3,2};

        for(int i : waveFrom(arr))
        {
            System.out.print(i+ " ");
        }
    }


    public static int [] waveFrom(int [] A)
    {
        for(int i =0;i<A.length;i+=2)
        {
            if ( i>0 && A[i] < A[i - 1]) {
                swap(A, i, i - 1);
            }
            if ( i<A.length && A[i] < A[i + 1]) {
                swap(A, i, i + 1);
            }

        }
   return  A;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
