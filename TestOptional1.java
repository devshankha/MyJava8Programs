package org.example;


import java.util.Optional;

//Difference between orElse and orElseGet
public class TestOptional1 {
    static String getDefaultName() {
        System.out.println("Creating default name");
        return "Guest";
    }




    public static void main(String[] args) {
        Optional<String> name = Optional.of("Alice");

        String result = name.orElse(getDefaultName());

        System.out.println(result);

        String result1 = name.orElseGet(() -> getDefaultName());
        System.out.println(result1);

    }
}
