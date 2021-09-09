package com.dolorjaime;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int totalPlayers = 1;
    public final static int MAX_PLAYERS_LOBBY = 5;

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(30);
        int gamesMade = 0;


        while (gamesMade < 10)
        {
            System.out.println("Games made: " + gamesMade + "\n\n");

            goQueue(queue);
            queue.printQueue();
            pause();

            if (isEligible(queue))
            {
                System.out.println("Match has been made!");
                for (int i = 0; i < MAX_PLAYERS_LOBBY; i++)
                {
                    System.out.println(queue.popFirst() + " has entered the game");
                }
                gamesMade++;
            }
        }

        System.out.println("\n\n\nSUCCESS! 10 GAMES HAVE BEEN MADE");

    }

    public static void goQueue(ArrayQueue queue) {
        Random rand = new Random();
        int x = rand.nextInt(7) + 1;
        System.out.println(x + " players will queue");

        for (int i = 0; i < x; i++) {
            queue.add(new Player(totalPlayers, "Player " + totalPlayers, totalPlayers));
            totalPlayers++;
        }
    }

    public static boolean isEligible(ArrayQueue queue) {
        return queue.size() >= MAX_PLAYERS_LOBBY;
    }

    public static void pause() {
        System.out.println("\nPress enter to continue...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }



}
