package com.JAVACSE1007.Lab02Sept;
                                  //Name:- Jagadabi chandrasekhar Varma
class DisplayOverloading3         //Reg.no:- 18BCE0100
{
    public void disp(char c, int num)
    {
        System.out.println("I’m the first definition of method disp");
    }
    public void disp(int num, char c)
    {
        System.out.println("I’m the second definition of method disp" );
    }
}
class Sample3
{
    public static void main(String args[])
    {
        DisplayOverloading3 obj = new DisplayOverloading3();
        obj.disp('x', 51 );
        obj.disp(52, 'y');
    }
}
