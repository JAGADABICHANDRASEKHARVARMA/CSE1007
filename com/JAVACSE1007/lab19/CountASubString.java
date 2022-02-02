//Name:- Jagadabi Chandrasekhar Varma
//Reg.No:- 18BCE0100

package com.JAVACSE1007.lab19;

public class CountASubString {
        public static void main(String[] args) {
            String str = "JavalabclassJavaCodeJavaProgram";

            String strFind = "Java";
            int count = 0, fromIndex = 0;

            while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){

                System.out.println("Found at index: " + fromIndex);
                count++;
                fromIndex++;
            }
            System.out.println("Total occurrences: " + count);
        }
}
