package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class quotes {
static String[] quotes = { "Yes", "No", "Maybe", "Why not", "Por Que", "What?", "Say it aint so", "Hmm", "Ahhhh", "Got it"
};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        System.out.println("Choose a number between 1-10.");
        int choice = scanner.nextInt();

        try {
            for (int i = 0; i < quotes.length; i++) {
                if (choice == 1 ||choice == 2 ) {
                    System.out.println(quotes[i]);
                }
                break;

            }
        }

         catch (Exception e) {
            System.out.println("Unknown error has occured. Whoops.");
        }

        }
    }





