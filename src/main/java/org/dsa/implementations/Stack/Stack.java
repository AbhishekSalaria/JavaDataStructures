package org.dsa.implementations.Stack;

public class Stack {

    private int front;
    private int capacity;
    private int []stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.front = capacity - 1;
        this.stack = new int[capacity];
    }

    public void push(int element) {
        if(!isFull()) {
            this.stack[this.front--] = element;
        }
        else {
            System.out.println("Stack is Full...");
        }
    }

    public int pop() {
        if(!isEmpty()) {
            int element = this.stack[front + 1];
            this.stack[front + 1] = 0;
            this.front++;
            return element;
        }
        else {
            System.out.println("Stack is Empty...");
            return -1;
        }
    }

    public boolean isFull() {
        if(front == -1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.front == this.capacity - 1) {
            return true;
        }
        return false;
    }

    public void display() {
        if(!isEmpty()) {
            System.out.print("[ ");
            for(int i = this.front + 1; i <= this.capacity - 1; i++) {
                if(i == this.capacity - 1) {
                    System.out.print(this.stack[i]);
                }
                else {
                    System.out.print(this.stack[i] + ", ");
                }
            }
            System.out.println(" ]");
        }
        else {
            System.out.println("Stack is Empty...");
        }
    }
 }
