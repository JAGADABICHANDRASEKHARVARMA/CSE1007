package com.company;

import java.util.Scanner;

public class CricleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cricle: ");
        int r = sc.nextInt();
        int Area = (int) (3.14*(r^2));
        System.out.println("The Area of Cricle is "+Area);

    }
}
