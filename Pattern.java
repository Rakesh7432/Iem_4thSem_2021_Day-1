import java.io.*;
public class Pattern
{
    public static void Stars(int p)
    {
        int i, j;
    for(i=0; i<p; i++)
    {
        for(j=0; j<=i; j++)
        {           
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void main(String args[])
{
    int p = 5;
    Stars(p);
}
}