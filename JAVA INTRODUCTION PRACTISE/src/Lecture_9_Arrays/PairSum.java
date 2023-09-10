package Lecture_9_Arrays;

import java.util.Scanner;

public class PairSum 
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
    public static void findUnique(int arr[])
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
            if(count<2)
            {
                System.out.println(arr[i]);
                return;
            }
        }
        return;
    }
    public static int pairSum(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                int sum = arr[i] + arr[j];
                if(n == sum)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        int count = pairSum(arr);
        System.out.println(count);
    }
}
