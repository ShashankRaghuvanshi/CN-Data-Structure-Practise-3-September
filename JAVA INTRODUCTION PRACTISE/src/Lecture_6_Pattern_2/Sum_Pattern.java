package Lecture_6_Pattern_2;

import java.util.Scanner;

public class Sum_Pattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int sum=0;
            for(int j=1; j<i; j++)
            {
                System.out.print(j+"+");
            }
            for(int j=i; j==i; j++)
            {
                System.out.print(j+"=");
            }
            for(int j=1; j<=i; j++)
            {
                sum = sum + j;
            }
            System.out.println(sum);
        }
        sc.close();

    }
}
