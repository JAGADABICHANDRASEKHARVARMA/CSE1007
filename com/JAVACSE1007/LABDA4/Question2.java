package com.JAVACSE1007.LABDA4;

import java.util.TreeSet;
public class Question2 {
    public static void main(String[] args) {
        //PART i
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");
        tree_set1.add("Green");
        tree_set1.add("Orange");
        tree_set1.add("White");
        tree_set1.add("Black");
        System.out.println("Tree set1: ");
        System.out.println(tree_set1);
        //part - 2
        for (String element : tree_set1) {
            System.out.println(element);
        }
        // Part - 3
        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Pink");
        tree_set2.add("White");
        tree_set2.add("Black");
        System.out.println("Tree set2: "+tree_set2);
        tree_set1.addAll(tree_set2);
        System.out.println("Tree set1: "+tree_set1);
        //part:- 4
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);
        System.out.println("Original tree set: "+tree_num);
        System.out.println("Retrives the first element: "+tree_num.pollFirst());

        //part:- 5
        System.out.println("Tree set after removing first element: "+tree_num);
    }
}
