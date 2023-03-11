package Lecture.arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random rand = new Random();
        int[][] grades = new int[5][5];
        int num1Cnt = 0;
        int num2Cnt = 0;
        int runCnt = 0;
        boolean run = true;


        String name = "Benji";
        char[] nameArr = name.toCharArray();
        System.out.println(nameArr[3]);
        int size = nameArr.length;
        System.out.println(size);
        for(int i = 0; i < size; i++){
            System.out.print(nameArr[i]);
        }

        while(run){
            for(int r = 0; r < 5; r++){
                for(int c = 0; c < 5; c++){
                    grades[r][c] = rand.nextInt(100);

                }
            }

            for(int r = 0; r < 5; r++){
                for(int c = 0; c < 5; c++){
                    System.out.print(grades[r][c] + " ");
                }
                System.out.println("\n");
            }

            for(int r = 0; r < 5; r++){
                for(int c = 0; c < 5; c++){
                    //81
                    if(grades[r][c] == 7){
                        num1Cnt++;
                        run = false;
                    }

                }

            }
            runCnt++;
        }

        System.out.println("It took " + runCnt + " tries to get 81 or 14");
    }
}
