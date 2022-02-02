package com.JAVACSE1007.Lab02Sept;
                                //Name:- Jagadabi Chandrasekhar Varma
 class Student4    {               //Reg.No:- 18BCE0100
    int Roll;
    String Name;
    double Marks;
    Student4(int R,String N,double M) {
        Roll = R;
        Name = N;
        Marks = M;
    }
    Student4(String N,double M,int R) {
        Roll = R;
        Name = N;
        Marks = M;
    }
    void Display() {
        System.out.print("\n\t" + Roll+"\t" + Name+"\t" + Marks); }
}
class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student4 S1 = new Student4(1,"Kumar",78.53);
        Student4 S2 = new Student4("Sumit",89.42,2);
        System.out.print("\n\tRoll\tName\tMarks\n");
        S1.Display();
        S2.Display();
    }
}
