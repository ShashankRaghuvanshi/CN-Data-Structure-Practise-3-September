package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class Nth_Fibonacci_Number 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n == 1 || n==2)
        {
            System.out.println("1");
            return;
        }

        int first = 1;
        int second =1; 
        int next = 0;
        for(int i=3; i<=n; i++)
        {
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println(next);
        sc.close();
    }
}
