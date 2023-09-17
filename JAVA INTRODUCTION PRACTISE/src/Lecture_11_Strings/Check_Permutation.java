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

    public static boolean isPermutation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        int frequency[] = new int[256];
        for(int i=0; i<256; i++)
        {
            frequency[i] = 0;
        }

        for(int i=0; i<str1.length(); i++)
        {
            char ch = str1.charAt(i);
            frequency[ch]++;
        }

        for(int i=0; i<str2.length(); i++)
        {
            char ch = str1.charAt(i);
            frequency[ch]--;
        }

        for(int i=0; i<256; i++)
        {
            if(frequency[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        checkPermuatation(str1,str2);
        boolean isPermutation = isPermutation(str1, str2);
        System.out.println(isPermutation);
        sc.close();
    }
}
