package com.exercise.javapratice.mergearray;

import java.util.Arrays;

public class MergeSortArray {

    public static void main(String[] args) {

        int[] array1= {1, 3, 5, 7}, array2 = {2,4,6,8};
        System.out.println(Arrays.toString(sortTwoArrays(array1, array2)));

    }


    static int[] sortTwoArrays(int[] array1, int[] array2){

        int a1 = array1.length;
        int a2 = array2.length;

        int c1 = a1+a2;

        int [] c = new int[c1];

        System.arraycopy(array1,0,c,0,a1);
        System.arraycopy(array2,0,c,a1,a2);

        return Arrays.stream(c).sorted().toArray();
    }

}
