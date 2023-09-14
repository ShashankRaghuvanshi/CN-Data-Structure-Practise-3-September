package Lecture_11_Strings;

public class String_Substring_Function 
{
    public static void main(String args[])
    {
        String str1 = "Coding";
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(6));

        String substr = str1.substring(6);
        System.out.println(substr.length());

        String substr1 = str1.substring(1, 5);
        System.out.println(substr1.length());
        System.out.println(substr1);


    }
}
