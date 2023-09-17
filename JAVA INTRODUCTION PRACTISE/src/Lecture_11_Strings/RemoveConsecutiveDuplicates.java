package Lecture_11_Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates 
{
    public static String removeConsecutiveDuplicates(String str)
    {
        String outStr = "";
        int i=0; 
        while(i<str.length()-1)
        {
            if(str.charAt(i) != str.charAt(i+1))
            {
                outStr = outStr + str.charAt(i);
            }
            i++;
        }
        outStr = outStr + str.charAt(str.length()-1);
        return outStr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        str = removeConsecutiveDuplicates(str);
        System.out.println(str);
        sc.close();
    }
}
