package Test_2;

import java.util.Scanner;

public class Leaders_In_Array 
{
    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int takeInput[] = new int[n];
        for(int i=0; i<n; i++)
        {
            takeInput[i] = sc.nextInt();
        }
        return takeInput;
    }

    public static void leaderInArray(int arr[])
    {
        System.out.println("Output");
        for(int i=0; i<arr.length; i++)
        {
            boolean leader = true;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    leader = true;
                }
                else
                {
                    leader = false;
                    break;
                }
            }
            if(leader)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = takeInput();
        leaderInArray(arr);
    }
}
