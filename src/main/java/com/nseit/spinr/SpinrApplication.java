package com.nseit.spinr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpinrApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpinrApplication.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

        int result = binarySearch.binarySearch(new int[]{3, 7, 9, 12}, 7);
        System.out.println(result);
    }

}
