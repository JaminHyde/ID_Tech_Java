package Lecture.randomTesting;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Character Player = new Character();
        int counter;
        String question;
        counter = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("What do you want your name to be?");
        Player.name = Input.next();
        System.out.println("You have 75 points.");
        System.out.println("What do you want your strength to be?");
        Player.str = Input.nextInt();
        counter = counter + Player.str;
        System.out.println("What do you want your dexterity to be?");
        Player.dex = Input.nextInt();
        counter = counter + Player.dex;
        System.out.println("What do you want your constitution to be?");
        Player.con = Input.nextInt();
        counter = counter + Player.con;
        System.out.println("What do you want your intelligence to be?");
        Player.intel = Input.nextInt();
        counter = counter + Player.intel;
        System.out.println("What do you want your charisma to be?");
        Player.chr = Input.nextInt();
        counter = counter + Player.chr;
        System.out.println("What do you want your wisdom to be?");
        Player.wis = Input.nextInt();
        counter = counter + Player.wis;
        System.out.println("bird");
        question = Input.nextLine();
        System.out.println(question);
    }
}
