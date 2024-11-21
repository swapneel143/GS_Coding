package org.example;

public class LexoGraphicStringHighAndLowSubsString {


    public static void main(String[] args) {

        String s = "swapneel";
      int length = 3;
      for (String s1 :lexographic(s,length))
      {
          System.out.println(s1);
      }

    }
    public static String[] lexographic(String s ,int n)
    {

        String small =s.substring(0,n-1);
        String large = s.substring(0,n-1);
      String ans[] = new String[2];
        for(int i=0;i<=s.length()-n;i++)
        {
            String curr = s.substring(i,i+n);

            if(curr.compareTo(small)<0)
            {
                small  = curr;
                ans[0]=curr;
            }
            else if (curr.compareTo(large)>0)
            {
                large= curr;
                ans[1]=large;

            }
        }
    return ans;
    }

}
