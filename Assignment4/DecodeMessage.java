package Assignment4;

import java.util.Scanner;
import java.io.*;

public class DecodeMessage 
{
    public String decode(String filePath, char keyChar, int delay) throws IOException
    {
        String finalString = "";
        File myFile = new File(filePath);
        Scanner inputFile = new Scanner(myFile);

        while (inputFile.hasNext()) 
        {
            String line = inputFile.next();
            for (int i = 0; i < line.length(); i++)
            {
                if (line.charAt(i) == keyChar)
                {
                    finalString += line.charAt(i + delay);
                }
            }
        }
    inputFile.close();
    return  finalString;
    }     
}
