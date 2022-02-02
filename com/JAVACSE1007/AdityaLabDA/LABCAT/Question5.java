package com.JAVACSE1007.AdityaLabDA.LABCAT;
                                 //Name:- K Aditya
class Outer{                     //Reg.No:- 18BCE0130
    String so = ("This is Outer Class");
    void display()
    {
        System.out.println(so);
    }
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        String si =("This is inner Class");
        void display(){
            System.out.println(si);
        }
    }
}
public class Question5{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.display();
        outer.test();
    }
}
