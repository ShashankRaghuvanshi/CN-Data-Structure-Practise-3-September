package Lecture_9_Arrays;

public class Array_Operations 
{
    public static void main(String args[])
    {
        int arr[] = new int[10];
        arr[0] = 5;
        arr[5] = 17;
        System.out.println(arr[0]);
        System.out.println(arr[5]);

        //arr[-1] = 18;
        //arr[10] = 15;

        System.out.println(arr[3]);
        System.out.println(arr[7]);

        char []cArr = new char[10];
        double []dArr = new double[10];
        float []fArr = new float[10];
 
        System.out.println(cArr[0]);
        System.out.println(dArr[0]);
        System.out.println(fArr[0]);
    }
}
