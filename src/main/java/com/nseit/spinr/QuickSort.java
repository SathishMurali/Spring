package com.nseit.spinr;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class QuickSort implements SortAlg {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
