package org.example;

public class Problem_10 {
    public static void main(String[] args) {

        String str1 = "123";     //Return 123 (in integer format)

        String str2 = "-123";    //Return -123

        String str3 = "1a23";   //Return -1 (Invalid entry)

        System.out.println(convertInt(str1));
    }

    public static int convertInt (String s)
    {
        int index = 0, sign = 1, result = 0;

        if (s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        while (index < s.length()) {
            char currentChar = s.charAt(index);
            if (Character.isDigit(currentChar)) {
                int digit = currentChar - '0';
                result = result * 10 + digit;
            } else {
                return  -1;
            }
            index++;
        }

        return result*sign ;

    }

}
