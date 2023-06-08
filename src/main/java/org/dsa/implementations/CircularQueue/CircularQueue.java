package org.dsa.implementations.CircularQueue;

public class CircularQueue {
    private int front;
    private int rear;
    private int capacity;
    private int[] circularQueue;

    public CircularQueue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        this.circularQueue = new int[capacity];
    }

    public boolean isFull() {
        if(((this.rear + 1) % this.capacity) == (this.front % this.capacity)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(this.front == -1 && this.rear == -1) {
            return true;
        }
        if(this.front % this.capacity == this.rear % this.capacity) {
            return false;
        }
        return false;
    }

    public void enQueue(int element) {
        if(!isFull()) {
            if(this.front == -1) {
                this.front = 0;
            }
            this.rear++;
            this.circularQueue[this.rear % this.capacity] = element;
        }
        else {
            System.out.println("Circular Queue is Full...");
        }
    }

    public int deQueue() {
        if(!isEmpty()) {
            int element = this.circularQueue[this.front % this.capacity];
            this.circularQueue[this.front % this.capacity] = 0;
            if(this.front == this.rear) {
                this.front = -1;
                this.rear = -1;
            }
            else {
                this.front++;
            }
            return element;
        }
        else {
            System.out.println("Circular Queue is Empty...");
            return -1;
        }
    }

    public void display() {
        if(!isEmpty()) {
            System.out.print("[ ");
            for (int i = this.front; i <= this.rear; i++) {
                if (i == this.rear) {
                    System.out.print(this.circularQueue[i % this.capacity]);
                } else {
                    System.out.print(this.circularQueue[i % this.capacity] + ", ");
                }
            }
            System.out.println(" ]");
        }
        else {
            System.out.println("Circular Queue is Empty...");
        }
    }
}