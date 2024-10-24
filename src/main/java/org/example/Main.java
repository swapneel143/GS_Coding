package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] students = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        double highestAverage = calculateHighestAverage(students);
        System.out.println("Highest Average: " + highestAverage);
        }
    public static double calculateHighestAverage(String[][] students) {
        HashMap<String, StudentData> studentMap = new HashMap<>();

        // Populate the map with total marks and count
        for (String[] entry : students) {
            
            String name = entry[0];
            double mark = Double.parseDouble(entry[1]);

            studentMap.putIfAbsent(name, new StudentData());
            StudentData data = studentMap.get(name);
            data.totalMarks += mark;
            data.count++;
        }

        double highestAverage = Double.NEGATIVE_INFINITY;

        // Calculate the highest average
        for (StudentData data : studentMap.values()) {
            double average = data.totalMarks / data.count;
            highestAverage = Math.max(highestAverage, average);
        }

        return highestAverage;
    }

    // Helper class to store total marks and count
    static class StudentData {
        double totalMarks = 0;
        int count = 0;
    }

    }
