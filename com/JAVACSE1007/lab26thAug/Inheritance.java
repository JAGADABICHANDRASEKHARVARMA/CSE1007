package com.JAVACSE1007.lab26thAug;
class Calculator{                   //Name:- Jagadabi Chandrasekhar Varma
    public int add(int ... n){      //Reg.No:- 18BCE0100
        int sum = 0;
        for(int k : n){
            sum = sum + k;
        }
        return sum;
    }
}
class calAdv extends Calculator{
    public int sub(int ... n1){
        int subs = 0;
        for (int l : n1){
            subs = subs - l;
        }
        return subs;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        calAdv c1 = new calAdv();
        int result = c1.add(1,2,3,5,6,7,822,33,45,100);
        int result1 = c1.sub(2,3,4,2,100);
        System.out.println(result);
        System.out.println(result1);
    }
}

