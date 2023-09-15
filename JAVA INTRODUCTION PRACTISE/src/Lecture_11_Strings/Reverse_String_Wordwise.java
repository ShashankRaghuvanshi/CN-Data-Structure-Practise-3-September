package Lecture_11_Strings;

import java.util.Scanner;

public class Reverse_String_Wordwise 
{
    public static String reverseString(String str)
    {
        String out = "";
        if(str.length() == 0)
        {
            return out;
        }
        int start = 0;
        int end = 0;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                end = i;
                out = " "+ str.substring(start, end) + out;
                start = end + 1;
            }
        }
        out = str.substring(start) + out;

        return out;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string input ");
        String str = sc.nextLine();
        str = reverseString(str);
        System.out.println(str);
    }
}
