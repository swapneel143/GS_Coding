package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OceanViewProblem {

    public static void main(String[] args) {
        int height[] = {4,2,3,1};

        System.out.println(OceanView(height));

    }

    public static List<Integer> OceanView(int [] h)
    {

        Stack<Integer> stack = new Stack<>();

        for(int i=h.length-1;i>=0;i--)
        {
            if(stack.isEmpty()|| h[i]>h[stack.peek()])
            {
                stack.push(i);
            }

        }
        List<Integer> ls = new ArrayList<>();
        while (!stack.isEmpty())
        {
            ls.add(stack.pop());
        }
        return ls;
    }


}
