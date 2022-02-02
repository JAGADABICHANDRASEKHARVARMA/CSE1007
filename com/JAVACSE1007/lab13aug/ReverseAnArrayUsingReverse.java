package com.JAVACSE1007.lab13aug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArrayUsingReverse {
    static void reverse(Integer myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    public static void main(String[] args) {
        Integer [] myArray = {2,3,4,5,6};
        System.out.println("Original Array is :"+ Arrays.asList(myArray));
        reverse(myArray);
    }
}
