package com.nseit.spinr;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpinrApplication {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch(new QuickSort());

        int result = binarySearch.binarySearch(new int[]{3, 7, 9, 12}, 7);
//		SpringApplication.run(SpinrApplication.class, args);
        System.out.println(result);
    }

}
