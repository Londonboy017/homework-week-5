package homeworkweek_06;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        //ask users to enter operator
        System.out.println("Choose an operator:+,-,*,/");
        operator = input.next().charAt(0);

        // ask users to enter first numbers
        System.out.println("Enter first number:");
        number1 = input.nextDouble();

        // ask users to enter second numbers
        System.out.println("Enter Second number:");
        number2 = input.nextDouble();

        switch (operator) {
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;

            case '-'://perform substraction between numbers
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            case '*':// perform multiplication between numbers
                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;
            case '/'://perform division between numbers
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }

}
