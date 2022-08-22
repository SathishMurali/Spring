package com.nseit.spinr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Bubble")
@Component
public class BubbleSort implements SortAlg {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
