package Test_1;

import java.util.Scanner;

public class Zeros_and_Stars_Pattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print("0");
            }
            System.out.print("*");
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("0");
            }
            System.out.print("*");

            for(int j=1; j<=n-i; j++)
            {
                System.out.print("0");
            }
            System.out.print("*");
            for(int j=1; j<i; j++)
            {
                System.out.print("0");
            }

            System.out.println();
        }
        sc.close();
    }    
}
