package Lecture_9_Arrays;

import java.util.Scanner;

public class More_about_data_types 
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
    public static void main(String args[])
    {
        int arr[] = takeInput();
        //array reference
        System.out.println(arr);
        printArr(arr);
    }
}
