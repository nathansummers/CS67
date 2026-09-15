package Excercises;

public class PersonDateDriver 
{
    public static void main(String args[])
    {
        Date newDate = new Date(11, 7, 2007);
        Person newPerson = new Person("Nathan Summers", newDate);

        System.out.println("This persons name is " + newPerson.getName() + ", and they were born on " + newPerson.getBirthDay().toString());
    }    

}
