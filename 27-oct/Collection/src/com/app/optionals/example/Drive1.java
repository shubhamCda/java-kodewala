package com.app.optionals.example;

import java.util.Optional;

public class Drive1 {
    static void main(String[] args) {
        String name = "java";

        if (name != null){
            System.out.println("Length: "+ name.length());
        }else {
            System.out.println("String is null");
        }

        Optional<String> optionalString = Optional.of(name);
        System.out.println("optionalString: "+optionalString);

        Optional<String > empty = Optional.empty();
        System.out.println("empty: "+empty);

        Optional<String> mayBe = Optional.ofNullable(null); //if use Optional.of(null) -> NullPointerException
        System.out.println("maybe: "+mayBe);

        //Checking values
        System.out.println(optionalString.isPresent()); //true -> check the string is present in option/ not.
        System.out.println(optionalString.isEmpty()); //false

        //get()
        System.out.println(optionalString.get());// java
//        System.out.println(mayBe.get()); //not a right method to get data if null throws exception

        //orElse(default-value)
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse(null));
        System.out.println(mayBe.orElse("default"));


        //orElseGet(<supplier>)
        String temp = mayBe.orElseGet(() ->{
            System.out.println("generating default value");
            return "default";
        });
        System.out.println(temp);

        //orElseThrow()

        String result = mayBe.orElseThrow(
                () -> new RuntimeException("Not found!")
        );

        System.out.println(result);
    }
}
