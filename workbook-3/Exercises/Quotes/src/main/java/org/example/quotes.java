package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class quotes {
static String[] quotes = {
        """
"Yes",
"No",
"Maybe",
"Why not",
"Por Que",
"What?",
"Say it aint so" 
"Hmm",
"Ahhhh",
"Got it"


"""
};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        System.out.println("Choose a number between 1-10.");
        int choice = scanner.nextInt();
        try{
            switch (choice){
                case 1:
                    System.out.println(quotes[0]);
                case 2:
                    System.out.println(quotes[1]);
                case 3:
                    System.out.println(quotes[2]);
                case 4:
                    System.out.println(quotes[3]);
                case 5:
                    System.out.println(quotes[4]);
                case 6:
                    System.out.println(quotes[5]);
                case 7:
                    System.out.println(quotes[6]);
                case 8:
                    System.out.println(quotes[7]);
                case 9:
                    System.out.println(quotes[8]);
                case 10:
                    System.out.println(quotes[9]);


            }
        } catch (Exception e) {
            System.out.println("Unknown error has occured. Whoops.");
        }

        }
    }





