package com.JAVACSE1007.lab26thAug;
import java.util.Scanner;              //Name:- Jagadabi Chandrasekhar Varma
public class EvenOdd                   //Reg.no:- 18BCE0100
{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();

        findEvenOdd(num);
    }
    public static void findEvenOdd(int num)
    {
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
