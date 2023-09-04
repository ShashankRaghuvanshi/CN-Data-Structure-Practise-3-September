package Lecture_6_Pattern_2;

import java.util.Scanner;

public class Odd_Square 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int N = 2*n-1;

        for(int i=1; i<=N; i=i+2)
        {
            for(int j=1; j<=N-i+2; j=j+2)
            {
                System.out.print(i+j-1+" ");
            }
            for(int j=1; j<i; j=j+2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
