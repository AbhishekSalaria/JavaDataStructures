package org.dsa.implementations.Queue;

/*
*  Queue is Basically is FIFO implementation.
*  Elements are added in rear and removed from front.
* */
public class Queue {
    private int front;
    private int rear;
    private int capacity;
    private int[] queue;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[capacity];
    }

    public void add(int element) {
        if(isFull()) {
            System.out.println("Queue is Full...");
        }
        else {
            if (this.front == -1 && this.rear == -1) {
                this.front++;
                this.rear++;
            }
            queue[this.rear++] = element;
        }
    }

    public boolean isFull() {
        if(this.rear == this.capacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(this.front == this.rear) {
            return true;
        }
        return false;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty...");
            return -1;
        }
        int removed = queue[this.front];
        for (int i = this.front; i < this.rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[this.rear - 1] = 0;
        this.rear--;

        return removed;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty...");
        }
        else {
            System.out.print("[ ");
            for(int i = this.front; i <= this.rear - 1; i++) {
                if(i != this.rear - 1) {
                    System.out.print(this.queue[i] + ", ");
                }
                else {
                    System.out.print(this.queue[i]);
                }
            }
            System.out.println(" ]");
        }
    }
}
