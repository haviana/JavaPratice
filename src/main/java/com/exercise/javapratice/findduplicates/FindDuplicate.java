package com.exercise.javapratice.findduplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class FindDuplicate {

    public int[] getDuplicates(int[] arrayWithDup){
        if (arrayWithDup == null){
            return new int[]{};
        }
        LinkedHashSet<Integer> noDup = new LinkedHashSet<>();

        return Arrays.stream(arrayWithDup).filter(x -> !noDup.add(x)).distinct().toArray();
    }
}
