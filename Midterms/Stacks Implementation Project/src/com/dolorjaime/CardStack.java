package com.dolorjaime;

public class CardStack {
    private Card[] stack;
    private int top;

    public CardStack(int capacity) {
        stack = new Card[capacity];
    }

    public void push(Card card) {
        if (top == stack.length) {
            //resize
            Card[] newStack = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top] = card;
        top++;
    }

    public Card pop() {
        if (isEmpty()) {
            System.out.println("Deck is empty...");
            return null;
        }

        Card poppedCard = stack[top - 1];
        top--;
        stack[top] = null;
        return poppedCard;
    }

    public Card peek() {
        if (isEmpty()) {
            System.out.println("Deck is empty...");
            return null;
        }

        return stack[top - 1];
    }



    //helper functions
    public boolean isEmpty() {
        return top == 0;
    }

    public void printDeck() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(stack[i].getName() + ", ");
        }
    }

    public void populateDeck(int amount) {
        CardNames.Names names = new CardNames.Names();
        for (int i = 0; i < amount ; i++) {
            push(new Card(names.generateName()));
        };
    }

    public int getDeckSize() {
        return top;
    }
}
