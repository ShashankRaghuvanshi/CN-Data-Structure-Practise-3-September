package Lecture_11_Strings;

import java.util.Scanner;

public class RemoveCharacter 
{
    public static String removeCharacter(String str, String ch)
    {
        String outStr = "";
        int i=0; 
        while(i<=str.length()-1)
        {
            if(str.charAt(i) != ch.charAt(0))
            {
                outStr = outStr + str.charAt(i);
            }
            i++;
        }
        return outStr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("Enter the character to be removed ");
        String ch = sc.nextLine();
        str = removeCharacter(str,ch);
        System.out.println(str);
        sc.close();
    }
}
