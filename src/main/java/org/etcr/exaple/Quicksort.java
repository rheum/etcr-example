package org.etcr.exaple;

public class Quicksort {

    /**
     * Performs quicksort algorithm on target array
     */
    public static int[] quicksort(int[] toSort) {
        int temp;
        for (int i = 1; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length - i; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }
        return toSort;
    }
}
