package Lecture_11_Strings;

import java.util.Scanner;

public class Taking_String_Input 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str;
        str = sc.next();
        // str = sc.nextLine();
        System.out.println(str + " " + str.length());
        String str2 = sc.next();
        System.out.println(str2 + " " + str2.length());
        String str3 = sc.nextLine();
        System.out.println(str3 + " " + str3.length());
    }
}
