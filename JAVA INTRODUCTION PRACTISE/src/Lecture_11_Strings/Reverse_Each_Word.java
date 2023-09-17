package Lecture_11_Strings;

import java.util.Scanner;

public class Reverse_Each_Word 
{
    public static String reverseEachWord(String str)
    {
        int start = 0;
        int end = 0;
        String out = "";
        for(int i=0; i<str.length(); i++)
        {
            String word = "";
            if(str.charAt(i) == ' ')
            {
                end = i;
                while(start <= end)
                {
                    word = str.charAt(start) +word;
                    start++;
                }
                start = end+1;            
            }
            out = out + word;
        }

        end = str.length()-1;
        String word = "";
        while(start <= end)
        {
            word = str.charAt(start) + word;
            start++;
        }
        out = out +" " + word;
        return out;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        str = reverseEachWord(str);
        System.out.println(str);
        sc.close();
    }
}
