package com.pract.streamapi.beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {
    static void main(String[] args) {
        List<String> sentences = Arrays.asList("this is me", "getting exhausted","my goal is", "to get job done");

//        sentences.stream()
//                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
//                .forEach(word-> System.out.println(word));
        List<List<String>> teams = Arrays.asList(Arrays.asList("Alice", "Bob"), Arrays.asList("charlie", "Diana"));

       teams.stream()
                .flatMap(team->team.stream())
                .collect(Collectors.toList())
               .forEach(player-> System.out.println(player));

        int[] numbers = {5, 10, 15, 20, 25, 30};

        int result = Arrays.stream(numbers)
                .filter(n-> n%2==0)
                .sum();

        System.out.println("Result: " + result);
    }
}
