package org.example;

import java.util.Optional;

//Basic usages of Optional
public class TestOptional {
    public static void main(String[] args) {
        // will not throw a NPE
        Optional<String> opt1 = Optional.of("abc");
        System.out.println(opt1.get());
        String t1 = null;
        Optional<String> opt2 = Optional.ofNullable(t1);
       // System.out.println(opt2.get());
        System.out.println("Will not throw NPE");
        opt2.ifPresent(System.out::println);
        Optional<String> opt = Optional.of("baeldung");
        opt.ifPresent(name -> System.out.println(name.length()));
        String ks ="null";
        String name1 = Optional.ofNullable(ks).orElse("default");
        System.out.println(name1);
        String name2 = Optional.ofNullable(ks).orElseGet(()->"default");
        System.out.println(name2);





    }
}
