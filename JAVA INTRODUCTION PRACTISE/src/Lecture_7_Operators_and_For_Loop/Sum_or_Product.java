package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class Sum_or_Product 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the Choice");
        int c = sc.nextInt();
        if(c == 1)
        {
            int sum=0;
            for(int i=1; i<=n; i++)
            {
                sum = sum + i;
            }
            System.out.println(sum);
        }
        else if(c == 2)
        {
            int p = 1;
            for(int i=1; i<=n; i++)
            {
                p = p * i;
            }
            System.out.println(p);
        }
        else
        {
            System.out.println("-1");
        }
        sc.close();
    }
}
