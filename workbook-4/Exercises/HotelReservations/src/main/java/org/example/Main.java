package org.example;

public class Main {
    static public class Room{
        int numberOfBeds;
        int price;
        boolean isOccupied;
        boolean isDirty;
        boolean isAvailable;

        int getNumberOfBeds() {
            return numberOfBeds;
        }
       void setNumberOfBeds(int numberOfBeds){
            this.numberOfBeds = numberOfBeds;
         }
        int getPrice(){
            return price;
        }

        boolean isOccupied(){
            return isOccupied;
        }
        boolean isDirty(){
            return isDirty;
        }

        boolean isAvailable(){
            return isAvailable;
        }
        public Room(int numberOfBeds, int price, boolean isOccupied, boolean isDirty, boolean isAvailable){
            numberOfBeds = this.numberOfBeds;
            price = this.price;
            isOccupied = this.isOccupied;
            isDirty = this.isDirty;
            isAvailable = this.isAvailable;
        }


        public Room(){

        }

    }
    public static void main(String[] args) {
        Room firstRoom = new Room();
        firstRoom.setNumberOfBeds(5);
        System.out.println(firstRoom.getNumberOfBeds());

    }
}