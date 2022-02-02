package com.JAVACSE1007.AdityaLabDA.LABCAT;
//Name:- K Aditya
//Reg.No:- 18BCE0130
class Arithmetic implements Iter1
{
    public void add()
    {
        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
    }
    public void sub()
    {
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
    }
    public void mul()
    {
        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
    }
    public void divi()
    {
        System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
    }
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.add();
        obj.sub();
        obj.mul();
        obj.divi();
    }
}

