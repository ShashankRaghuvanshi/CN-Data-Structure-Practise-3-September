package Lecture_11_Strings;

import java.util.Scanner;

public class String_Palindrome 
{
    public static boolean stringPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;

        while(left <= right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean checkStringPalindrome = stringPalindrome(str);
        System.out.println(checkStringPalindrome);
        sc.close();
    }
}
