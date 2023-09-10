package Lecture_9_Arrays;

import java.util.Scanner;

public class Swap_Alternate 
{
    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void printArr(int arr[])
    {
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] swapAlterante(int arr[])
    {
        for(int i=0; i<arr.length-1; i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArr(arr);
        arr = swapAlterante(arr);
        printArr(arr);
    }
}
