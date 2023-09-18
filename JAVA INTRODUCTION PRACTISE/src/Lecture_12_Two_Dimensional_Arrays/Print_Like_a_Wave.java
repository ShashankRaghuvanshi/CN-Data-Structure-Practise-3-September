package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Print_Like_a_Wave 
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

    public static void printWave(int arr[][])
    {
        for(int j=0; j<arr[0].length; j++)
        {
            if(j%2 == 0)
            {
                for(int i=0; i<arr.length; i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(int i=arr.length-1; i>=0; i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        printWave(arr);
        
    }
}
