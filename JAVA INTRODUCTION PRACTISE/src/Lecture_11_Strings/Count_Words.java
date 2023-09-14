package Lecture_11_Strings;

import java.util.Scanner;

public class Count_Words 
{
    public static int countWords(String str)
    {
        int count = 0;
        if(str.length() == 0)
        {
            return count;
        }
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
        } 
        return ++count;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countWords = countWords(str);
        System.out.println(countWords);
        sc.close();
    }
}
