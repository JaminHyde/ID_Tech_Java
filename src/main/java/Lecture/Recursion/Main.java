package Lecture.Recursion;

public class Main {
    public static void F1(int num){
        System.out.println(num);
        num = num + 1;
        if (num <= 100){
            F1(num);
        }

    }


    public static void main(String args[]){
        int num = 1;
       // F1(x);



    }
}
