package Excercises;

public class Person 
{
    private Date birthDay;
    private String name;
    
    public Person(String name, Date birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getBirthDay()
    {
        return this.birthDay;
    }

    public void setBirthDay(Date birthDay)
    {
        this.birthDay = birthDay;
    }
}

