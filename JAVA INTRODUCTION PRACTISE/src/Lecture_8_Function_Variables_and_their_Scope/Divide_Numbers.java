package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Divide_Numbers 
{
    public static void divideNumbers(int i, int j)
    {
        if(j == 0)
        {
            System.out.println("division by zero not allowed");
            return;
        }
        System.out.println(i/j);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        divideNumbers(i, j);
        sc.close();
    }

}
