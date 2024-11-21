package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class oceanView {

    public static void main(String[] args) {


        int a[] = {4, 2, 3, 1};

        for(int i:OceanView(a))
        {
            System.out.println(i);
        }
    }

    public static int [] OceanView(int buildings[])
    {
        List<Integer> result = new ArrayList<>();
        int maxHeight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = buildings.length - 1; i >= 0; i--) {
            if (buildings[i] > maxHeight) {
                result.add(i); // Add the index to the result
                maxHeight = buildings[i]; // Update maxHeight
            }
        }

        // Reverse the list since we traversed from right to left
        int[] oceanViewIndices = new int[result.size()];
        for (int i = result.size() - 1, j = 0; i >= 0; i--, j++) {
            oceanViewIndices[j] = result.get(i);
        }

        return oceanViewIndices;
    }

}
