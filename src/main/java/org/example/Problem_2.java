package org.example;

public class Problem_2 {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        longestSubsString(dict, toSearch);
        //Ans :- 9 as LODGESSSS;
    }

    public static void longestSubsString(String[] dict, String s) {
        int length = 0;
        for (String s1 : dict) {
            if (s1.contains(s)) {
                if (s1.length() > length) {
                    length = s1.length();
                }
            }
        }
        System.out.println(length);
    }

}
