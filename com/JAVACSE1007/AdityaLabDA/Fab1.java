package com.JAVACSE1007.AdityaLabDA;
import java.util.Scanner;           //Name:- K Aditya
class Fib1                          //reg.No:- 18BCE0130
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=0,j=1,nextTerm;
        System.out.println("Fibonacci series is ");
        for(int c=0;c<n;c++)
        {
            if(c<=1)
                nextTerm=c;
            else
            {
                nextTerm=i+j;
                i=j;
                j=nextTerm;
            }
            System.out.println(nextTerm);
        }
    }
}
