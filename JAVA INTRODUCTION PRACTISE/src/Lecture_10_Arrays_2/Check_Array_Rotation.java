package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Check_Array_Rotation 
{
    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static int arrayRoation(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArray(arr);
        int arrayRoation = arrayRoation(arr);
        System.out.println("Rotation by "+arrayRoation);
    }

}
