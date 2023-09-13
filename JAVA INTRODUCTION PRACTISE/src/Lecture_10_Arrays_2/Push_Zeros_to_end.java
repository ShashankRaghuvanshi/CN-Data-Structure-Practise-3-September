package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Push_Zeros_to_end 
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
    
    public static void pushZeroToEnd(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] == 0)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[j] !=0)
                    {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public static void pushZeroToEndSecondWay(int arr[])
    {
        int nonZero = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        pushZeroToEnd(arr);
        printArray(arr);
    }

}
