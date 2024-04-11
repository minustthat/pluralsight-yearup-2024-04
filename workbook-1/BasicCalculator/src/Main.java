//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers: ");
        float numberA = scanner.nextFloat();
        float numberB = scanner.nextFloat();
        System.out.printf("What would you like to do with these numbers? Press \n (A) for add \n (S) for subtract \n (M) for Multiply \n (D) for divide \n ");
        String userChoice = scanner.next();
        String error = "I don't think you understood the directions...";
        float result;

        switch (userChoice){
            case "A":
                result = numberA + numberB;

            case "S":
                result = numberA - numberB;

            case "M":
                result = numberA * numberB;

            case "D":
                result = numberA / numberB;

            default:
                result = (float) 0;

        }
        if (!userChoice.equals("A") || !userChoice.equals("S") || !userChoice.equals("M") || !userChoice.equals("D")){
            System.out.println(error);
        }
        System.out.println(result);
        






    }
}