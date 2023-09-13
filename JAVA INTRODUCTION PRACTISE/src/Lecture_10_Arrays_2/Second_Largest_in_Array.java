package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Second_Largest_in_Array 
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

    //i think there is another way just sort it and select select second largest, and this is also the way to solve
    public static int secondLargest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != largest)
            {
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        return secondLargest;

    }
    
    public static void main(String args[])
    {
        int arr[] = takeInput();
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }
}
