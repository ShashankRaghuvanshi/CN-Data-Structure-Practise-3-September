package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Rotate_Array 
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
    
    public static int[] rotateArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rotation number ");
        int n = sc.nextInt();
        int temp[] = new int[arr.length];

        int tempI = 0;

        for(int i=n; i<arr.length; i++)
        {
            temp[tempI] = arr[i];
            tempI++;
        }

        for(int i=0; i<n; i++)
        {
            temp[tempI] = arr[i];
            tempI++;
        }

        arr = temp;
        return arr;

        // for(int i=n; i<arr.length; i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // for(int i=0; i<n; i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        arr = rotateArray(arr);
        printArray(arr);
    }

}
