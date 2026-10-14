package com.pract.streamapi.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class ParallelStream {
    static void main(String[] args) {
        List<String> city = Arrays.asList("Nagpur", "mumbai", "new delhi", "bengaluru", "chennai");

        List result = city.stream()
                .filter(item -> item.length() > 6)
                .map(item-> item.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        result.forEach(cities -> System.out.println(cities));

        //Parallel Processing

        System.out.println("Parallel processing");

        city.parallelStream().forEach(cities-> System.out.println(Thread.currentThread().getName() +" - "+ cities));

        System.out.println("*****************");
        System.out.println("Code to check how many threads parallel stream is using.");

        System.out.println(ForkJoinPool.commonPool().getParallelism());
    }
}
