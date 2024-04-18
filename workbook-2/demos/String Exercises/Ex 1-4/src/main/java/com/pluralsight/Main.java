package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // ex 1 logic
    public static String fullName(String firstName, String middleName, String lastName, String suffix){
        String entireName ="";


 entireName = firstName + " " + middleName + " " + lastName + " " + suffix;
        return entireName.trim();
    }

    // Ex2 logic


    public static void main(String[] args) {
// ex 1 in practice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name : ");
        String firstName = scanner.next();
        System.out.println("middle name (type n if none) : ");
        String middleName = scanner.next();
        if(middleName.equals("n")){
            middleName = "";
        }

        System.out.println("Last name: ");
        String lastName = scanner.next();
        System.out.println("Suffix (type n if none) :");
        String suffix = scanner.next();
        if (suffix.equals("n")){
            suffix = "";

        }
System.out.println(fullName(firstName, middleName, lastName, suffix).trim());
     //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }


}