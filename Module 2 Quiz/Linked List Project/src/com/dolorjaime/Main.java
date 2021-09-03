package com.dolorjaime;

public class Main {

    public static void main(String[] args) {

        System.out.println("List after adding: ");
        PlayerList list = new PlayerList();
        //Add at start
        list.addFirst(new Player("Jaime", 1, 1));
        list.addFirst(new Player("Martin", 2, 4));
        list.addFirst(new Player("Dolor", 3, 9));
        //Add at end
        list.addLast(new Player("Mark", 4, 12));
        list.addLast(new Player("Jake", 5, 19));
        list.addLast(new Player("Robert", 6, 16));
        list.printList();
        System.out.println("Size: " + list.getSize());

        System.out.println("\n\nList after deletion: ");
        list.removeFirst();
        list.removeLast();
        list.removeLast();
        list.printList();
        System.out.println("Size: " + list.getSize());

        System.out.println("\n\nIndex Of Test");
        System.out.println("List: ");
        list.addFirst(new Player("Kazami", 7, 29));
        list.printList();
        System.out.print("Index of Kazami: " + list.indexOf("Kazami", 7, 29));
        System.out.print(", Index of Mark: " + list.indexOf("Mark", 4, 12));

        System.out.println("\n\nList after deletion:");
        list.removeLast();
        list.removeFirst();
        list.printList();
        System.out.print("Index of Kazami: " + list.indexOf("Kazami", 7, 29));
        System.out.print(", Index of Mark: " + list.indexOf("Mark", 4, 12));
        System.out.print("\nIndex of Martin: " + list.indexOf("Martin", 2, 4));
        System.out.print(", Index of Jaime: " + list.indexOf("Jaime", 1, 1));

        System.out.println("\n\nContains function test");
        list.printList();
        System.out.println("Contains Jaime?: " + list.contains("Jaime", 1, 1));
        System.out.println("Contains Martin?: " + list.contains("Martin", 2, 4));
        System.out.println("Contains Dolor?: " + list.contains("Dolor", 3, 9));
    }
}
