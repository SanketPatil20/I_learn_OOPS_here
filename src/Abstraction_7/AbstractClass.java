package Abstraction_7;

// Vehicle declared as an abstract class
abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();
    }
}

