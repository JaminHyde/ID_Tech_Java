package CrimeCYOA;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static char winCheck(int choice, String[] choices){
        char win;
        if(choices[choice] == choices[0]){
            //Winner Stuff
            win = 'y';
        }
        else{
            //loser stuff
            win = 'n';
        }
        return win;
    }
    public static void main(String[] args){
        //Instances
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //Variable Dec
        int choice;
        char win = ' ';
        String[] winners ={"Motercycle", "Teleporter", "Disquise"};
        String[] losers ={"Bomb", "Magic 8 Ball", "Laser Gun", "Helicopter", "Antigravity Postion", "Machine Gun"};


        //Level 1
        int winChoice = rand.nextInt(3);
        int loser1 = rand.nextInt(6);
        int loser2 = rand.nextInt(6);
        while (loser1 == loser2) {
            loser2 = rand.nextInt(6);
        }
        String[] choices = {winners[winChoice], losers[loser1], losers[loser2] };
        int choice1 = rand.nextInt(3);
        int choice2 = rand.nextInt(3);
        int choice3 = rand.nextInt(3);

        while (choice1 == choice2){
            choice2 = rand.nextInt(3);
        }
        while (choice1 == choice3 || choice2 == choice3){
            choice3 = rand.nextInt(3);
        }

        //Level 2
        String[] lv2_winners ={"Gun", "PS5", "Mind Control"};
        String[] lv2_losers ={"Phone", "Speakers", "Running Shoes", "Pickaxe", "Legos", "Smoke Bomb"};
        int lv2_winChoice = rand.nextInt(3);
        int lv2_loser1 = rand.nextInt(6);
        int lv2_loser2 = rand.nextInt(6);
        while (lv2_loser1 == lv2_loser2) {
            lv2_loser2 = rand.nextInt(6);
        }
        String[] lv2_choices = {lv2_winners[lv2_winChoice], lv2_losers[lv2_loser1], lv2_losers[lv2_loser2] };
        int lv2_choice1 = rand.nextInt(3);
        int lv2_choice2 = rand.nextInt(3);
        int lv2_choice3 = rand.nextInt(3);

        while (lv2_choice1 == lv2_choice2){
            lv2_choice2 = rand.nextInt(3);
        }
        while (lv2_choice1 == lv2_choice3 || lv2_choice2 == lv2_choice3){
            lv2_choice3 = rand.nextInt(3);
        }

        //Asking user for input
        System.out.println("You successfully made it into the bank! Now it is time to get into the vault");
        System.out.println("1. " + choices[choice1] + "\n2. " + choices[choice2] + "\n3. " + choices[choice3]);
        System.out.println("What option would you like to choose? ");
        choice = input.nextInt();

        switch(choice){
            //if choice ==
            case 1:
               // System.out.println("You choose " + choices[choice1] );
                win = winCheck(choice1, choices);
                if (choices[choice1] == choices[0]){
                    choice = 0;
                }
                else if (choices[choice1] == choices[1]){
                    choice = 1;
                }
                else{
                    choice = 2;
                }
                break;
            //else if
            case 2:
              //  System.out.println("You choose " + choices[choice2] );
                win = winCheck(choice2, choices);
                if (choices[choice2] == choices[0]){
                    choice = 0;
                }
                else if (choices[choice2] == choices[1]){
                    choice = 1;
                }
                else{
                    choice = 2;
                }
                break;
            //else if
            case 3:
                //System.out.println("You choose " + choices[choice3] );

                win = winCheck(choice3, choices);
                if (choices[choice3] == choices[0]){
                    choice = 0;
                }
                else if (choices[choice3] == choices[1]){
                    choice = 1;
                }
                else{
                    choice = 2;
                }
                break;
            //else
            default:
                System.out.println("Not a vaild choice");
                break;
        }


        //System.out.println(win);
        if (win == 'y'){
            if(choices[choice] == "Motercycle"){
                System.out.println("You smash your Harly through the glass front speeding up to the tellers.");
            }
            else if(choices[choice] == "Teleporter"){
                System.out.println("You teleport into the back of the bank and no one notices your entry.");
            }
            else{
                System.out.println("You disquise yourself as one of the guards and sneak into the bank.");
            }
        }
        else if(win == 'n'){
            if(choices[choice] == "Bomb"){
                System.out.println("Your bomb bounces off the wall and it blows you up.");
            }
            else if(choices[choice] == "Magic 8 Ball"){
                System.out.println("You shook the 8 ball and it said try again later as you are surrounded by police and get sent to jail.");
            }
            else if(choices[choice] == "Laser Gun"){
                System.out.println("You shoot your laser gun at the front but the windows are too reflect and it bounces back and cuts you in half.");
            }
            else if(choices[choice] == "Helicopter"){
                System.out.println("You try to fly your heli but a pidgon gets caught in your roter and you crash.");
            }
            else if(choices[choice] == "Antigravity Postion"){
                System.out.println("As you take a sip of the anti gravity postion you fly up and never stop floating up.");
            }
            else{
                System.out.println("As you start up your machine you realise that you forgot all of your ammo! ");
            }

        }
        else{
            System.out.println(" ");
        }

        //Level 2
        if (win == 'y') {
            //Asking user for input
            System.out.println("1. " + lv2_choices[lv2_choice1] + "\n2. " + lv2_choices[lv2_choice2] + "\n3. " + lv2_choices[lv2_choice3]);
            System.out.println("What option would you like to choose? ");
            choice = input.nextInt();

            switch(choice){
                //if choice ==
                case 1:
                    System.out.println("You choose " + lv2_choices[lv2_choice1] );
                    win = winCheck(lv2_choice1, lv2_choices);
                    if (lv2_choices[lv2_choice1] == lv2_choices[0]){
                        choice = 0;
                    }
                    else if (lv2_choices[lv2_choice1] == lv2_choices[1]){
                        choice = 1;
                    }
                    else{
                        choice = 2;
                    }
                    break;
                //else if
                case 2:
                    System.out.println("You choose " + lv2_choices[lv2_choice2] );
                    win = winCheck(lv2_choice2, lv2_choices);
                    if (lv2_choices[choice2] == lv2_choices[0]){
                        choice = 0;
                    }
                    else if (lv2_choices[lv2_choice2] == lv2_choices[1]){
                        choice = 1;
                    }
                    else{
                        choice = 2;
                    }
                    break;
                //else if
                case 3:
                    System.out.println("You choose " + lv2_choices[lv2_choice3] );

                    win = winCheck(lv2_choice3, lv2_choices);
                    if (lv2_choices[lv2_choice3] == lv2_choices[0]){
                        choice = 0;
                    }
                    else if (lv2_choices[lv2_choice3] == lv2_choices[1]){
                        choice = 1;
                    }
                    else{
                        choice = 2;
                    }
                    break;
                //else
                default:
                    System.out.println("Not a vaild choice");
                    break;
            }


            //System.out.println(win);

            if (win == 'y'){
                if(lv2_choices[choice] == "Gun"){
                    System.out.println("You pull out a gun and the people get scared and let you into the vault");
                }
                else if(lv2_choices[choice] == "PS5"){
                    System.out.println("You pull out your PS5 and it casues everyone to want to play and be distracted");
                }
                else{
                    System.out.println("You use your mind control to force someone to let you into the vault");
                }
            }
            else if(win == 'n'){
                if(lv2_choices[choice] == "Phone"){
                    System.out.println("You call 911 and say that you need help robbing a bank, but they come and arrest you instead");
                }
                else if(lv2_choices[choice] == "Speakers"){
                    System.out.println("You start blasting music through your speakers but it just covers the sound of sirens so you cant hear the police who show up to arrest you");
                }
                else if(lv2_choices[choice] == "Running Shoes"){
                    System.out.println("You switch into your running shoes, hoping that you will be fast enough... you weren't fast enough");
                }
                else if(lv2_choices[choice] == "Pickaxe"){
                    System.out.println("You try to use your pickaxe to break though the vault doors but it snaps");
                }
                else if(lv2_choices[choice] == "Legos"){
                    System.out.println("You throw down legos in order to stop anyone from following you but  you slip and fall backwards on them");
                }
                else{ //smoke bomb
                    System.out.println("You light a smoke bomb to try to hide you trying to get into the vault but they are old and expired and dont give enough smoke");
                }

            }
            else{
                System.out.println(" ");
            }
        }
    }
}
