package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Check_Prime 
{
    public static boolean checkPrime(int n)
    {
        int d=2;
        while(d<n)
        {
            if(n%d == 0)
            {
                return false;
            }
            d++;
        }
        return true;
    }

    public static boolean checkPrime2(int n)
    {
        int d=2;
        boolean isPrime= true;
        while(d<n)
        {
            if(n%d == 0)
            {
                isPrime = false;
                break;
            }
            d++;
        }
        // if(isPrime)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return isPrime;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean prime = checkPrime(n);
        System.out.println(prime);

        boolean isPrime = checkPrime2(n);
        System.out.println(isPrime);
        sc.close();
    }    
}
