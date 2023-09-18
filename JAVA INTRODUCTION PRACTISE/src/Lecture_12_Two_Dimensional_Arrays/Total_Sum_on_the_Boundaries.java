package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Total_Sum_on_the_Boundaries 
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

    public static int sumBorderAndDiagonal(int arr[][])
    {
        int sumRow = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(i==0 || i==arr.length-1)
            {
                for(int j=0; j<arr[0].length; j++)
                {
                    sumRow = sumRow + arr[i][j];
                }
            }
        }
        int sumCol = 0;
        for(int j=0; j<arr.length; j++)
        {
            if(j==0 || j==arr[0].length-1)
            {
                for(int i=1; i<arr.length-1; i++)
                {
                    sumCol = sumCol + arr[i][j];
                }
            }
        }
        int d1 = 0;
        for(int i=1; i<arr.length-1; i++)
        {
            for(int j=1; j<arr.length-1; j++)
            {
                if(i == j || i==(arr.length-1-j))
                {
                    d1 = d1 + arr[i][j];
                }
            }
        }
        int sumTotal = sumCol + sumRow + d1;
        return sumTotal;
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        int totalSum = sumBorderAndDiagonal(arr);
        System.out.println(totalSum);
        
    }
}
