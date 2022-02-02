package com.Gowtham_18bce0099;
// C>GOWTHAM
//18BCE0099
import java.util.*;
public class Cal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:- ");
        String name=sc.nextLine();
        System.out.println("Please enter your Reg.No:- ");
        String RegNo=sc.nextLine();
        System.out.println("Now enter 3 numbers:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The formula you have entered is:");
        System.out.println(a+"X^2 + "+b+"X + "+c);
        System.out.println("The derivative of the equation is");
        System.out.println(2*a+"X+"+b);
        System.out.println("Enter a value for x");
        float x=sc.nextFloat();
        System.out.println("The derivative at the above point is:");
        System.out.printf("%.1f", (2*a*x+b));
    }
}
