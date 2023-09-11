package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Binary_Search 
{
    public static int binarySearch(int arr[], int n)
    {
        int start = 0; 
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            
            if(arr[mid] == n)
            {
                return mid;
            }
            else if(arr[mid] > n)
            {
                end = mid - 1;
            }
            else if(arr[mid] < n)
            {
                start = mid + 1;
            }
        }
        return -1;
    }
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
    public static void main(String args[])
    {
        int arr[] = takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched for index ");
        int num = sc.nextInt();
        printArray(arr);
        int index = binarySearch(arr, num);
        System.out.println(index);

    }

}
