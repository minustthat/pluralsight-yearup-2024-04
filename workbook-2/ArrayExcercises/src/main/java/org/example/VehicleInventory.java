package org.example;
import java.util.*;
import java.util.Scanner;
public class VehicleInventory {
    public static List<vehicle> carInventory = new ArrayList<>();

    public static void displayCars() {
        String carName;
        for (vehicle car : carInventory) {
            carName = " Make and Model: " + car.makeModel + "\n " + "VIN: " + car.vehicleId + "\n" + "Color: " + car.color + "\n" + "Price: " + car.price + "\n" + "Miles: " + car.odometerReading;
            System.out.println(carName + "\n ---------------");
        }

    }



    public static void addCar(vehicle newCar) {
        carInventory.add(newCar);
    }

   public String searchCars(vehicle newCar){
       return newCar.makeModel;
   }



    public static void main(String[] args) {


        vehicle toyota = new vehicle();
        toyota.setVehicleId(101121);
        toyota.setMakeModel("Toyota Camry");
        toyota.setColor("Blue");
        toyota.setPrice(19000);
        toyota.setOdometerReading(135000);


        vehicle ford = new vehicle();
        ford.setVehicleId(101122);
        ford.setMakeModel("Ford Explorer");
        ford.setColor("Red");
        ford.setPrice(24000);
        ford.setOdometerReading(135000);

        vehicle subaru = new vehicle();
        subaru.setVehicleId(101123);
        subaru.setMakeModel("Subaru Outback");
        subaru.setColor("Green");
        subaru.setPrice(57000);
        subaru.odometerReading = 17000;

        vehicle chevy = new vehicle();
        chevy.setVehicleId(101124);
        chevy.setMakeModel("Chevy Malibu");
        chevy.setColor("Black");
        chevy.setPrice(50000);
        chevy.setOdometerReading(9700);

        vehicle honda = new vehicle();
        honda.setVehicleId(101125);
        honda.setMakeModel("Honda Civic");
        honda.setColor("White");
        honda.setPrice(70000);
        honda.setOdometerReading(7500);

        vehicle jeep = new vehicle();
        jeep.setVehicleId(101126);
        jeep.setMakeModel("Jeep Wrangler");
        jeep.setColor("Yellow");
        jeep.price = 30000;
        jeep.odometerReading = 16000;

        addCar(toyota);
        addCar(ford);
        addCar(subaru);
        addCar(chevy);
        addCar(honda);
        addCar(jeep);

        System.out.println(carInventory.size());
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:""");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                displayCars();
                break;


            case 2:
                System.out.println("Please enter make and model to search: ");

                String customerSearch = scanner.nextLine();
                for(vehicle car: carInventory){
                    if(customerSearch.equals(car.makeModel)){
                        System.out.println(customerSearch);
                    }
                }



            case 3:
                System.out.println("Please enter price range");
            case 4:
System.out.println("Please enter color to search: ");
            case 5:
                vehicle newCar = new vehicle();

                System.out.println("Please enter Vehicle ID :");
                newCar.vehicleId = scanner.nextLong();
                scanner.nextLine();

                System.out.println("Please enter Make and Model :");
                newCar.makeModel = scanner.nextLine();

                System.out.println("Please enter Color :");
                newCar.color = scanner.nextLine();

                System.out.println("Please enter Price :");
                newCar.price = scanner.nextFloat();

                System.out.println("Please enter Odometer Reading :");
                newCar.odometerReading = scanner.nextInt();

                addCar(newCar);
                System.out.println("Car added!");
                displayCars();
             break;
            case 6:
                scanner.close();
        }

}
    }





