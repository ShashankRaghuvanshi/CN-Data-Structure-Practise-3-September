package Lecture_9_Arrays;

import java.util.Scanner;

public class Return_Array_Sum 
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
    public static int arraySum(int arr[])
    {
        int size = arr.length;
        int sum =0;
        for(int i=0; i<size; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        int sum = arraySum(arr);
        System.out.println(sum);
        
    }
}
