package IntroToClasses;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 19);
        Student student3 = new Student("Charlie", 21);
        Student student4 = new Student("Nathan", 19);
        Book book1 = new Book("Piranesi", "Susanna Clarke");

        student1.introduce();
        student2.introduce();
        student3.introduce();
        student4.introduce();
        book1.introduce();
    }

}