package org.example;

import java.util.ArrayList;
import java.util.List;

public class CircleProblem_Joshph_Problem {

    public static void main(String[] args) {

        int n = 4; // number of students
        int k = 2; // length of the song
        int electedStudent = findPresident(n, k);
        System.out.println("The elected student is: " + electedStudent);
    }

    public static int findPresident(int n, int k) {
        List<Integer> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            students.add(i);
        }

        int currentIndex = 0; //2

        while (students.size() > 1) {
            currentIndex = (currentIndex + k - 1) % students.size(); //3%2=1
            students.remove(currentIndex); //1
        }

        return students.get(0);

    }
}
