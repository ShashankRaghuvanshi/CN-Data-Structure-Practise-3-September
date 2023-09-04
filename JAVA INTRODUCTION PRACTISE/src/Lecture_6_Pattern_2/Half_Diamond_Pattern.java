package Lecture_6_Pattern_2;

import java.util.Scanner;

public class Half_Diamond_Pattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println("*");
        for(int i=1; i<=n; i++)
        {
            System.out.print("*");
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            for(int j=1; j<=i-1; j++)
            {
                System.out.print(i-j);
            }
            System.out.println("*");
        }
        for(int i=1; i<=n-1; i++)
        {
            System.out.print("*");
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(j);
            }
            for(int j=1; j<n-i; j++)
            {
                System.out.print((n-i)-j);
            }
            System.out.println("*");
        }
        System.out.println("*");
        sc.close();
    }
}
