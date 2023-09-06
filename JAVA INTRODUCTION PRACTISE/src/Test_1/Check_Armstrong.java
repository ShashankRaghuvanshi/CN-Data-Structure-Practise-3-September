package Test_1;

import java.util.Scanner;

public class Check_Armstrong 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();

        int n=N;
        int count=0;

        while(n>0)
        {
            n = n /10;
            count++;
        }

        n=N;
        int sum=0;
        int r;
        while(n>0)
        {
            r = n%10;
            sum = (int) (sum + Math.pow(r, count));
            n = n / 10;
        }
        if(sum == N)
        {
            System.out.println("Armstrong number "+N);
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }    
}
