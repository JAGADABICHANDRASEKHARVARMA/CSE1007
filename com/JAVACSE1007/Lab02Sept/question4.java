package com.JAVACSE1007.Lab02Sept;
class Student2                   //Name:- Jagadabi chandrasekhar Varma
{                                //reg.no:- 18BCE0100
    Student2(String name) {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }
    Student2(String name, int age) {

        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }
    Student2(long id) {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}
class question4 {
    public static void main(String[] args) {
        Student2 geek2 = new Student2("Shikhar");
    }
}

