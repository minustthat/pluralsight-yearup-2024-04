package org.example;

abstract class Asset {
    String description;
    String dateAcquired;
    double originalCost;

    public Asset(String description, String dateAcquired, double originalCost){
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

   abstract double getValue();


}
// USE ENUMS FOR SHAPES, PUT CONDITIONALS ON THOSE, IF COLS[0].EQUALS(TYPE.PARSE(CIRCLE) SHAPE ARRAYLIST.ADD THAT
// SHAPE....