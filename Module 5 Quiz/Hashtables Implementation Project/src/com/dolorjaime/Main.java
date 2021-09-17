package com.dolorjaime;

public class Main {

    public static void main(String[] args) {

        ClosedHashTable closeHashTable = new ClosedHashTable();
        SimpleHashtable openHashtable = new SimpleHashtable();

        Player ploo = new Player(1234, 135, "Plooful");
        Player wardell = new Player(536, 640, "TSM Wardell");
        Player deadlyJimmy = new Player(32, 34, "DeadlyJimmy");
        Player subroza = new Player(4931, 604, "Subroza");
        Player annieDro = new Player(6919, 593, "C9 Annie");

//        closeHashTable.put(ploo.getName(), ploo);
//        closeHashTable.put(wardell.getName(), wardell);
//        closeHashTable.put(deadlyJimmy.getName(), deadlyJimmy);
//        closeHashTable.put(subroza.getName(), subroza);
//        closeHashTable.put(annieDro.getName(), annieDro);
//
//        closeHashTable.printHashtable();
//        System.out.println(closeHashTable.get("C9 Annie"));

        openHashtable.put(ploo.getName(), ploo);
        openHashtable.put(wardell.getName(), wardell);
        openHashtable.put(deadlyJimmy.getName(), deadlyJimmy);
        openHashtable.put(subroza.getName(), subroza);
        openHashtable.put(annieDro.getName(), annieDro);

        System.out.println("Before Removing");
        openHashtable.printHashtable();

        System.out.println("\n\nRemoved " + openHashtable.remove("Plooful"));
        openHashtable.printHashtable();

    }
}
