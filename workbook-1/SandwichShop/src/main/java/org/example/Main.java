package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String rps(String p1, String p2) {
        String p1won = "Player 1 wins";
        String p2won = "Player 2 wins";
        String result = "";
        switch (p1){
            case "rock":

                if(p2.equals("scissors")){
                    result = "Player 1 won!";
                }
                if (p2.equals("paper")){
                    result =  "Player 2 won!";
                }
                if (p2.equals("rock")) {
                    result = "Draw";
                }
            case "paper":
                if(p2.equals("scissors")){
                    result = "Player 2 won!";
                }
                if (p2.equals("paper")){
                    result = "Player 2 won!";
                }
                if (p2.equals("rock")) {
                    result = "Player 1 won!";
                }
            case "scissors":
                if(p2.equals("scissors")){
                    result = "Draw!";
                }
                if (p2.equals("paper")){
                    return "Player 1 won!";
                }
                if (p2.equals("rock")) {
                    result = "Player 2 won!";
                }
return result;

        }
        return result;
    }




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner scanner = new Scanner(System.in);
//        System.out.printf("What size sandwich would you like?  \n R for regular ($5.95) \n L for Large ($8.95). \n");
        String choice = scanner.next();
        float regularPrice = 5.95F;
        float largePrice = 8.95F;
        float customerPrice;



//        switch (choice) {
//            // regular price
//            case "R":
//            case "r":
//                customerPrice = 5.45F;
//                System.out.println("How old are you?");
//                int age = scanner.nextInt();
//                System.out.println("Would you like a loaded size? ");
//                String loaded = scanner.next();
//                // discount
//                if (age <= 17 && loaded.equals("Y") || loaded.equals("y")) {
//                    float youngCustomerPrice = (float) (customerPrice - (customerPrice * .10) + 1);
//                    System.out.println(youngCustomerPrice);
//                    break;
//                }
//                if (65 < age ) {
//                    float seniorPrice = (float) (customerPrice - (customerPrice * .20) + 1);
//                    System.out.println(seniorPrice);
//                    break;
//                }
//            default:
//                System.out.println(regularPrice);
//
//
//
//
//            case "L":
//            case "l":
//                customerPrice = 8.95F;
//                System.out.println("How old are you?");
//                int largeAge = scanner.nextInt();
//                // discount
//                System.out.println("Would you like a loaded size? ");
//                String loadedLarge = scanner.next();
//                // discount
//                if (largeAge <= 17 && loadedLarge.equals("Y") || loadedLarge.equals("y")) {
//                    float youngCustomerPrice = (float) (customerPrice - (customerPrice *.10 ) + 1);
//                    System.out.println(youngCustomerPrice);
//                    break;
//                }
//                if (65 < largeAge ) {
//                    float seniorPrice = (float) (customerPrice - (customerPrice * 0.20) + 1);
//                    System.out.println(seniorPrice);
//                    break;
//                } else {
//
//                    System.out.println(largePrice);
//                    break;
//                }
//
//
//        }

        System.out.println(rps("rock","paper"));





    }
}