package org.example;

import java.time.LocalDate;

public class Vehicle extends Asset{
    String makeModel;
    int year;
    int odometer;
// <editor-fold desc="getters and setters">
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
// </editor-fold>
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer){
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double finalCost = 0;
        int costPerYear;
        int thisYear = 2024;

        for(int i = 0; i < 4 ; i++) {
            if (thisYear - year <= 3) {
                finalCost = originalCost - (originalCost * (0.03 * i));
            }
        }
        for(int i = 4; i < 7 ; i++) {
            if (thisYear - year <= 6 && thisYear - year >= 3) {
                finalCost = originalCost - (originalCost * (0.06 * i));
            }
        }

        for(int i = 7; i < 11 ; i++) {
            if (thisYear - year <= 10) {
                finalCost = originalCost - (originalCost * (0.08 * i));
            }
        }
        if(10 < thisYear - year){
            finalCost = 1000;
        }
        if(1000000 < odometer){
            finalCost = originalCost - (originalCost * .25);
        } else if(makeModel.contains("Honda") || makeModel.contains("Toyota")){
            return getValue();
        }

        return finalCost;
    }
}
