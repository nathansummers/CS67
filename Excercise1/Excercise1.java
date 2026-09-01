package Excercise1;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int people;
        float totalBill;
        System.out.println("Please enter the number of people:");
        people = keyboard.nextInt();
        System.out.println("Please enter the total of the bill:");
        totalBill = keyboard.nextFloat();
        totalBill *= 1.15; 
        System.out.println("with a 15 percent tip, the total bill is $" + totalBill);
        System.out.println("Each person owes $" + totalBill / people);
        keyboard.close();
    }
}
