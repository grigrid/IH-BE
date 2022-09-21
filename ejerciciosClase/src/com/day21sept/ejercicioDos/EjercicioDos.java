package com.day21sept.ejercicioDos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) throws IOException {


        File fileData = new File("oscar_age.csv");
        Scanner fileReader = new Scanner(fileData);
        FileWriter fileWriter = new FileWriter("newFileOscars.txt", false);

        fileReader.nextLine();
        while (fileReader.hasNextLine()){
            // fileWriter.write(fileReader.nextLine() + "\n");
            //System.out.println(fileReader.nextLine());
            String[] linesDiv = fileReader.nextLine().split(",");
            System.out.println(Arrays.toString(linesDiv));
            System.out.println("Name: " + linesDiv[1] );
            System.out.println("Year: " + linesDiv[2] );
            System.out.println("Age: " + linesDiv[3] );
            System.out.println( "Movie: " + linesDiv[4] );
            System.out.println("=============");
            fileWriter.write("Name: " + linesDiv[1] + "\n");
            fileWriter.write("Year: " + linesDiv[2] + "\n");
            fileWriter.write("Age: " + linesDiv[3] + "\n");
            fileWriter.write( "Movie: " + linesDiv[4]+ "\n");
            fileWriter.write("============="+ "\n");

        }

        fileReader.close();
        fileWriter.close();

    }
}
