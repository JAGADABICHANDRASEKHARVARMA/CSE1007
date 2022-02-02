package com.company;
import java.util.Scanner;

public class SumOfSquaresOfnNumber {
    static void println(String string) {
        System.out.println(string);
    }
    static void print(String string) {
        System.out.print(string);
    }
    static void printSeries(int n, int total) {
        int i = 1;
        for (i = 1; i < n; i++) {
            print(i + "^2 +");
        }
        print(i + "^2 = " + total);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        println("Enter value of 'n' : ");
        int n = scanner.nextInt();
        int sum = (n * (n + 1) * (2 * n + 1 )) / 6;
        printSeries(n,sum);
    }
}
