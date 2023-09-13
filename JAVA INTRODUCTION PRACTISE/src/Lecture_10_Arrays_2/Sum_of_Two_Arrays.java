package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Sum_of_Two_Arrays 
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
    
    //First method
    public static int[] sumOfTwoArrays(int arr1[], int arr2[])
    {
        int sum1 = 0;
        for(int i=0; i<arr1.length; i++)
        {
            sum1 = sum1*10 + arr1[i];
        }
        int sum2 = 0;
        for(int i=0; i<arr2.length; i++)
        {
            sum2 = sum2*10 + arr2[i];
        }
        int sum3 = sum1 + sum2;
        int temp = sum3;
        int count =0;
        while(sum3>0)
        {
            count++;
            sum3 = sum3/10;
        }
        int size = count;
        int arr3[] = new int[size];
        int k = size -1;
        while(k>=0)
        {
            int d = temp % 10;
            arr3[k] = d;
            temp = temp/10;
            k--;
        }
        return arr3;

    }

    //second method
    public static int[] sumOfTwoArraysOtherMethod(int arr1[], int arr2[])
    {
        int i = arr1.length -1;
        int j = arr2.length -1;
        int carry = 0;
        int k = Math.max(arr1.length, arr2.length)+1;
        int arr4[] = new int[k];
        k = k - 1;

        while(i >= 0 && j >= 0)
        {
            int sum = arr1[i] + arr2[j] + carry;
            arr4[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        while(i >= 0)
        {
            int sum = arr1[i] + carry;
            arr4[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        while(j >= 0)
        {
            int sum = arr2[j] + carry;
            arr4[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }
        arr4[0] = carry;
        return arr4;
    }

    public static void main(String args[])
    {
        int arr1[] = takeInput();
        int arr2[] = takeInput();
        int arr3[] = sumOfTwoArrays(arr1, arr2);
        printArray(arr3);
        int arr4[] = sumOfTwoArraysOtherMethod(arr1, arr2);
        printArray(arr4);
    }
}
