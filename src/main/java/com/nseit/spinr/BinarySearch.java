package com.nseit.spinr;

public class BinarySearch {
    private SortAlg sortAlg;

    public BinarySearch(SortAlg sortAlg) {
        this.sortAlg = sortAlg;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
//        BubbleSort bubbleSort = new BubbleSort();
//        QuickSort quickSort = new QuickSort();
        int[] sortedNumber = sortAlg.sort(numbers);

        return 12;
    }
}
