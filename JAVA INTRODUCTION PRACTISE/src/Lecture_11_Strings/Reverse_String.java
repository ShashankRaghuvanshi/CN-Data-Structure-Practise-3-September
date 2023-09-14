package Lecture_11_Strings;

import java.util.Scanner;

public class Reverse_String 
{
    public static String reverseString(String str)
    {
        String strOut = "";
        for(int i=0; i<str.length(); i++)
        {
            strOut = str.charAt(i) + strOut;
        }
        str = strOut;
        return str;
    }
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseString = reverseString(str);
        System.out.println(reverseString);
        sc.close();
    }
}
