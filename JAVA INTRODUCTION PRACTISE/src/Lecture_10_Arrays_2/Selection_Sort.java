package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Selection_Sort 
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

    public static void selectionSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int min = arr[i];
            int minIndex = i;
            for(int j=i; j<arr.length; j++)
            {
                if(min > arr[j])
                {
                    minIndex = j;               
                    min = arr[j];
                }
            } 
            arr[minIndex] = arr[i];
            arr[i] = min;          
        }
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArray(arr);
        selectionSort(arr);
        printArray(arr);

    }

}
