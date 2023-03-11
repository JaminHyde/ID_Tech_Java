package Lecture.Functions;

public class Main {



    public static void F1(){
        for(int i = 0; i < 5; i ++){
            System.out.println("Meatloaf");
        }

    }

    public static int bob(int ok){

        ok = (ok * ok) + 23;

        return ok;
    }

    public static void main(String args[]){
        //Function Call
        F1();
        System.out.println(" ");
        int no = 90;
        int yes = no - 78;
        String i = "Hi ";
        String j = "John";
        String ij = i + j;
        System.out.println(ij);

        bob(no - 3);

        System.out.println(bob(yes));

        no = bob(no);

        System.out.println(no);

    }
}
