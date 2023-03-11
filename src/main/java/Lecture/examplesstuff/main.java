package Lecture.examplesstuff;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int x;
        Scanner cats = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            x = cats.nextInt();
            if (x == 87) {
                break;
            }
        }
    }
}
