package com.dolorjaime;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    public void add(Player player)
    {
        //if full, resize array
        if (queue.length == back) {
            Player[] newQ = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newQ, 0, queue.length);
            queue = newQ;
        }

        queue[back] = player;
        back++;
    }

    public Player popFirst()
    {
        //throw exception if queue is empty
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        //retrieve first player in queue
        Player poppedPlayer = queue[front];
        queue[front] = null;
        front++;

        //reset front and back when queue is empty after popping
        if (size() == 0)
        {
            front = 0;
            back = 0;
        }

        return poppedPlayer;
    }

    public Player popLast()
    {
        //throw exception if queue is empty
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        //retrieve last player in queue
        Player poppedPlayer = queue[back - 1];
        queue[back - 1] = null;
        back--;

        //reset front and back when queue is empty after popping
        if (size() == 0)
        {
            front = 0;
            back = 0;
        }

        return poppedPlayer;

    }

    //peek first player in queue
    public Player peek()
    {
        //throw exception if queue is empty
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size()
    {
        return back - front;
    }

    public void printQueue() {

        if (size() == 0)
        {
            System.out.println("CRASH_QUEUE_IS_EMPTY");
            return;
        }

        System.out.print('[');
        for (int i = front; i < back; i++)
        {
            System.out.print(queue[i] + ", ");
        }
        System.out.print(']');

    }

}
