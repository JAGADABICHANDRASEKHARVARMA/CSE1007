package com.JAVACSE1007.lab13aug;

import java.util.*;
class reverseUsingSwaping {

    static void reverseArray(int intArray[], int size)
    {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(intArray));
    }

        public static void main(String[] args) {
            int [] intArray = {11,22,33,44,55,66,77,88,99};
            System.out.println("Original Array: \n" + Arrays.toString(intArray));
            reverseArray(intArray, intArray.length);
        }
    }

