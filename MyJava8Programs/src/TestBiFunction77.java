package com.oracle.gdd.sharding;

import java.util.function.*;

class Calculator1 {
   static int sum (int a,int b){
       System.out.println("The sum is getting calculated");
        return a+b;
    }

}
class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

public class TestBiFunction77 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction =
                (a,b) -> a + b;
       int ls = biFunction.apply(1, 2);
        System.out.println(ls);
        BiFunction<String,String,Person> biFunction1 = Person::new;
        Person person =biFunction1.apply("John", "Doe");
        System.out.println(person.getFirstName());
        Calculator1 calculator1 = new Calculator1();
        BiFunction<Integer,Integer,Integer> biFunction2 = Calculator1::sum;
        biFunction2.apply(1, 2);















    }
}
