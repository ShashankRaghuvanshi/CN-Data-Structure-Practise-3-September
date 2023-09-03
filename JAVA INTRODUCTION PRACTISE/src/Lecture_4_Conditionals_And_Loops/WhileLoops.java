package Lecture_4_Conditionals_And_Loops;

import java.util.Scanner;

public class WhileLoops 
{
    public static void main(String str[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        while(i<=N)
        {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
