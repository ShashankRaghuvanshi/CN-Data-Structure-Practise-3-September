package Lecture_9_Arrays;

import java.util.Scanner;

public class Linear_Search 
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
    public static int linearSearch(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            if(n == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int arr[] = takeInput();
        int result = linearSearch(arr);
        System.out.println(result);
    }
}
