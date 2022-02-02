package com.JAVACSE1007.LabDA;
                                          //Name:- Jagadabi chandrasekhar varma
import java.util.Scanner;                 //Reg.No:- 18BCE0100
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int sum=0;
        int even =0;
        for(int i=0;i<=n;i++) {
            if(even%3==0) {
                sum=sum+even;
            }
            even=even +2;
        }
        System.out.println("The Sum of all even numbers divisible by 3 is : ");
        System.out.print(""+sum);
    }
}
