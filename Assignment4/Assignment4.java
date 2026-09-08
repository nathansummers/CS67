package Assignment4;

import java.io.*;

// Message 1: EatMoreVegetables
// Message 2: FourCharsAfterW
// Message 3: tinyurl.com/3s847myv

public class Assignment4 
{
    public static void main(String args[]) throws IOException
    {
        DecodeMessage decoder = new DecodeMessage();
        String message = decoder.decode("Assignment4Input.txt", 'X', 3);
        System.out.println(message);
        message = decoder.decode("Assignment4Input.txt", 'Y', 5);
        System.out.println(message);
        message = decoder.decode("Assignment4Input.txt", 'W', 4);
        System.out.println(message);
    }
}
