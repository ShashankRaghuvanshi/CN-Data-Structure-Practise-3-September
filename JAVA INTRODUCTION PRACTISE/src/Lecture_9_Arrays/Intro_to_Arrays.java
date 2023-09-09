package Lecture_9_Arrays;

import java.util.Scanner;

public class Intro_to_Arrays 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter the values of array ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array values ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
