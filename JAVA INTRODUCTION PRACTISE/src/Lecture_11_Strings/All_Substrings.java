package Lecture_11_Strings;

import java.util.Scanner;

public class All_Substrings 
{
    public static void printAllSubString(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<=str.length(); j++)
            {
                System.out.print(str.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static void printAllSubStringSecondMethod(String str)
    {
        for(int i=1; i<=str.length(); i++)
        {
            for(int j=0; j<=str.length()-i; j++)
            {
                int end = j + i - 1;
                System.out.print(str.substring(j, end+1)+" ");
                
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printAllSubString(str);
        printAllSubStringSecondMethod(str);
        sc.close();
    }
}
