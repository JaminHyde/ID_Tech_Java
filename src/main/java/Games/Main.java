package Games;

public class Main {

    //Function to clear the screen
    public static void clearScreen() {
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();


    }

    public static void main(String[] args){
        System.out.println("Hello Buddy");
        clearScreen();

    }
}