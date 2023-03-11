package Debugging;

import java.util.Scanner;

public class Main {
    //Addition Function
    public static void add(double num1, double num2) {
        double result;
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

    }

    public static void sub(double num1, double num2) {
        double result;
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    public static void main(String[] args) {

        // Declare Variables
        char operator;
        double number1, number2, result;
        boolean calc = true;

        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        while (calc == true) {
            // Ask users to enter operator
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);


            // Ask users to enter numbers
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();


            switch (operator) {

                // Performs addition between numbers
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);

                    //result = add(number1, number2);
                    break;

                // Performs subtraction between numbers
                case '-':
                    sub(number1, number2);
                    break;

                // Performs multiplication between numbers
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                // Performs division between numbers
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;

            }
            System.out.println("Would you like to perform a new calculation? (y/n)\n");
            char calcTemp = input.next().charAt(0);

            if (calcTemp == 'y' || calcTemp == 'Y') {
                calc = true;
            } else if (calcTemp == 'n' || calcTemp == 'N') {
                calc = false;
            } else {
                System.out.println("Not a valid answer.");
            }
        }

        input.close();

    }
}
