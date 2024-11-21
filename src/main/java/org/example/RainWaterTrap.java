package org.example;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(totalWaterTrap(heights));

    }

    public static int totalWaterTrap(int [] a)
    {


        int l=0;
        int r=a.length-1;
        int lmax=0;
        int rmax=0;
        int ans =0;
        while (l<r)
        {
            if(a[l]>lmax)
            {
                lmax= a[l];
            }
            if(a[r]>rmax)
            {
                rmax=a[r];
            }

            if(lmax>rmax)
            {
                ans+=rmax-a[r];
                r--;

            }
            else {
                ans += lmax - a[l];
            l++;
            }

        }
        return ans;
    }


}
