package Lecture_11_Strings;

public class More_functions_on_strings 
{
    public static void main(String args[])
    {
        String str1 = "Coding";
        String str2 = " is fun";
        String str3 = "Coding";
        String str4 = "Aoding";
        String str5 = "Eoding";
        String str6 = "Codings";
        String str7 = "Codin";
        // System.out.println(str1 + str2);
        // str1 = str1 + str2;
        // str1 += str2;

        // str1 = str1.concat(str2);
        // System.out.println(str1);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareTo(str5));
        System.out.println(str1.compareTo(str6));
        System.out.println(str1.compareTo(str7));
        System.out.println(str1.compareTo(str2));

        System.out.println(str1.contains("ing"));

    }
}
