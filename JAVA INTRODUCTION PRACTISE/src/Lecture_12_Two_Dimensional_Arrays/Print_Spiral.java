package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Print_Spiral 
{

    //I need to see and do correction in code, concept is right
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
    
    public static void printSpiral(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            int startCol = i;
            int endCol = arr[0].length -1-i;
            while(endCol>=startCol)
            {
                System.out.print(arr[i][startCol]+" ");
                startCol++;
            }

            startCol = endCol;
            int startRow = i + 1;
            int endRow = arr.length - 1 -i;
            while(endRow>=startRow)
            {
                System.out.print(arr[startRow][startCol]+" ");
            }

            startCol = endCol -1;
            endCol = i;
            startRow = endRow;
            while(endCol <= startCol)
            {
                System.out.print(arr[startRow][startCol]);
                startCol--;
            }

            startCol = endCol;
            startRow = endRow - 1;
            endRow = i + 1;
            while(startRow >= endRow)
            {
                System.out.print(arr[startRow][startCol]);
                startRow--;
            }

        }
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        printSpiral(arr);
    }
}
