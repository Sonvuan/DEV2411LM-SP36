package com.devmaster.lesson02.tight_loosely_coupling;

import java.util.Arrays;

public interface SortAlgorithm {
    void sort( int[] array );
}

class LooselyBubbbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort( int[] array ) {
        System.out.println("Sorting array using LooselyBubbble Sort");
        Arrays.stream(array).sorted().forEach( System.out::println );
    }
}
