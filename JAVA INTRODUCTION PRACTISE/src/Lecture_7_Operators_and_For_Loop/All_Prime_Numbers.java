package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class All_Prime_Numbers 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=2; i<=n; i++)
        {
            boolean prime = true;
            int d=2;
            while(d<i)
            {
                if(i % d == 0)
                {
                    prime = false;
                    break;
                }
                d++;
            }
            if(prime)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
