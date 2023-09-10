package Lecture_9_Arrays;

public class Primitives_and_nonPrimitive_with_functions 
{
    public static void increment(int i)
    {
        //increment.i
        i++;
    }

    public static void printArray(int arr[])
    {
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void incrementArray(int arr[])
    {
        System.out.println(arr);
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i]+1;
        }
    }

    public static void main(String args[])
    {
        int i = 10;
        increment(i);
        //main.i
        System.out.println(i);

        int [] arr = {1,2,3,4,5};
        printArray(arr);
        incrementArray(arr);
        System.out.println(arr);
        printArray(arr);
    }
}
