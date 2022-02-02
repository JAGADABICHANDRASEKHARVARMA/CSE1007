package com.company;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int integer1 = obj.nextInt();
        boolean divisibleBy3 = (integer1 % 3) == 0;
        boolean divisibleBy5 = (integer1 % 5) == 0;
        if(divisibleBy3) {
            System.out.println(integer1 + " can be divided by 3");
        } else {
            System.out.println(integer1 + " cannot be divided by 3");
        }
        if(divisibleBy5){
            System.out.println(integer1 + " can be divided by 5");
        } else {
            System.out.println(integer1 + " cannot be divided by 5");
        }
    }
}
