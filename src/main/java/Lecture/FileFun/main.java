package Lecture.FileFun;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        File myFile = new File("E:\\id Tech\\ID_Tech_Java\\src\\main\\java\\Lecture\\FileFun\\Text.txt");
        //Scanner input = new Scanner(System.in);

        try {
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()){
                String b = reader.nextLine();
                //System.out.println(b);
                System.out.println(myFile.length());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }

}
