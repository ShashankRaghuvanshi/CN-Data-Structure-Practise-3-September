package Lecture_4_Conditionals_And_Loops;

import java.util.Scanner;

public class Multiplication_Table 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i=1;
        int p = 1;
        while(i<=10)
        {
            p = i * n;
            System.out.println(p);
            i++;
        }
        sc.close();
    }
}
