package com.JAVACSE1007.Lab02Sept;
                                  //Name:- Jagadabi chandrasekhar Varma
class student{                    //Reg.N0:- 18BCE0100
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
public class question2{
    public static void main(String[] args) {
        student obj = new student();
        obj.ss = "Vivek";
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }
}
