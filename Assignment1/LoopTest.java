package Assignment1;

//Resource: w3schools java loop tutorial
//https://www.w3schools.com/java/java_for_loop.asp
public class LoopTest
{
    public static int MultiplyWithLoops(int a, int b)
    {
        int x = 0;
        for (int i = 0; i < a; i++)
        {
            x += b; 
        }
        return x;
    }

    public static int AddWithLoops(int a, int b)
    {
        int x = b;
        for (int i = 0; i < a; i++)
        {
            x += 1; 
        }
        return x;
    }
}