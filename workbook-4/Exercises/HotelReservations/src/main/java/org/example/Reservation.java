package org.example;

public class Reservation {
    private String roomType;
   private double pricePerNight;
   int numberOfNights;
   int reservationTotal;
    private boolean isWeekend;

public String getRoomType(){
    return this.roomType;
}
public void setRoomType(){
    this.roomType = roomType;
}

public double getPricePerNight(){
    return this.pricePerNight;
}

public void setPricePerNight(double pricePerNight){
    this.pricePerNight = pricePerNight;
}

public int getNumberOfNights(){
    return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
    this.numberOfNights = numberOfNights;
    }

    public int getReservationTotal(){
    return this.reservationTotal;
    }

    public void setReservationTotal(int reservationTotal){
    this.reservationTotal = reservationTotal;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    void setWeekend(){
    this.isWeekend = isWeekend;
    }
}
