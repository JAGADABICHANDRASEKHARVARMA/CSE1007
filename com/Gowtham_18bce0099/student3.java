package com.Gowtham_18bce0099;

class Student3
{
    Student3(String name) {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }
    Student3(String name, int age) {

        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }
    Student3(long id) {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}
class question3 {
    public static void main(String[] args) {
        com.Gowtham_18bce0099.Student3 geek2 = new com.Gowtham_18bce0099.Student3("Hari");
        com.Gowtham_18bce0099.Student3 geek3 = new com.Gowtham_18bce0099.Student3("Ramu", 26);
        com.Gowtham_18bce0099.Student3 geek4 = new com.Gowtham_18bce0099.Student3(325614567);
    }
}
