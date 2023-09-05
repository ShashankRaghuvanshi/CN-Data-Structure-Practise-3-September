package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class Terms_of_AP 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n)
        {
            if((3*i+2) % 4 != 0)
            {
                System.out.println(3*i+2);
                count++;
            }
            i++;
        }
        sc.close();
    }    

}
