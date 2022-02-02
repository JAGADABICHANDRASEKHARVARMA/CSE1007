package com.JAVACSE1007.LabDA;                 // Name: Jagadabi Chandrasekhar Varma
                                               //Regd.No:- 18BCE0100
import java.util.Scanner;

public class Circle extends Point{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point c=new Point();
        System.out.println("Enter the x1 value: ");
        c.x=sc.nextDouble();
        System.out.println("Enter the x2 value: ");
        c.y=sc.nextDouble();
        Point p=new Point();
        System.out.println("Enter the y1 value: ");
        p.x=sc.nextDouble();
        System.out.println("Enter the y2 value: ");
        p.y=sc.nextDouble();
        Circle c1=new Circle();
        System.out.println("The radius of the Circle is: ");
        c1.distance(c,p);
    }
}
class Point {
    double x,y;
    double distance(Point p1, Point p2)
    {
        double result;
        result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
        System.out.print(result);
        return result;
    }
}
