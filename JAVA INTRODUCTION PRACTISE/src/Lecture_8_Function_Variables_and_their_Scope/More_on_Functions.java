package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class More_on_Functions 
{
    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static void printEvenNumbers()
    {
        for(int i=2; i<=100; i+=2)
        {
            System.out.println(i);
        }
    }

    public static void printEvenNumbers(int start, int end)
    {
        if(start % 2 != 0)
        {
            start++;
        }
        for(int i=start; i<=end; i+=2)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        printEvenNumbers(3,25);
        printEvenNumbers();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a");
        int a = sc.nextInt();

        System.out.println("Enter the number b");
        int b = sc.nextInt();

        int result = sum(a,b);
        System.out.println(result);

        sc.close();
    }
    
}
