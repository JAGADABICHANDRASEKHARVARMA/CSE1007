package com.JAVACSE1007.LAB09SEPT;
class student{
    String ss;
    String name;
    public student(String ss){
        name = ss;
    }
    public student()
    {
        name = "unknown";
    }
}
public class ConstructorOverloading1{
    public static void main(String[] args) {
        student obj = new student();
        obj.ss = "Mahesh";
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }
}

////package p1;
//class Lokesh0019Q4
//{
//    public Lokesh0019Q4()
//    {
//        System.out.println("Created");
//    }
//    public void display()
//    {
//        System.out.println("Hello");
//    }
//}
//class k
//{
//    public static void main(String as[])
//    {
//        String s1="xya"
//    }
//}
