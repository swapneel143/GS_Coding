package org.example;

import java.util.HashMap;
import java.util.Map;

public class Problem_1 {

    public static void main(String[] args) {
        String s = "aabbcca";
//    Ans = a2b2c3;
        resultString(s);
    }

    public static void resultString (String s )
    {

        Map<Character,Integer> map = new HashMap<>();

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
        System.out.println(map);
        StringBuilder sb = new StringBuilder("");

        for (Map.Entry<Character,Integer> m :map.entrySet())
        {
            sb.append( String.valueOf(m.getKey()+""+m.getValue()));

        }
        System.out.println(sb);
    }




}
