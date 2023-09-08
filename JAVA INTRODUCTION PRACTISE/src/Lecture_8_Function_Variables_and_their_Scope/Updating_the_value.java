package Lecture_8_Function_Variables_and_their_Scope;

public class Updating_the_value 
{
    public static int increment(int n)
    {
        n++;
        return n;
    }

    public static void main(String args[])
    {
        int n =10;
        n = increment(n);
        System.out.println("Main "+n);
    }
}
