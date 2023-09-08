package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

// Repetative
// Readability
// Testability

public class What_and_Why_of_Functions 
{
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static int ncr(int n, int r)
    {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);

        int result = factN / (factR * factNR);
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();

        int result = ncr(n, r);
        System.out.println(result);
        sc.close();
    }
}
