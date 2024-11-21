package org.example;

import java.util.Stack;

public class parnathesisProble {
    public static void main(String[] args) {
        String s = "({}))(";

        System.out.println(isVaildParathesis(s));
    }

    public static boolean isVaildParathesis(String s)
    {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{')
            {
                stack.push(ch);
            }
            else if (ch==')' || ch=='}')
            {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();

                if(ch=='{' && top!='}' ||ch=='(' && top!=')')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}
