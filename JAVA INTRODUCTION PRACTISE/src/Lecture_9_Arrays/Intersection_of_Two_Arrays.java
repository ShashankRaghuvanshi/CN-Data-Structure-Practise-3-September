package Lecture_9_Arrays;

import java.util.Scanner;

public class Intersection_of_Two_Arrays 
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
    public static void printArr(int arr[])
    {
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void intersectionArray(int arr1[], int arr2[])
    {
        System.out.println("Intersection Array values");
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                    arr1[i] = Integer.MIN_VALUE;
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        int arr1[] = takeInput();
        int arr2[] = takeInput();
        printArr(arr1);
        printArr(arr2);
        intersectionArray(arr1, arr2);
        
    }
}
