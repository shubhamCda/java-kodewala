package com.pract.streamapi.beginner;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Drive1 {
    static void main(String[] args) {
        List<Integer> numbers = List.of(13, 60, 37, 80, 99, 29,16, 24, 20, 35, 36, 40);

        //numbers greater than 50
//        numbers.stream()
//                .filter(n->n>50)
//                .forEach(System.out::println);

        List<String> names = List.of("java", "spring", "hibernate");

        //convert names into uppercase
//        names.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

        //find number of elements
        long numberCount = numbers.stream().count();

//        System.out.println(numberCount);

        //remove duplicates
//        numbers.stream()
//                .distinct() //use to remove duplicates
//                .forEach(System.out::println);


        //sort numbers
//        numbers.stream()
//                .sorted()
//                .forEach(System.out::println);
//
//        System.out.println("****reverse order****");
//
//        numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2==0)
                .toList(); //modern java
//                .collect(Collectors.toList()); //old methods
//        System.out.println(evenNumbers);

        //maximum number
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
//        System.out.println(max.orElse(0));

        //minimum number
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
//        System.out.println(min.orElse(-1));

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
//        System.out.println(avg);


    }
}
