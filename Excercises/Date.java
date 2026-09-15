package Excercises;

public class Date 
{
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        String dayString = Integer.toString(day);
        String monthString = Integer.toString(month);
        String yearString = Integer.toString(year);
        return dayString + "/" + monthString + "/" + yearString;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getDay()
    {
        return this.day;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getMonth()
    {
        return this.month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return this.year;
    }



}
