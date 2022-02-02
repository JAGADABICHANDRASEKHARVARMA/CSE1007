package com.company;
import java.util.Scanner;

public class SumOfnNaturalNumberAndFindFactorial {
    public static void main(String[] args) {
        int num, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum from: ");
        i = sc.nextInt();
        System.out.print("Sum up to: ");
        num = sc.nextInt();
        while(i <= num)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of Natural Numbers = " + sum);
        int fact =1;
        for(i=1;i<=sum;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+sum+" is: "+fact);
    }
}
