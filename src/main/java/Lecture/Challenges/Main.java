package Lecture.Challenges;
import java.util.Scanner;

public class Main {

    //Challenge 1 Function Solution
    public static void ageConvert(int age){
        int days = age * 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println("If your age is " + age +" You are " + days + " days old");
        System.out.println("You are have lived " + minutes + " minutes");
        System.out.println("Or you are have lived " + seconds + " seconds");

    }
    //C2
    public static int power(int base, int pow){
        int tot = base;
        for(int i = 0; i < pow; i ++){
            tot = tot * base;
        }

        return tot;
    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        /*
        Challenge 1:
        Age Converter: Converts age into days, minutes, and seconds
        - Takes in age from the user
        - Passes age into a function
        - Function converts age into days, minutes, and seconds
        - Function displays those values to the user
         */
        /*
        int age = input.nextInt();
        ageConvert(age);
         */
        /*
        Challenge 2:
        Power Calculator: Takes and a number and what to raise it to, then returns to the user
        - Take in 2 ints from the user, base number and the power to raise it by
        - Passes those to a function
        - Function Calculates what the base number is raised by the power
        - Function returns that value
        - Main Displays both numbers and the result
         */

        /*
        Challenge 3:
        Calculator: Simple Calculator that asks for 2 numbers and an operator and then calculates
        - Take in a double from the user
        - Take in the operator from user
        - Take in 2nd number from the user
        - Make four functions one for each operator
        - Based on the operator send the 2 numbers to a function to calcuate
        - Function Returns the value to main
        - Value prints out in main along with the original numbers and operator
         */
        /*

         */
        /*
        Challenge 4:
        Word Reversal: User inputs a String, a reverse of the input is outputted
        - Take in a string input from the user
        - Send the string to a function
        - The function reverses the string input and returns it to main
        - Main displays both the original and the reversed
         */
        /*

         */
    }

}
