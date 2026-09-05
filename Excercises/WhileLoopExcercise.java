package Excercises;

import java.util.Scanner;

public class WhileLoopExcercise 
{

    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        /*
        while (true)
        {
            System.out.println("Enter a number:");
            if (keyboard.nextInt() == 7)
            {
                System.out.println("You got the magic number!");
                break;
            }
        }

        int iterator = 0;
        while (iterator < 1024)
        {
            iterator += 2;
            System.out.println(iterator);
        }

        int notAnIterator = 0;
        while (notAnIterator < 3)
        {
            //theres nothing here :(
        }
        */

        //for loop nonsense
        


        for (int i = 1; i <=5; i++)
        {
            System.out.println(i);
        }
        for (int i = 33; i <= 66; i+=3)
        {
            System.out.println(i);
        }
        /*infinite loop
        for (int i = 0; i <= 1; i--)
        {
            //infinite loop
        }
        */
       int sumOf99 = 0;
        for (int i = 0; i < 100; i++)
        {
            sumOf99 += i;
        }
        System.out.println("sum of 99: " + sumOf99);
        for (int i = 100; i >= 0; i--)
        {
            System.out.println(i);
        }


        keyboard.close();
    }
}
