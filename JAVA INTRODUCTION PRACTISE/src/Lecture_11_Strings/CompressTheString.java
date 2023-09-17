package Lecture_11_Strings;

import java.util.Scanner;

public class CompressTheString 
{
    public static String isPermutation(String str)
    {
        String out = "";
        for(int i=0; i<str.length(); )
        {
            int count = 1;
            for(int j=i+1; j<str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    ++count;
                }
            }
            if(count > 1)
            {
                out =  out + str.charAt(i) + count;
            }
            else
            {
                out = out + str.charAt(i);
            }
            i = i + count;
        }
        return out;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = isPermutation(str); 
        System.out.println(str);
        sc.close();
    }
}
