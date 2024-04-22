package org.example;
import java.util.*;
public class dice {
    public static int roll() {
        return (int) (Math.random() * 6 + 1);
    }


    public static String smash(String[] words) {
        // TODO Write your code below this comment please

        String listString = "";
        for (String word : words) {
            listString +=  word;


        }
        return listString;
    }

    public static void main(String[] args) {
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 20; i++) {
            int roll1 = roll();
            int roll2 = roll();
            System.out.printf("%d  + %d = %d \n", roll1, roll2, roll1 + roll2);
            if (roll1 + roll2 == 2) {
                twoCounter++;

            }
            if (roll1 + roll2 == 4) {
                fourCounter++;
            }
            if (roll1 + roll2 == 6) {
                sixCounter++;
            }
            if (roll1 + roll2 == 7) {
                sevenCounter++;
            }

        }

//        System.out.printf("Two counter : %s \nFour counter : %s\nSix counter: %s \nSeven counter : %s", twoCounter, fourCounter, sixCounter, sevenCounter);
        String[] words = {"Hello", "Goodbye", "Seeya"};
        System.out.println(smash(words).trim());
    }
}



