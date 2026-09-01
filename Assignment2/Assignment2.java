package Assignment2;

import java.util.Scanner;

public class Assignment2 
{

    public static void main(String args[])
    {
        String name;
        int age;
        float feetTall;
        Scanner keyboard = new Scanner(System.in);
        Person newPerson = new Person("name", 0, (float) 0.0);
        Person personOne = newPerson;
        Person personTwo = newPerson;
        Person personThree = newPerson;
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("what is the name of person #" + i + "?");
            name = keyboard.nextLine();
            System.out.println("how old is this person?");
            age = keyboard.nextInt();
            System.out.println("how tall is this person?");
            feetTall = keyboard.nextFloat();
            keyboard.nextLine();
            newPerson = new Person(name, age, feetTall);

            if (i == 1)
            {
                personOne = newPerson;
            }

            else if (i == 2)
            {
                personTwo = newPerson;
            }

            else if (i == 3)
            {
                personThree = newPerson;
            }

        }
        keyboard.close();
        //System.out.println("Person 1:");
        personOne.display();
        //System.out.println("Person 2:");
        personTwo.display();
        //System.out.println("Person 3:");
        personThree.display();
    }
}
