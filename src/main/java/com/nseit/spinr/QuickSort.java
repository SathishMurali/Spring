package com.nseit.spinr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier
@Component
public class QuickSort implements SortAlg {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
