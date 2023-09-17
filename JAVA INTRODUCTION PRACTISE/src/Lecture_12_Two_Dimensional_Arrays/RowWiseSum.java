package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class RowWiseSum 
{
    public static int[][] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and column");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int takeInput[][] = new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                takeInput[i][j] = sc.nextInt();
            }
        }
        return takeInput;
    }
    public static void sumRowWise(int arr[][])
    {
        System.out.println("My 2d array");
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j=0; j<arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println("Row "+(i+1)+" "+ sum);
        }
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        sumRowWise(arr);
    }
}
