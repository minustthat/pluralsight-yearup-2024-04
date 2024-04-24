package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class inventory {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/nolimit/Desktop/GitProjYU/pluralsight-yearup-2024-04/workbook-3/Exercises/PayRollCalculator/src/main/java/org/example/data-files/products.csv"));
            reader.readLine();
            String input;
            while ((input = reader.readLine()) != null) {

                // input holds the current line, null ensures that it is a boolean so it can be used for the loop.
                // basically, while the nextline valuable is not null, print everything.
                System.out.println(input);
            }
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
    }
}
