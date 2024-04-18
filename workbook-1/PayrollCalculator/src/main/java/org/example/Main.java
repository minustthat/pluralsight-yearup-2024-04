package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        int[] newArray = {1,2,3};


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input your name: ");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName + ", please tell me how many hours you worked this pay period.");
//        int hoursWorked = scanner.nextInt();
//        System.out.println("How much do you make an hour? ");
//        double payRate = scanner.nextDouble();
//        System.out.println("How often do you get paid? Please press w for weekly or b for biweekly. ");
//        String payCycle = scanner.next();
//        double payCheck;
//        switch (payCycle){
//            case "B":
//            case "b":
//                payCheck = hoursWorked * payRate * 2;
//                System.out.println(payCheck);
//            case "W":
//            case "w":
//                payCheck = hoursWorked * payRate ;
//                System.out.println(payCheck);
//
//
//
//        }

        List<Integer> newNumbers = new ArrayList<>();
        for(int i: newArray){
            if( i % 2 == 0){
                newNumbers.add(i);
            }
        }
        System.out.println(newNumbers.size());





    }
}