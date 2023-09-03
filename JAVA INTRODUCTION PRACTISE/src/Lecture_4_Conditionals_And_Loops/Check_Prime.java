package Lecture_4_Conditionals_And_Loops;

import java.util.Scanner;

public class Check_Prime 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 2;
        while(i<n)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                return;
            }
            i++;
        }
        System.out.println("Prime");
        sc.close();
    }    
}
