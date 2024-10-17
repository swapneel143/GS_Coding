package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem_8 {
    public static void main(String[] args) {

        String str1 = "12345";
        //Return 1
        String str2 = "abbacdc";
        //Returns c
        System.out.println("Frist non reapting char "+ str2 + " --> "+fristOccurance(str2));
        System.out.println("Frist non reapting char "+ str1 + " --> "+fristOccurance(str1));

    }

    public static Character fristOccurance(String s )
    {
      Map<Character,Long> map =  s.chars()
              .mapToObj(c->(char)c)
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      /*
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            }
        }
       */
        for(char c:s.toCharArray())
        {
            if(map.get(c)==1)
            {
                return c;
            }
        }
        return  null;
    }
}
