package com.nseit.spinr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    @Qualifier("Bubble")
    private SortAlg sortAlg;
    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumber = sortAlg.sort(numbers);
        System.out.println(sortAlg);

        return 12;
    }
}
