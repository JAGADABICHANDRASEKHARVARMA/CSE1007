package com.company;

import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String args[]) {
        int rows, i, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in pattern");
        rows = in.nextInt();
        for(i = rows; i > 0; i--) {
            for(j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
