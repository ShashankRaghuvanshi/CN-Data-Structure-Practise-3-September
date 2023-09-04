package Lecture_6_Pattern_2;

import java.util.Scanner;

public class Code_Diamond_of_stars 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int n=N/2+1;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=n-i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
