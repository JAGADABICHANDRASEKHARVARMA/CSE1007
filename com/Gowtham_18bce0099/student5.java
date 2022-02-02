package com.Gowtham_18bce0099;
class student5 {
    public void disp(char c, int num)
    {
        System.out.println("I’m the First definition of method disp");
    }
    public void disp(int num, char c)
    {
        System.out.println("I’m the Second definition of method disp" );
    }
}
class Sample3
{
    public static void main(String args[])
    {
        student5 obj = new student5();
        obj.disp('x', 51 );
        obj.disp(52, 'y');
    }
}
