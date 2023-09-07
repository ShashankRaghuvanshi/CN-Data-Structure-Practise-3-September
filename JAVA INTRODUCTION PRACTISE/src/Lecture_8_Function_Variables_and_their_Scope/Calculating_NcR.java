package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Calculating_NcR 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        System.out.println("Enter the number r");
        int r = sc.nextInt();

        int factN =1;
        for(int i=1; i<=n; i++)
        {
            factN = factN * i;
        }

        int factR = 1;
        for(int i=1; i<=r; i++)
        {
            factR = factR * i;
        }

        int factNR = 1;
        for(int i=1; i<=n-r; i++)
        {
            factNR = factNR * i;
        }

        int result = factN / (factR * factNR);
        System.out.println(result);
        sc.close();

    }     
}
