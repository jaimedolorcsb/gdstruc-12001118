package com.company;

public class Main {

    public static void main(String[] args) {

        //Tree 1
        int[] num = {3, 5, 1, 6, 8, -5, 7, 10 ,17, 14, -10};
        Tree tree = new Tree();
        for (int i = 0; i < num.length; i++)
            tree.insert(num[i]);

        //Tree 2
        int[] num2 = {2, -1, 4, 8, 10, 13, 15, -10, -8, 16, 14, 21, 6, 5};
        Tree tree2 = new Tree();
        for (int i = 0; i < num2.length; i++)
            tree2.insert(num2[i]);

        System.out.println("Traversing Tree 1 in Ascending");
        tree.traverseInOrder();
        System.out.println("Traversing Tree 1 in Descending");
        tree.traverseInOrderDescending();
        System.out.println("Max Value of Tree 1: " + tree.getMax());
        System.out.println("Min Value of Tree 1: " + tree.getMin());

        System.out.println("Traversing Tree 2 in Ascending");
        tree2.traverseInOrder();
        System.out.println("Traversing Tree 2 in Descending");
        tree2.traverseInOrderDescending();
        System.out.println("Max Value of Tree 2: " + tree2.getMax());
        System.out.println("Min Value of Tree 2: " + tree2.getMin());
    }
}
