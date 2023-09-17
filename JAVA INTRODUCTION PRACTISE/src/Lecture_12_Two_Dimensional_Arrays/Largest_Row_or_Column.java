package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Largest_Row_or_Column 
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

    public static void sumRow_and_Col_Wise(int arr[][])
    {
        int largestRowSum = Integer.MIN_VALUE;
        int largestRowIndex = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            int sumRow = 0;
            for(int j=0; j<arr[0].length; j++)
            {
                sumRow = sumRow + arr[i][j];
            }
            if(largestRowSum < sumRow)
            {
                largestRowSum = sumRow;
                largestRowIndex = i;
            }
        }

        int largestColSum = Integer.MIN_VALUE;
        int largestColIndex = Integer.MIN_VALUE;
        for(int i=0; i<arr[0].length; i++)
        {
            int sumCol = 0;
            for(int j=0; j<arr.length; j++)
            {
                sumCol = sumCol + arr[j][i];
            }
            if(largestColSum < sumCol)
            {
                largestColSum = sumCol;
                largestColIndex = i;
            }
        }

        if(largestRowSum > largestColSum)
        {
            System.out.println("Row "+largestRowIndex+" "+ largestRowSum);
        }
        else
        {
            System.out.println("Col "+largestColIndex+" "+ largestColSum);
        }
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        sumRow_and_Col_Wise(arr);
    }
}
