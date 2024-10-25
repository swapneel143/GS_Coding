package org.example;

public class Paildrom_using_Expand {

    public static void main(String[] args) {

        String s = "madam";
        System.out.println(expandAroundCenter(s));

    }



    public static boolean expandAroundCenter(String str) {
       int length = str.length();
  boolean ans = true;
        int mid = length / 2;
  int l,r;
  if(length%2==0) {
      l = mid;
      r = mid-1;
  }
  else
  {
      l=mid;
      r=mid;
  }

        while(l>=0 && r<str.length()) {
            if (str.charAt(l) == str.charAt(r) ){
                l--;
                r++;


            }
            else {
                ans = false;
                break;
            }

        }
        return ans;

    }
}
