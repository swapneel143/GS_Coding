package org.example;

import java.util.ArrayList;
import java.util.List;

public class Problem_7 {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        // Return apple, applet
        System.out.println(prefixSubString(arr,prefix));
    }

    public static List<String> prefixSubString(String[] arr, String prefix) {
        List<String> ls = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.length() >= 3) {
                if (s.substring(0, prefix.length()).equals(prefix)) {
                    ls.add(s);
                }

            }

        }
   return  ls;

    }

}
