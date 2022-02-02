package com.Gowtham_18bce0099;

class student1{
    String ss;
    String name;
    public student1(String ss){
        name = ss;
    }
    public student1()
    {
        name = "unknown";
    }
}
class student2{
    public static void main(String[] args) {
        com.Gowtham_18bce0099.student1 obj = new com.Gowtham_18bce0099.student1();
        obj.ss = "Kalyan";
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }
}