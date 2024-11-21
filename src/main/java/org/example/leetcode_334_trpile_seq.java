package org.example;

import java.net.Inet4Address;

public class leetcode_334_trpile_seq {

    public static void main(String[] args) {
       int[] nums = {1,2,10,4,5,6};

        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {

       int min1 = Integer.MAX_VALUE;
       int min2= Integer.MAX_VALUE;

       for(int num:nums)
       {
           if(num>min2)
           {
               return true;
           }
           else if (num>min1)
           {
               min2=num;
           }
           else
           {
               min1= num;
           }

       }
       return true;
    }
    }

