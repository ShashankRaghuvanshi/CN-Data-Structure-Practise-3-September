package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class LargestColumnSum 
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
    public static void sumColWise(int arr[][])
    {
        int largestColSum = Integer.MIN_VALUE;
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
            }
        }
        System.out.println(largestColSum);
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        sumColWise(arr);
    }
}
