//Inspired By Leonardo Tacchi
package Gun_Game;

import javax.xml.stream.events.EndElement;
import java.util.Scanner;

//import com.sun.java.swing.action.NewAction;

import java.util.Random;


public class gun_Game {
    Random prob = new Random();

    public static int p1Turn(int Enemy_health, int health){
        //players turn
        int selectWeapon=0;
        System.out.println("\nYour Turn\n");
        Scanner keypad = new Scanner(System.in);
        selectWeapon= keypad.nextInt();

        if(selectWeapon == 1){
            System.out.println("you choose pistol");
            if(pistolProb() == true){
                Enemy_health = Enemy_health - 5;
                System.out.print("Enemy_health: " + Enemy_health + "\n");

            }
            else{
                System.out.print("Enemy_health: " + Enemy_health + "\n");
            }

        }
        else if (selectWeapon == 2){
            System.out.println("you choose shotgun");
            if(shot_gun_prob() == true){
                Enemy_health = Enemy_health - 25;
                System.out.print("Enemy health: " + Enemy_health + "\n");
            }
            else{
                System.out.print("Enemy health: " + Enemy_health + "\n");

            }
        }
        else if (selectWeapon == 3){
            System.out.println("you choose golden_gun");

            if(golden_prob() == true){
                Enemy_health = Enemy_health - 90;
                System.out.print("Enemy health: " + Enemy_health + "\n");
            }
            else{
                System.out.print("Enemy health: " + Enemy_health + "\n");

            }
        }

        else if (selectWeapon == 4){
            System.out.println("you choose RPG");

            if(rpg_prob() == true){
                Enemy_health = Enemy_health - 70;
                System.out.print("Enemy health: " + Enemy_health + "\n");
            }
            else{
                health = health - 70;
                System.out.print("Enemy health: " + Enemy_health + "\n");
                System.out.print("Your health: " + health + "\n");

            }
        }
        else{
            System.out.println("Not a valid number");
            //selectWeapon=-1;
        }

        return Enemy_health;

    }

    public static int p2Turn(int health, int Enemy_health){
        System.out.println("\nEnemy's Turn\n");
        int enemy_weapon;
        Random enemy_Choice = new Random();
      //  enemy_weapon = enemy_Choice.nextInt(4);
        enemy_weapon = 4;
        if(enemy_weapon == 0){
            System.out.println("Enemy choose pistol");
            if(pistolProb() == true){
                health = health - 10;
                System.out.print("Your health: " + health + "\n");
            }
            else{
                System.out.print("Your health: " + health + "\n");

            }

        }
        else if (enemy_weapon  == 1){
            System.out.println("Enemy choose shotgun");
            if(shot_gun_prob() == true){
                health = health - 25;
                System.out.print("Your health: " + health + "\n");
            }
            else{
                System.out.print("Your health: " + health + "\n");

            }
        }
        else if (enemy_weapon  == 2){
            System.out.println("Enemy choose golden_gun");
            if(golden_prob() == true){
                health = health - 90;
                System.out.print("Your health: " + health + "\n");
            }
            else{
                System.out.print("Your health: " + health + "\n");

            }
        }
        else if (enemy_weapon == 3){
            System.out.println("Enemy choose RPG");

            if(rpg_prob() == true){
                health = health - 70;
                System.out.print("Enemy health: " + health + "\n");
            }
            else{
                Enemy_health = Enemy_health - 70;
                System.out.print("Your health: " + health + "\n");
                System.out.print("Enemy health: " + Enemy_health + "\n");

            }
        }
        return health;
    }

   /* public static void runGame(){
        //Variable Declaration

        while(true){

            while(true){

                while((turn%2) == 0){

                    //players turn
                    System.out.println("\nYour Turn\n");
                    Scanner keypad = new Scanner(System.in);
                    selectWeapon= keypad.nextInt();

                    if(selectWeapon == 1){
                        System.out.println("you choose pistol");
                        if(pistolProb() == true){
                            Enemy_health = Enemy_health - 5;
                            System.out.print("Enemy_health: " + Enemy_health + "\n");
                        }
                        else{
                            System.out.print("Enemy_health: " + Enemy_health + "\n");
                        }

                    }
                    else if (selectWeapon == 2){
                        System.out.println("you choose shotgun");
                        if(shot_gun_prob() == true){
                            Enemy_health = Enemy_health - 25;
                            System.out.print("Enemy health: " + Enemy_health + "\n");
                        }
                        else{
                            System.out.print("Enemy health: " + Enemy_health + "\n");

                        }
                    }
                    else if (selectWeapon == 3){
                        System.out.println("you choose golden_gun");

                        if(golden_prob() == true){
                            Enemy_health = Enemy_health - 90;
                            System.out.print("Enemy health: " + Enemy_health + "\n");
                        }
                        else{
                            System.out.print("Enemy health: " + Enemy_health + "\n");

                        }
                    }

                    else{
                        System.out.println("Not a valid number");
                        //selectWeapon=-1;
                    }

                    turn+=1; //turn = turn+1;

                }

                while((turn%2) == 1){

                System.out.println("\nEnemy's Turn\n");
                int enemy_weapon;
                Random enemy_Choice = new Random();
                enemy_weapon = enemy_Choice.nextInt(3);
                if(enemy_weapon == 0){
                    System.out.println("Enemy choose pistol");
                    if(pistolProb() == true){
                        health = health - 5;
                        System.out.print("Your health: " + health + "\n");
                    }
                    else{
                        System.out.print("Your health: " + health + "\n");

                    }

                }
                else if (enemy_weapon  == 1){
                    System.out.println("Enemy choose shotgun");
                    if(shot_gun_prob() == true){
                        health = health - 25;
                        System.out.print("Your health: " + health + "\n");
                    }
                    else{
                        System.out.print("Your health: " + health + "\n");

                    }
                }
                else if (enemy_weapon  == 2){
                    System.out.println("Enemy choose golden_gun");
                    if(golden_prob() == true){
                        health = health - 90;
                        System.out.print("Your health: " + health + "\n");
                    }
                    else{
                        System.out.print("Your health: " + health + "\n");

                    }
                }

                turn+=1; //turn = turn+1;


            }

        }
        }

    }
*/

    //Function for pistol prob
    public static boolean pistolProb(){
        Random p_prob = new Random();
        //Prob Pistol
        int pistol_Prob = p_prob.nextInt(10);
        if(pistol_Prob <= 8){
            System.out.println("Hit!");
            return true;
        }else{
            System.out.println("Miss!");
            return false;
        }
    }

    //Prob Shot Gun
    public static boolean shot_gun_prob(){
        Random s_prob = new Random();
        int shot_gun_Prob = s_prob.nextInt(10);
        if(shot_gun_Prob <= 5){
            System.out.println("Hit!");
            return true;

        }else{
            System.out.println("Miss!");
            return false;
        }
    }
    //Prob Golden Gun
    public static boolean golden_prob(){
        Random g_prob = new Random();
        int golden_Prob = g_prob.nextInt(25);
        if(golden_Prob < 1){
            System.out.println("Hit!");
            return true;
        }else{
            System.out.println("Miss!");
            return false;
        }
    }

    public static boolean rpg_prob(){
        Random rpg_prob = new Random();
        int rpg =  rpg_prob.nextInt(2);
        if(rpg < 1){
            System.out.println("Hit!");
            return true;
        }else{
            System.out.println("Miss!");
            return false;
        }
    }

    public static void main(String[] args) {

        //String play = "yes";
        Scanner gamePlay = new Scanner(System.in);
        char play = 'y';
        while(play == 'y' || play == 'Y') {
            int health = 100;

            int Enemy_health = 100;

            System.out.println("WELCOME TO... Gun Game!\n How to play...JUST WIN Fugure it out now (type somthing)");
            System.out.println("Choose a gun");
            System.out.println("Type 1 if you choose pistol");
            System.out.println("Type 2 if you choose shotgun ");
            System.out.println("Type 3 if you choose golden_gun");
            System.out.println("Type 4 if you choose rpg");
            //  runGame();

            while (true) {
                //p1Turn(Enemy_health);
                Enemy_health = p1Turn(Enemy_health, health);

                if (Enemy_health <= 0) {
                    System.out.println("\nYou Win!");
                    break;
                }

                //p2Turn(health);
                health = p2Turn(health, Enemy_health);
                if (health <= 0) {
                    System.out.println("\nYou Lose");
                    break;
                }
            }
            System.out.println("\nDo you want to play again? (y/n) ");
            play = gamePlay.next().charAt(0);

        }
    }
}
