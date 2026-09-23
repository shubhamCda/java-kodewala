package com.app.optionals.functionaloperations;

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
        Optional<String> temp = name.map(value -> value.toUpperCase());
        System.out.println(temp.orElse("Error"));

        Optional<String> temp1 = nullOptional.map(value -> value.toUpperCase());
        System.out.println(temp1.orElse("Error"));
    }
}
