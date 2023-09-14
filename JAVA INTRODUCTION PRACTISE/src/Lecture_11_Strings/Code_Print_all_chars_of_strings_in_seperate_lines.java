package Lecture_11_Strings;

import java.util.Scanner;

public class Code_Print_all_chars_of_strings_in_seperate_lines 
{
    public static void printChars(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.println(str.charAt(i));
        } 
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printChars(str);
        sc.close();
    }
}
