package Lecture_4_Conditionals_And_Loops;

import java.util.Scanner;

public class Find_power_of_a_number 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("to the power");
        int n = sc.nextInt();

        int p=1;
        int i=1;
        while(i<=n)
        {
            p = p * x;
            i++;
        }
        System.out.println(p);
        sc.close();
    }
}
