package com.Gowtham_18bce0099;
import com.Gowtham_18bce0099.student4;
class student4 {
    student4(String name) {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }
    student4(String name, int age) {

        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }
    student4(long id) {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}
class question4 {
    public static void main(String[] args) {
        student4 geek2 = new student4("sankar");
    }
}
