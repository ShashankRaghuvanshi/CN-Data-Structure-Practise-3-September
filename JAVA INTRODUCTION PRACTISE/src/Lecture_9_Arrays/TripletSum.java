package Lecture_9_Arrays;

import java.util.Scanner;

public class TripletSum 
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
    public static int tripletSum(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<arr.length-2; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(n == sum)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        int count = tripletSum(arr);
        System.out.println(count);
    }
}
