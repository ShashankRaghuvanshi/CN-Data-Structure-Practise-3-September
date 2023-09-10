package Lecture_9_Arrays;

import java.util.Scanner;

public class Find_Duplicate 
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
    public static void findDuplicate(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int count=0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(arr[i]);
                return;
            }
        }
        return;
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArr(arr);
        findDuplicate(arr);
    }
}
