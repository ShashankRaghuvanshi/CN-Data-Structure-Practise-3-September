package Lecture_9_Arrays;

import java.util.Scanner;

public class Print_All_Pairs 
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
    public static void printPairs(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArr(arr);
        printPairs(arr);
    }
}
