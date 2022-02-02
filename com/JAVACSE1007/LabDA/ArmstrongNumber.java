package com.JAVACSE1007.LabDA;
                            //Name:- K Aditya
import java.util.*;         //Reg.No:- 18BCE0130
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,temp,remainder,sum=0;
        System.out.println("Enter the number : ");

        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            remainder=temp%10;
            sum=sum+remainder*remainder*remainder;
            temp=temp/10;
        }

        if(sum==n)
            System.out.println(n+" is an Armstrong number");
        else
            System.out.println(n+" is not an Armstrong number");
    }
}
