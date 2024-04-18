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
            case "A"  :
                case "a":
                result = numberA + numberB;
                System.out.println(result);
                break;


            case "S":
            case "s":
                result = numberA - numberB;
                System.out.println(result);
                break;

            case "M":
            case "m":
                result = numberA * numberB;
                System.out.println(result);
                break;

            case "D":
            case "d":
                result = numberA / numberB;
                System.out.println(result);
                break;

            default:

                System.out.println(error);
                break;

        }









    }
}