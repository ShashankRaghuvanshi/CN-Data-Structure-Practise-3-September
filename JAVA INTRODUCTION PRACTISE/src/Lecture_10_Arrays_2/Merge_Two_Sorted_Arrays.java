package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Merge_Two_Sorted_Arrays 
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

    public static int[] mergeSortedArray(int arr1[], int arr2[])
    {
        int size = arr1.length + arr2.length;
        int arr[] = new int[size];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] <=  arr2[j])
            {
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i < arr1.length )
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String args[])
    {
        int arr1[] = takeInput();
        int arr2[] = takeInput();
        int arr[] = mergeSortedArray(arr1, arr2);
        printArray(arr);

    }

}
