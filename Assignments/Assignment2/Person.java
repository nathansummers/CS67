package Assignments.Assignment2;

public class Person 
{
    String name;
    int age;
    float feetTall;
    
    public Person(String name, int age, float feetTall)
    {
        this.name = name;
        this.age = age;
        this.feetTall = feetTall;
    }

    public void display()
    {
        System.out.println(name + " is " + age + " years old and " + feetTall + " feet tall");
    }
}