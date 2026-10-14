package com.app.optionals.functionaloperations;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Optional;

public class Drive {
    static void main(String[] args) {
        Optional<String> name = Optional.of("java");
        Optional<String> nullOptional = Optional.ofNullable(null);

        //if present
        name.ifPresent((value) ->{
            System.out.println(value);
            System.out.println("I'm here in name");
        });

        nullOptional.ifPresent((value) ->{
            System.out.println(value);
            System.out.println("I'm here in null optional");
        });


        //map()
        Optional<String> temp = name.map(String::toUpperCase);
        System.out.println(temp.orElse("Error"));

        Optional<String> temp1 = nullOptional.map(value -> value.toUpperCase());
        System.out.println(temp1.orElse("Error"));


        //filter()
//        Optional<String> temp2 = name.filter(n -> n.startsWith("j"));
//        temp2.ifPresent(System.out::println);

        name.filter(n -> n.startsWith("j"))
                .ifPresent(System.out::println);

        System.out.println("*****Combined*****");

        name.filter(n -> n.startsWith("j"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
