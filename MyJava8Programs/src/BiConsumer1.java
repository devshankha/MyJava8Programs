package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
//BiConsumer is used for iterating a hashMap

public class BiConsumer1 {
    //

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"English");
        map.put(2,"Spanish");
        BiConsumer<Integer,String> biConsumer = (x,y)->{
            System.out.println(x+" "+y);
        };
        map.forEach(biConsumer);
    }
}
