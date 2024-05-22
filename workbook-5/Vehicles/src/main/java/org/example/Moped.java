package org.example;

public class Moped extends Vehicle {
    int numberOfWheels = 2;
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfWheels){
       super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfWheels = numberOfWheels;

    }
    public Moped(){

    }

}
