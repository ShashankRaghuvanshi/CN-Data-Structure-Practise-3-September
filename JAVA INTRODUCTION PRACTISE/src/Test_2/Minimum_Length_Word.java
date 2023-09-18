package Test_2;

import java.util.Scanner;

public class Minimum_Length_Word 
{
    public static String minimumLengthWord(String str)
    {
        int start = 0;
        int end = 0;
        String smallestString = "";
        int smallStringLength = Integer.MAX_VALUE;
        int stringLength = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                end = i;
                stringLength = end - start;
                if(stringLength < smallStringLength)
                {
                    smallestString = str.substring(start, end);
                    smallStringLength = stringLength;
                }
                start = end;
            }
            
        }
        String word = str.substring(start);
        if(word.length() < smallStringLength)
        {
            smallestString = word;
            smallStringLength = stringLength;
        }
        return smallestString;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = minimumLengthWord(str);
        System.out.println(str);
    }
}
