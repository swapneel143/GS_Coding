package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_15_Student_av_marks {

    public static void main(String[] args) {
        String[][] data = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        String result = highestAverageMarks(data);
        System.out.println("Highest average marks: " + result); // Output: 61.50
    }

    public static String highestAverageMarks(String[][] data) {
        Map<String, List<Integer>> studentMarks = new HashMap<>();

        // Group marks by student name
        for (String[] entry : data) {
            String name = entry[0];
            int mark = Integer.parseInt(entry[1]);

            studentMarks.putIfAbsent(name, new ArrayList<>());
            studentMarks.get(name).add(mark);
        }

        // Calculate the highest average
        String topStudent = null;
        double highestAverage = Double.NEGATIVE_INFINITY;

        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            String student = entry.getKey();
            List<Integer> marks = entry.getValue();
            double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }

        return String.format("%.2f", highestAverage);
    }
}
