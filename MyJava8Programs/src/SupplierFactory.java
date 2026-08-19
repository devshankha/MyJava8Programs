package org.example;

import java.util.HashMap;
import java.util.function.Supplier;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car drive...");
    }
}

class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Bike drive...");
    }
}

//This is supplier factory
//this is used to defer object creation at demand time
class VehicleFactory {
    private static HashMap<String, Supplier<Vehicle>>map =
            new HashMap<>();
    static {
        map.put("CAR", Car::new);
        map.put("BIKE", Bike::new);
    }
    public static Vehicle getVehicle(String name) {
        Supplier<Vehicle> supplier = map.get(name.toUpperCase());
        if (map == null) {
            throw new IllegalArgumentException();
        }
        return supplier.get();

    }

}




public class SupplierFactory {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
       Object o = factory.getVehicle("CAR");
        System.out.println(o);
    }
}
