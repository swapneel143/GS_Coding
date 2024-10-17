package org.example;

public class Problem_9 {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        System.out.println(shortesDistance(str,word1,word2));
    }
    public static int shortesDistance(String str,String word1,String word2)
    {
        String[] words = str.split(" ");
        int lastIndexWord1 = -1;
        int lastIndexWord2 = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                lastIndexWord1 = i;
                if (lastIndexWord2 != -1) {
                    minDistance = Math.min(minDistance, lastIndexWord1 - lastIndexWord2-1);
                }
            } else if (words[i].equals(word2)) {
                lastIndexWord2 = i;
                if (lastIndexWord1 != -1) {
                    minDistance = Math.min(minDistance, lastIndexWord2 - lastIndexWord1-1);
                }
            }
        }
        return minDistance;

    }
}
