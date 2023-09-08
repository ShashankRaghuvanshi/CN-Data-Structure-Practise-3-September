package Lecture_8_Function_Variables_and_their_Scope;

public class Pass_By_Value 
{
    public static void increment(int n)
    {
        n++;
        System.out.println("Increment function "+n);
    }    
    //Pass by Value Important
    public static void main(String[] args)
    {
        int n = 10;
        increment(n);
        System.out.println("Main "+n);
        //result 10
    }
}
