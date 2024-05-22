package org.example;

public class Main {
    public static void main(String[] args) {
        SemiTruck truck = new SemiTruck("Red", 2,3,4,4,4,"Truck", 16);
        System.out.println(truck.getNumberOfWheels());
    }
}