package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void printEmployees(Employee newEmployee){
        System.out.println(newEmployee.getId()  + " | " + newEmployee.getName()  + " | " + newEmployee.getHoursWorked() + " | " + newEmployee.getPayRate());
    }
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList<>();
        try {

            BufferedReader reader = new BufferedReader(new FileReader("/Users/nolimit/Desktop/GitProjYU/pluralsight-yearup-2024-04/workbook-3/Exercises/PayRollCalculator/src/main/java/org/example/data-files/employees.csv"));
            reader.readLine();

            String line;
            while((line = reader.readLine()) != null){
               line = reader.readLine();

                String[] columns = line.split("[|]");
                int id = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hours = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);
                Employee employee = new Employee(id,name, hours,payRate);
                employees.add(employee);
                printEmployees(employee);
// even though the names for the variables are similar to the names i the constructer, they are not connected. When we call the costurctor, we use the types from the constructor, and plug in those values with the ones we get from the scanner.

            }

        } catch(Exception ex){
            System.out.println("File is not good.");

        }
        }
    }
