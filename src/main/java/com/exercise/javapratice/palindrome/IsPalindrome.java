package com.exercise.javapratice.palindrome;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPolindrome(args[0]));

    }

    public static boolean isPolindrome(String s) {

        String aux = s.toLowerCase().replace("[^a-z]", "");

        char[] polindrome = aux.toCharArray();
        for (int i = polindrome.length - 1, j = 0; j < polindrome.length; i--, j++) {
            if (!(polindrome[i] == polindrome[j]))
                return false;
        }
        return true;
    }
}
