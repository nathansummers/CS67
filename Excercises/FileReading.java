package Excercises;

import java.util.Scanner;
import java.io.*;

public class FileReading 
{
    public static void main(String args[]) throws IOException
    {
        File myFile = new File("TestData.txt");
        Scanner inputFile = new Scanner(myFile);
        float total = (float)0.0;
        float iterations = (float)0.0;
        while (inputFile.hasNext())
        {
            total += inputFile.nextFloat();
            iterations += 1.0;
        }

        inputFile.close();
        System.out.println("The average is " + (total/iterations));
    }
}
