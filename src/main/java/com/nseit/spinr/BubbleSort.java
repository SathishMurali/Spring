package com.nseit.spinr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSort implements SortAlg {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
