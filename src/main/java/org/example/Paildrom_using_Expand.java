package org.example;

public class Paildrom_using_Expand {

    public static void main(String[] args) {

        String s = "madam" ;
        System.out.println(isPalindrome(s));
    }

    public static  boolean isPalindrome(String s) {


        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }
}
