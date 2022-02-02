package com.Gowtham_18bce0099;

class Student    {
    int Roll;
    String Name;
    double Marks;
    Student(int R,String N,double M) {
        Roll = R;
        Name = N;
        Marks = M;
    }
    Student(String N,double M,int R) {
        Roll = R;
        Name = N;
        Marks = M;
    }
    void Display() {
        System.out.print("\n\t" + Roll+"\t" + Name+"\t" + Marks); }
}
class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        com.Gowtham_18bce0099.Student S1 = new com.Gowtham_18bce0099.Student(1,"Gowtham",81.11);
        com.Gowtham_18bce0099.Student S2 = new com.Gowtham_18bce0099.Student("Venkat",92.12,2);
        System.out.print("\n\tRoll\tName\tMarks\n");
        S1.Display();
        S2.Display();
    }
}