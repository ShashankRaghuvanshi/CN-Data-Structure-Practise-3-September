package Test_1;

import java.util.Scanner;

public class Number_Star_Pattern_1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print((n-j+1));
            }
            System.out.print("*");
            for(int j=1; j<i; j++)
            {
                System.out.print(i-j);
            }
            System.out.println();
        }
        sc.close();
    }    
}
