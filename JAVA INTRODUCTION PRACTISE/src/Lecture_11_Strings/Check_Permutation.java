package Lecture_11_Strings;

import java.util.Scanner;

public class Check_Permutation 
{
    public static void checkPermuatation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            System.out.println("false");
            return;
        }
        for(int i=0; i<str1.length(); i++)
        {
            boolean check = false;
            for(int j=0; j<str2.length(); j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    check = true;
                    break;
                }
            }
            if(check == false)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        checkPermuatation(str1,str2);
        sc.close();
    }
}
