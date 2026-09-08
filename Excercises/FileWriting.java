package Excercises;

import java.io.*;
import java.util.Random;

public class FileWriting 
{
    public static void main(String args[]) throws IOException
    {
        Random randomNumbers = new Random();
        PrintWriter outputFile = new PrintWriter("TestData.txt");
        for (int i = 0; i < 500; i++)
        {
            outputFile.println(randomNumbers.nextInt(100));
        }
        outputFile.close();
    }
}
