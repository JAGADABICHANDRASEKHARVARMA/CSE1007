package com.company;

import java.util.Scanner;

public class RightPattern {
    public static void main(String[] args) {
        Scanner rightTriangle = new Scanner(System.in);
        System.out.println("Enter the number rows ");

        int rows = rightTriangle.nextInt();

        for (int i = 0;i<=rows;i++){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}