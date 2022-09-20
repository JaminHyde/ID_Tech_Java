package Games;

import java.util.Scanner;

public class TicTacToe {

     public static void boardPrint(char[] board){
          System.out.println(" " + board[0] + " " + " | " + board[1] + " | " + board[2]);
          System.out.println("------------");
          System.out.println(" " + board[3] + " " + " | " + board[4] + " | " + board[5]);
          System.out.println("------------");
          System.out.println(" " + board[6] + " " + " | " + board[7] + " | " + board[8] + "\n");
     }
     public static void main(String[] args){

          char[] Board = {' ', ' ',' ', ' ',' ', ' ',' ', ' ', ' '};
          char[] guide = {'0', '1','2', '3','4', '5','6', '7', '8'};
          Scanner input = new Scanner(System.in);
          int move;
          System.out.println("This is the guide on what numbers corrasond to their location");
          boardPrint(guide);
          System.out.println("Where would you like to move? (0-8)");
          move = input.nextInt();
          Board[move] = 'X';
          boardPrint(Board);
          System.out.println("Where would you like to move? (0-8)");
          move = input.nextInt();
          Board[move] = 'O';
          boardPrint(Board);


     }

     }





