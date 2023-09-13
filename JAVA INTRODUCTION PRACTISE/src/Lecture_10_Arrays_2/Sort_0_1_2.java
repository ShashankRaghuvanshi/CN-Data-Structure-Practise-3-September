package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Sort_0_1_2 
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
    
    public static void sort_0_1_2(int arr[])
    {
        int nextZero = 0;
        int nextTwo = arr.length - 1;
        int i = 0;
        
        while(i <= nextTwo)
        {
            if(arr[i] == 0)
            {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;
                nextZero++;
            }
            else if(arr[i] == 2)
            {
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            }
            else
            {
                i++;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        sort_0_1_2(arr);
        printArray(arr);
    }
}
