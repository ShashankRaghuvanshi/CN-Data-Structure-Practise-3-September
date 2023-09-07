package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class How_function_calling_works 
{
    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a");
        int a = sc.nextInt();

        System.out.println("Enter the number b");
        int b = sc.nextInt();

        int result = sum(a,b);
        System.out.println(result);

        sc.close();
    }
}
