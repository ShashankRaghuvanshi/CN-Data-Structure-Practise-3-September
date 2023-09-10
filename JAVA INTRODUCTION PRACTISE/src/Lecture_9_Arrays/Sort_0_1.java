package Lecture_9_Arrays;

import java.util.Scanner;

public class Sort_0_1 
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
        return arr;
    }
    public static void printArray(int arr[])
    {
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] sort_0_1(int arr[])
    {
        int count=0;
        int arr1[] = new int[arr.length];
        int left = 0;
        int right = arr.length -1;
        while(left<=right)
        {
            if(arr[count] == 0)
            {
                arr1[left] = 0;
                count++;
                left++;
            }
            else
            {
                arr1[right] = 1;
                count++;
                right--;
            }
        }
        return arr1;

    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        arr = sort_0_1(arr);
        printArray(arr);
        
    }
}
