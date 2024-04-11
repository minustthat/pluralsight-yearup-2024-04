package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MathApp
{


    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()
    {
        // Question 1:
        // declare variables here
    int bobSalary = 10000;
    int garySalary = 20000;



        // code the logic to the problem here
        int highestSalary = Math.max(bobSalary , garySalary);

        // use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
 int carPrice = 20000;
 int truckPrice = 45000;


        // code the logic to the problem here
int vehicleWithSmallerPrice = Math.min(carPrice, truckPrice);

        // use System.out.println() to display results
        System.out.println("Smallest price is " + vehicleWithSmallerPrice);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
double circleRadius = 7.25;


        // code the logic to the problem here
double circleArea = Math.PI * Math.pow(circleRadius,2);

        // use System.out.println() to display results
        System.out.println("Area is : " + circleArea);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
double varSquareRt = 5.0;

        // code the logic to the problem here
double squareRtOfVar = Math.sqrt(varSquareRt);

        // use System.out.println() to display results
        System.out.println(squareRtOfVar);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here


int pointX1 = 5;
int pointY1 = 10;

int pointX2 = 85;
int pointY2 = 50;



        // code the logic to the problem here


        double finalCordX = Math.pow((pointX2 - pointX1),2);
        double finalCordY = Math.pow((pointY2-pointY1),2);
        double finalDistance = Math.sqrt(finalCordX + finalCordY);


        // use System.out.println() to display results
        System.out.println("Distance is " + finalDistance);

        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here
double absVariable = -3.8;


        // code the logic to the problem here
double absoluteValueOfVariable = Math.abs(absVariable);

        // use System.out.println() to display results
        System.out.println(absoluteValueOfVariable);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here
        double randomNum = Math.random();

        // code the logic to the problem here


        // use System.out.println() to display results
        System.out.println(randomNum);
        // ex: System.out.println("The answer is " + answer);






        // random number between 50 and 100

        int j = 0;

        List <Integer> ranges = new ArrayList<>();
        for(int i = 50 ; i <= 100; i++){
            ranges.add(i);
        }


        for(int i = 50; i <= ranges.size() ; i++){
           j = (int)(Math.random() * 100);
            i = j;
        }
        System.out.println(j);

    }
}