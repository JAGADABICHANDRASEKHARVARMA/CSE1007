package com.JAVACSE1007.Lab11Nov;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class Sample implements Serializable {
    public String pid;
    public int diameter;
    public int length;
    public int weight;
    public Sample(String pid, int diameter, int length, int weight) {
        this.pid = pid;
        this.diameter = diameter;
        this.length = length;
        this.weight = weight;
    }
}
public class Question3
{
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String pid;
        int diameter;
        int length;
        int weight;
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        int n;
        System.out.println("Enter the number of product samples: ");
        n = scanner.nextInt();
        for(int l=0; l<n; l++) {
            System.out.println("Enter the details of product "+(l+1));
            pid = scanner.next();
            length = scanner.nextInt();
            diameter = scanner.nextInt();
            weight = scanner.nextInt();
            Sample object = new Sample(pid, diameter, length, weight);
            String filename = "file.txt";

// Serialization
 try
            {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(object);
                out.close();
                file.close(); }
catch (IOException ex) {
                System.out.println("IOException is caught"); }
            Sample object2 = null;
try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object2 = (Sample) in.readObject();
            in.close(); file.close();
            if (object2.length != 10 || object2.diameter != 3 || object2.weight != 100) {
                list.add((object2.pid).toString()); }
        }
catch (IOException ex) {
            System.out.println("IOException is caught"); }
catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught"); }
    }
System.out.println("The product id of defective sample is:"); for(String j:list)
    {
        System.out.println(j); }
}
}