package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class Break_and_Continue 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int d=2;
        while(d<n)
        {
            if(n % d == 0)
            {
                System.out.println("Not prime");
                return;
            }
            d++;
        }
        System.out.println("Prime");
        sc.close();
    }
}
