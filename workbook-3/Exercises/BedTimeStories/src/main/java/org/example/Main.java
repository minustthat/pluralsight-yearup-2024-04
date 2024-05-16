package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void readStories(String line){
        try {
            // used a line parameter to put this parameter into the file in frotnt of the extension.
            BufferedReader reader = new BufferedReader(new FileReader("/Users/nolimit/Desktop/GitProjYU/pluralsight-yearup-2024-04/workbook-3/Exercises/BedTimeStories/src/main/java/org/example/Files /" + line + ".txt"));
            while ((line = reader.readLine()) != null) {
                // similar to scaner.hasNextLine()
                // while line is equal to nextline, which isn't a null value, print the next line.
                System.out.println(line);
            }

        } catch (IOException e) {
            // if this isn't possible, throw a new runtime exception (or whatever I please)
            throw new RuntimeException(e);

        }

    }
    public static void main(String[] args) {

        System.out.println("Enter the name of the file you would like to read.");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        // the line in readstories, is the line we take in through the scanner
        readStories(line);

    }


}
