package com.JAVACSE1007.LAB09SEPT;

class Arithmetic1 implements Iter2 {
    public void addition() {
        System.out.println("Addition of "+c+" and "+d+" is: "+(c+d));
    }
    public void substraction() {
        System.out.println("Subtraction of "+c+" and "+d+" is: "+(c-d));
    }
    public void multiply() {
        System.out.println("Multiplication of "+c+" and "+d+" is: "+(c*d));
    }
    public void division() {
        System.out.println("Division of "+c+" and "+d+" is: "+(c/d));
    }
    public static void main(String[] args) {
        Arithmetic1 obj = new Arithmetic1();
        obj.addition();
        obj.substraction();
        obj.multiply();
        obj.division();
    }
}
