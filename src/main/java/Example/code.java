package Example;

//Import Statements
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class code {
    public static void winCheck(String[][] board, int row, int col) {
        System.out.println(" ");
    }

    public static void display(String[][] board){
        for(int r = 0; r < 6; r ++) {
            for (int c = 0; c < 7; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        //board
        String[][] board = new String[6][7];
        //random
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int coord1;
        int coord2;
        int turn = 1;
        String fill;
        boolean game = true;
        for(int r = 0; r < 6; r ++){
            for(int c = 0; c < 7; c++){
                fill = r + "," + c;
                board[r][c] = fill;
            }
        }
        while(game){
            System.out.println("Where would you like to move?");
            display(board);
            coord1 = input.nextInt();
            coord2 = input.nextInt();
            if(turn == 1) {
                board[coord1][coord2] = " X ";
                turn = 2;
            }
            else{
                board[coord1][coord2] = " O ";
                turn = 1;
            }


          //  if (winCheck(board, coord1, coord2)){
               // display(board);
               // game = false;
          //  }
        }


             /*
            for(int r = 0; r < 6; r ++){
                for(int c = 0; c < 7; c++){
                    move = rand.nextInt(100);

                    if (move < 50){
                        board[r][c] = "X";
                    }
                    else{
                        board[r][c] = "O";
                    }
                }
            }
            /*
              */



    }
}
