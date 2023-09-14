package Lecture_11_Strings;

import java.util.Scanner;

public class How_String_are_Stored 
{
    //stack memory and heap memory
    //stack for primitive , local variables, etc, relatively small, 
    //heap for non-primitive, it is very big

    public static void main(String args[])
    {
        //very important topic 
        String str1 = "abc";                   
        //stored in String pool, it is special area in heap, space optimization
        String str2 = "abc";                    
        //java will first search in string pool and if there, it will give just reference and not create new, this is string space optimization in String pool
        

        String str3 = new String("abc");
        //it will create new String outside String pool in heap area


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    
        sc.close();
    }
    
}
