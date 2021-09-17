package com.dolorjaime;

import java.util.Iterator;
import java.util.LinkedList;

public class ClosedHashTable {
    LinkedList<Player>[] hashtable;

    public ClosedHashTable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<Player>();
        }
    }

    private int hashKey(String key) {
        char[] chars = key.toCharArray();

        int total = 0;
        for (int i = 0; i < chars.length; i++) {
            total += chars[i];
        }

        return total % hashtable.length;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);

        hashtable[hashedKey].add(value);
    }

    public Player get(String key) {
        int hashedKey = hashKey(key);

        for (int i = 0; i < hashtable[hashedKey].size(); i++) {
            if (key.equals(hashtable[hashedKey].get(i).getName())) {
                return hashtable[hashedKey].get(i);
            }
        }

        return null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.print("Element " + i + " ");
            if (hashtable[i].size() > 1) {
                Iterator<Player> iterator = hashtable[i].iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + ", ");
                }
                System.out.print("\n");
            } else {
                System.out.println(hashtable[i]);
            }
        }
    }
}
