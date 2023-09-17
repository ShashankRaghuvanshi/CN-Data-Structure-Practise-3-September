package Lecture_11_Strings;

import java.util.Scanner;

public class Highest_Occuring_Character 
{
    public static char hightestOccuringCharacter(String str)
    {
        int frequency[] = new int[256];
        for(int i=0; i<256; i++)
        {
            frequency[i] = 0;
        }

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        int maxCharTimes = Integer.MIN_VALUE;
        int maxCharIndex = Integer.MIN_VALUE;
        for(int i=0; i<256; i++)
        {
            if(frequency[i] > maxCharTimes)
            {
                maxCharTimes = frequency[i];
                maxCharIndex = i;
            }
        }
        char ch = (char)maxCharIndex;
        return ch;
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char hightestOccuringCharacter = hightestOccuringCharacter(str);
        System.out.println(hightestOccuringCharacter);
        sc.close();
    }
}
