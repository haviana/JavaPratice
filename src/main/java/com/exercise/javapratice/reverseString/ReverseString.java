package com.exercise.javapratice.reverseString;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        Arrays.stream(args).forEach(x->
                {
                    System.out.println(new StringBuilder(x).reverse());

                });

        System.out.println(reverseString(args[0]));
    }

    static String reverseString(String s){
        char[] c = s.toCharArray();
        StringBuilder sBuilder = new StringBuilder();
        for (int i = c.length-1 ; i >=0; i--) {
                sBuilder.append(c[i]);
        }

        return sBuilder.toString();
    }

}
