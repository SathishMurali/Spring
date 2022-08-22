package com.nseit.spinr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    @Qualifier("QuickSort")
    private SortAlg sortAlg;

//    public BinarySearch(SortAlg sortAlg){this.sortAlg = sortAlg;}
    public int binarySearch(int[] numbers, int numberToSearch) {
//        BubbleSort bubbleSort = new BubbleSort();
//        QuickSort quickSort = new QuickSort();
        int[] sortedNumber = sortAlg.sort(numbers);
        System.out.println(sortAlg);

        return 12;
    }
}
