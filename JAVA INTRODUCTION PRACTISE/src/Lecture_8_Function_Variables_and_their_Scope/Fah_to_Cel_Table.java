package Lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Fah_to_Cel_Table 
{
    public static void fahCel(int S, int E, int W)
    {
        int cel;
        while(S<=E)
        {
            cel = (5*(S-32)/9);
            System.out.println(S+" "+cel);
            S = S + W;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting Fah");
        int S = sc.nextInt();
        System.out.println("Enter the end Fah");
        int E = sc.nextInt();
        System.out.println("Enter the step size Fah");
        int W = sc.nextInt();

        fahCel(S, E, W);
        sc.close();
    }
}
