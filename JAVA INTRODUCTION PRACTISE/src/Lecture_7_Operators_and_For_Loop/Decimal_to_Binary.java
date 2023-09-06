package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class Decimal_to_Binary 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int r;
        int sum = 0;
        int count = 0;
        while(n>0)
        {
            r = n % 2;
            sum = (int) (sum + r * Math.pow(10, count));
            n = n / 2;
            count++;
        }
        System.out.println(sum);
        sc.close();
    }
}
