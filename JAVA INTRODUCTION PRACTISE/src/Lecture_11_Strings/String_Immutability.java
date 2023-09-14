package Lecture_11_Strings;

public class String_Immutability 
{
    //very important- string in java are immutable, means you cannot change string in any sense
    public static void main(String args[])
    {
        String str = "abc";
        String str1 = "abc";
        String str2 = "abc";
        str1 = str1 + "def";
        String str3 = new String("abc");
    }
}
