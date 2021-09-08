package com.dolorjaime;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    final static int MAX_CARDS_IN_DECK = 30;
    final static int MAX_CARDS = 5;

    public static void main(String[] args) {

        System.out.println("Initializing Table: ");
        CardStack playerDeck = new CardStack(MAX_CARDS_IN_DECK);
        playerDeck.populateDeck(MAX_CARDS_IN_DECK);

        CardStack discardPile = new CardStack(MAX_CARDS_IN_DECK);
        ArrayList<Card> onHand = new ArrayList<Card>();
        tableStatus(playerDeck, discardPile, onHand);

        int round = 1;
        while (!playerDeck.isEmpty()) {

            System.out.println("\n\n\n\n============== Playing Round " + round + " ==============");
            playTurn(onHand, playerDeck, discardPile);
            System.out.println("\n");
            tableStatus(playerDeck, discardPile, onHand);
            pause();

            round++;
        }

        System.out.println("\n\n\n\nPlayer Deck is now empty!");

    }

    public static void tableStatus(CardStack playerDeck, CardStack discardPile, ArrayList<Card> onHand) {
        System.out.println("Player Deck: (" + playerDeck.getDeckSize() + " cards)");
        System.out.print("{ ");
        playerDeck.printDeck();
        System.out.println(" }");

        System.out.println("On-Hand: (" + onHand.size() + " cards)");
        System.out.println(onHand);

        System.out.println("Discard Pile: (" + discardPile.getDeckSize() + " cards)");
        System.out.print("{ ");
        discardPile.printDeck();
        System.out.println(" }");
    }

    public static void draw(CardStack from, ArrayList<Card> to) {
        Random rand = new Random();
        int draw = rand.nextInt(MAX_CARDS) + 1;
        System.out.println("You will draw " + draw + " times");

        for (int i = 0; i < draw; i++) {

            if (from.isEmpty()) {
                System.out.println("Deck is now empty, cannot draw anymore...");
                return;
            }

            System.out.println("You have drawn " + from.peek().getName());
            to.add(from.pop());
        }
    }

    public static void discard(ArrayList<Card> from, CardStack to) {
        Random rand = new Random();
        int discard = rand.nextInt(MAX_CARDS) + 1;
        System.out.println("You will discard " + discard + " cards");

        for (int i = 0; i < discard; i++) {
            System.out.println(from);
            if (from.isEmpty()){
                System.out.println("On-Hand is now empty, cannot discard anymore");
                return;
            }

            System.out.print("Input one index of card to discard: ");
            Scanner sc = new Scanner(System.in);
            int cardToMove = sc.nextInt();

            System.out.println("\nYou will discard " + from.get(cardToMove).getName());
            to.push(from.remove(cardToMove));
        }


    }

    public static void playTurn(ArrayList<Card> onHand, CardStack playerDeck, CardStack discardPile) {
        Random rand = new Random();
        int action = rand.nextInt(3) + 1;

        switch (action) {
            case 1:
                System.out.println("You will draw from Player Deck");
                draw(playerDeck, onHand);
                break;
            case 2:
                discard(onHand, discardPile);
                break;
            case 3:
                System.out.println("You will draw from Discard Pile");
                draw(discardPile, onHand);
                break;
        }
    }

    public static void pause() {
        System.out.println("Press any key to continue...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}
