package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int squareSum(int[] n)
    {
        int sum = 0;
       int value = Arrays.stream(n).forEach(num-> (num * num)))


        //Your Code
        for(int num: n){
          sum = (num * num) + sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println(squareSum(new int[]{2, 3, 4}));



    }


}