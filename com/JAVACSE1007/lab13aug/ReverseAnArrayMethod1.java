package com.JAVACSE1007.lab13aug;

public class ReverseAnArrayMethod1 {
    public static void main(String[] args) {

        // Iterative method
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println(" Iterative method Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }



    }
}
