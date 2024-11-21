package org.example;

public class Problem_2 {
        public static void main(String[] args) {
            String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
            String toSearch = "ODG";
//            longestSubsString(dict, toSearch);
            //Ans :- 9 as LODGESSSS;
            longestStrin(dict,toSearch);
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

    public static void longestStrin(String [] dist ,String s)
    {
        int maxLength = 0;
        String longestMatch ="";
        for(String word: dist)
        {
            String wordUppercase = word.toUpperCase();
            String search = s.toUpperCase();


            int index= wordUppercase.indexOf(search);
            if(index!=-1)
            {
                if(word.length()>maxLength)
                {
                    maxLength=word.length();
                    longestMatch= word ;
                }
            }

        }

        System.out.println("Longest substring containing '" + s + "': " + longestMatch);
        System.out.println("Length: " + maxLength);

    }

}
