package org.example;

import java.sql.Time;
import java.time.LocalTime;

public class Employee {
   static String employeeId;
    static String name;
    static String department;
   static double payRate;
    static double hoursWorked;
    static double totalPay = hoursWorked * payRate;
    LocalTime currentTime = LocalTime.now();
Time punchIn;
     public static double getTotalPay() {
         return totalPay;
     }

     public static void setTotalPay(double totalPay) {
         Employee.totalPay = totalPay;
     }

     static public double getTotalPay(double payRate, double hoursWorked){
        double totalPay = payRate * hoursWorked;
        return totalPay;
    }
// <editor-fold desc="getters and setters">
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // </editor-fold>
    public void punchIn(Time time){
currentTime

}
public void punchOut(Time time){

}
}
