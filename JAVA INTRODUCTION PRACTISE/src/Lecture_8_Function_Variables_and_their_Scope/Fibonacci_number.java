package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Fibonacci_number 
{
    public static void fibonacciCheck(int n)
    {
        if(n == 0 || n==1)
        {
            System.out.println("Fibonacci number");
            return;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        while(c<n)
        {
            c = a + b;
            a = b;
            b = c;
        }
        if(c == n)
        {
            System.out.println("Fibonacci number");
        }
        else
        {
            System.out.println("Not Fibonacci number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        fibonacciCheck(n);
        sc.close();
    }
}
