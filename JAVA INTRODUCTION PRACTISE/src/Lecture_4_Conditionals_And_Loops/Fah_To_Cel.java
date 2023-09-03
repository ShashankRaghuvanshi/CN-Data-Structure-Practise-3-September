package Lecture_4_Conditionals_And_Loops;

import java.util.Scanner;

public class Fah_To_Cel 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start Fah");
        int S = sc.nextInt();
        System.out.println("Enter end Fah");
        int E = sc.nextInt();
        System.out.println("Enter step degree");
        int W = sc.nextInt();
        int Cel;
        while(S<=E)
        {
            Cel = (5*(S-32))/9;
            System.out.println(S+" "+Cel);
            S = S + W;
        }
        sc.close();
    }
}
