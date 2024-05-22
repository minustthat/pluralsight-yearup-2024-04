package org.example;

public class Car extends Vehicle {
   private int numberOfWindows;
    private int numberOfDoors;
    private  String type;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    private int numberOfWheels;
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfWindows, int numberOfDoors, String type,int numberOfWheels ){
       super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
       this.numberOfWheels = numberOfWheels;
       this.numberOfDoors = numberOfDoors;
       this.type = type;
       this.numberOfWindows = numberOfWindows;
    }
    public Car(){
    numberOfWindows = 4;
    numberOfWheels = 4;
    }
}
