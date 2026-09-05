package Excercises;

import java.util.Scanner;

public class IfExcercise 
{


    public void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        //excercise 1
        
        /*
        System.out.println("Input the temp:");
        float temp = keyboard.nextFloat();

        if (temp > 90.0)
        {
            System.out.println("Time for ice cream!");
        }
        else 
        {
            System.out.println("No ice cream :(");
        }
        */

        //excercise 2

        System.out.println("How many hours of sleep did you get?");
        float sleepHours = keyboard.nextFloat();


        if (sleepHours > 8.0)
        {
            System.out.println("You are well rested!");
        }

        else if (sleepHours > 4.0)
        {
            System.out.println("The coffee shop us around the corner.");
        }

        else if (sleepHours >= 0.0)
        {
            System.out.println("Are you sure you are awake?");
        }

        else
        {
            System.out.println("Input error");
        }


        keyboard.close();
    }
}