package Lecture_12_Two_Dimensional_Arrays;

public class How_2d_Arrays_Stored 
{
    public static void main(String args[])
    {
        int [] arr = {1,2,3,4};
        System.out.println(arr.length);

        int [][]arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(arr2d.length);
        System.out.println(arr2d);
        System.out.println(arr2d[0]);
        System.out.println(arr2d[1]);
        System.out.println(arr2d[0][1]);
    }
}
