package com.dolorjaime;

public class PlayerList {

    //This player list is an implementation of a linked list
    public class Node {

        private Node(Player player) {
            this.player = player;
        }

        private Player player;
        private Node next;
        private Node prev;

        public Player getPlayer() {
            return player;
        }
        public Node getNext() {
            return next;
        }
        public Node getPrev() {
            return prev;
        }
    }

    public PlayerList() {
        first = null;
        last = null;
        size = 0;
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(Player player) {
        Node node = new Node(player);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }
    public void addLast(Player player) {
        Node node = new Node(player);
        if (isEmpty()){
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }
    public void removeFirst() {
        if (isEmpty()) return;
        if (first == last){
            first = null;
            last = null;
            size--;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }
    public void removeLast() {
        if (isEmpty()) return;
        if (first == last) {
            first = null;
            last = null;
            size--;
            return;
        }
        last = last.prev;
        last.next = null;
        size--;
    }
    public int indexOf(String name, int id, int level) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if ((current.getPlayer().getName() == name) && (current.getPlayer().getId() == id) && (current.getPlayer().getLevel() == level)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(String name, int id, int level) {
        return indexOf(name, id, level) != -1;
    }

    public int getSize() {return size;}

    //helper functions
    private  boolean isEmpty() {
        return first == null;
    }
    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.getPlayer().getName() + ", Level: " + current.getPlayer().getLevel() + ", ID: " + current.getPlayer().getId());
            current = current.next;
        }
    }

}
