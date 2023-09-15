package Lecture_11_Strings;

public class String_vs_StringBuffer 
{
    //not change the content - string
    //change the content should use - stringBuffer

    public static void main(String args[])
    {
        //mutable String if we want, using StringBuffer
        StringBuffer str = new StringBuffer("abc");
        str.setCharAt(0,'d');
        System.out.println(str + " "+str.length());

        str.append("def");
        System.out.println(str + " "+str.length());

    }
    
}
