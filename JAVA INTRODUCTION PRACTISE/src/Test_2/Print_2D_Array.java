package Test_2;

import java.util.Scanner;

public class Print_2D_Array 
{
    public static int[][] takeInput()
    {
        Scanner sc = new Scanner(System.in);
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

    public static void printArray(int arr[][])
    {
        System.out.println("Output");
        for(int i=0; i<arr.length; i++)
        {
            int count = arr.length - i;
            while(count > 0)
            {
                for(int j=0; j<arr[0].length; j++)
                {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
                count--;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[][] = takeInput();
        printArray(arr);
    }
}
