package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<String> famousQuotes = new ArrayList<>();

    public static void main(String[] args) {
                famousQuotes.add("We are gods");
                famousQuotes.add("Look both ways when you cross the street");
                famousQuotes.add("Keep Moving Forward");
                famousQuotes.add("Comparison is the thief of joy");
                famousQuotes.add("Jinkies.");
                famousQuotes.add("Woof woof");
                famousQuotes.add("You can't tell me nothing");
                famousQuotes.add("C'mon homie We Major");
                famousQuotes.add("Got eem");
                famousQuotes.add("No");
Scanner scanner = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

       System.out.println("Choose a number between 1-10.");
       int choice = scanner.nextInt();

       switch(choice) {
           case 1:
               System.out.println(famousQuotes.get(0));
               break;
           case 2:
               System.out.println(famousQuotes.get(1));
               break;
           case 3:
               System.out.println(famousQuotes.get(2));
               break;
           case 4:
               System.out.println(famousQuotes.get(3));
               break;
           case 5:
               System.out.println(famousQuotes.get(4));
               break;
           case 6:
               System.out.println(famousQuotes.get(5));
               break;
           case 7:
               System.out.println(famousQuotes.get(6));
               break;
           case 8:
               System.out.println(famousQuotes.get(7));
               break;
           case 9:
               System.out.println(famousQuotes.get(9));
               break;
           case 10:
               System.out.println(famousQuotes.get(9));
               break;
           default:
               Exception exception = new Exception("Unknown error has occured. Excuse me.");
               System.out.println(exception.getLocalizedMessage());
       }
       }
    }

