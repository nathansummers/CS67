package IntroToClasses;

public class Book {
    String title;
    String author;

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    public void introduce()
    {
        System.out.println
        (
            "This book is titled " + title + ", and it is written by " + author
        );
    }  
}
