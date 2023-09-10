package Lecture_9_Arrays;

import java.util.Scanner;

public class Arrange_Numbers_in_Array 
{
    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        // for(int i=0; i<(size+1)/2; i++)
        // {
        //     arr[i] = i*2+1;
        // }
        // int j=1;
        // for(int i=size-1; i>(size-1)/2; i--)
        // {
        //     arr[i] = j*2;
        //     j++;
        // }
        // return arr;

        int left = 0;
        int right = size-1;
        int counter =1;

        while(left<=right)
        {
            if(counter%2 == 1)
            {
                arr[left] = counter;
                left++;
                counter++;
            }
            else
            {
                arr[right] = counter;
                right--;
                counter++;
            }
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
    public static void main(String args[])
    {
        int arr[] = takeInput();
        printArr(arr);
    }
}
