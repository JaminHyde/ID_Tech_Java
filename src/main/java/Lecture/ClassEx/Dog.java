package Lecture.ClassEx;

public class Dog extends animal {
    static int age;
    static String color;
    static String name;

    public Dog(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }


    public static void bark(){
        System.out.println(name + " barks ruff ruff");
    }

}
