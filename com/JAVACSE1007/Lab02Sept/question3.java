package com.JAVACSE1007.Lab02Sept;
class Student1            //Name:- Jagadabi chandrasekhar Varma
{                         //reg.No:- 18BCE0100
    Student1(String name) {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }
    Student1(String name, int age) {

        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }
    Student1(long id) {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}
class question3 {
    public static void main(String[] args) {
        Student1 geek2 = new Student1("Shikhar");
        Student1 geek3 = new Student1("Dharmesh", 26);
        Student1 geek4 = new Student1(325614567);
    }
}
