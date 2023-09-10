package Lecture_9_Arrays;

import java.util.Scanner;

public class Taking_Input_and_Printing_Array 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements of arrays ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays value ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
