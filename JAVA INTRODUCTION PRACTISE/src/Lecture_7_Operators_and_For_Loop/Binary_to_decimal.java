package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class Binary_to_decimal 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n = sc.nextInt();
        int r;
        int sum = 0;
        int count=0;
        while(n>0)
        {
            r = n % 10;
            sum = (int) (sum + r * Math.pow(2, count));
            n = n /10;
            count++;
        }
        System.out.println(sum);
        sc.close();
    }
}
