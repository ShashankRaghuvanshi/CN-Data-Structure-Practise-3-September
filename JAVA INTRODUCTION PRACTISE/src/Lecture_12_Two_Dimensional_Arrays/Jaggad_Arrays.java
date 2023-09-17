package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Jaggad_Arrays 
{
    public static int[][] takeTwoDimentionalArraysInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        int takeInput[][] = new int[n][];

        for(int i=0; i<n; i++)
        {
            System.out.println("Column size Jagged");
            int m = sc.nextInt();
            takeInput[i] = new int[m];
            for(int j=0; j<m; j++)
            {
                takeInput[i][j] = sc.nextInt();
            }
        }
        return takeInput;
    }
    public static void printTwoDimentionalArray(int arr[][])
    {
        System.out.println("My 2d array");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int arr[][] = takeTwoDimentionalArraysInput();
        printTwoDimentionalArray(arr);
    }
}
