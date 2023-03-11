package Lecture.Looping_arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        int tot = 0;
        Scanner names = new Scanner(System.in);

        int grades[][] = new int[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){

                grades[i][j] = tot;
                tot++;
            }

        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println(" ");
        }
        /*




        System.out.println("i: " + i);

            for(int j = 0; j < 3; j++){
                System.out.println("j: " + j);
                System.out.println("Hi");
            }

            System.out.println("Loop " + i + " done\n");

        int tot = 0;
        String student_name[] = new String[5];
        for(int i = 0; i < 5; i++){
           System.out.println("Type the names of the students in your class");
            student_name[i] = names.nextLine();

        }
        for(int i = 0; i < 5; i++){
            tot = tot + i;
            System.out.println(tot);
        }
        */

    }
}
