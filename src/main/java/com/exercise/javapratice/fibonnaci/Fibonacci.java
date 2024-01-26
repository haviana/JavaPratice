package com.exercise.javapratice.fibonnaci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(7));

        System.out.println(fibonacciRecursive(7));
    }

    public static int fibonacci(int number){
        if (number<=1){
            return number;
        }

        int prev0=0, prev1=1;

            for(int i=2; i<= number; i++){
                int recur = prev0+prev1;
                prev0=prev1;
                prev1=recur;

            }
        return prev1;
    }

    public static int fibonacciRecursive(int number){

        if(number<=1){
            return number;
        }
        else
            return fibonacci(number-1)+fibonacci(number-2);
    }

}
