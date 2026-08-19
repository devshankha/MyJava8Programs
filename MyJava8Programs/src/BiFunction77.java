package org.example;

import java.util.function.BiFunction;

public class BiFunction77 {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunc =
                (first,last) -> first+"---"+last;
        String s = biFunc.apply("hello","world");
        System.out.println(s);
    }
}
