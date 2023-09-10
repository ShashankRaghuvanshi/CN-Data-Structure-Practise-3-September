package Lecture_9_Arrays;

import java.util.Scanner;

public class Finding_Largest_Element 
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
    public static int findLargestElement(int arr[])
    {
        int size= arr.length;
        int n = Integer.MIN_VALUE;
        for(int i=0; i<size; i++)
        {
            if(n < arr[i])
            {
                n = arr[i];
            }
        }
        return n;
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArr(arr);
        int largestNum = findLargestElement(arr);
        System.out.println(largestNum);
    }
}
