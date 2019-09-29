package com.company.input;

import java.util.Optional;

public class Exercise {
    public static void main(String[] args) {
        String name1 = "Andy";
        Optional<String> name = Optional.of("Andy");

        System.out.println(name1);

        if (name1 != null) {
            System.out.println(name1);
        }

        if (name.isPresent()) {
            System.out.println(name.get());
        }

        name.ifPresent( n -> System.out.println(n));

        name.ifPresent(System.out::println);
    }
}
