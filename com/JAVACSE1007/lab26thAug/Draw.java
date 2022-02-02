package com.JAVACSE1007.lab26thAug;
                                    //Name:- Jagadabi Chandrasekhar Varma
import java.util.*;                 //Reg.No:- 18BCE0100
abstract class Diagram
{
    private int d1,d2;
    abstract public void areaCalculation();
    public void readData()
    {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter two dimensions:");
        d1=sin.nextInt();
        d2=sin.nextInt();
    }
    public void displayData()
    {
        System.out.println("D1:"+d1+"\nD2:"+d2);
    }
    public int getD1()
    {
        return d1;
    }
    public int getD2()
    {
        return d2;
    }
}
class Rectangle extends Diagram
{
    private int area;
    public void areaCalculation()
    {
        int x=super.getD1();
        int y=super.getD2();
        area=x*y;
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Area:"+area);
    }
}
class Triangle extends Diagram
{
    private int area;
    public void areaCalculation()
    {
        int x=super.getD1();
        int y=super.getD2();
        area=(1/2)*x*y;
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Area:"+area);
    }

}
class Ellipse extends Diagram
{
    private int area;
    public void areaCalculation()
    {
        int x=super.getD1();
        int y=super.getD2();
        area=(1/2)*x*y;
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Area:"+area);
    }
}
public class Draw
{
    public static void main(String args[])
    {
        Scanner sin=new Scanner(System.in);
        Diagram d1;
        int ch;
        do
        {
            System.out.println("1.RECTANGLE(default)");
            System.out.println("2.TRIANGLE");
            System.out.println("3.ELLIPSE");
            System.out.print("Enter ur choice:");
            ch=sin.nextInt();
            switch(ch)
            {
                case 1:
                    d1=new Rectangle();
                    break;
                case 2:
                    d1=new Triangle();
                    break;
                case 3:
                    d1=new Ellipse();
                    break;
                default :
                    d1=new Rectangle();
                    System.out.println("Enter correct Choice");
                    break;
            }
            d1.readData();
            d1.areaCalculation();
            d1.displayData();
            System.out.print("Do u want to continue(y-1)(n-0):");
            ch=sin.nextInt();
        }while(ch==1);
    }
}
