package org.dsa.implementations.Set;

public class Set {

    private int size;
    private int arr[];
    private int currentIndex;

    public Set(int size) {
        this.size = size;
        this.arr = new int[size];
        this.currentIndex = 0;
    }

    public boolean insert(int data) {
        if(this.contains(data)) {
            return false;
        }
        if(this.isFull()) {
            System.out.println("Set is Full.");
            return false;
        }
        this.arr[this.currentIndex++] = data;
        return true;
    }

    public boolean contains(int data) {
        for(int i = 0; i < this.size ; i++) {
            if(this.arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    private int containsIndex(int data) {
        for(int i = 0; i < this.size ; i++) {
            if(this.arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean delete(int data) {
        int index = this.containsIndex(data);
        if(index == -1) {
            System.out.println("Record doesn't exist.");
            return false;
        }
        if(this.isEmpty()) {
            System.out.println("Set is Empty.");
            return false;
        }
        for(int i = index ; i < this.currentIndex - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.currentIndex--;
        return true;
    }

    public boolean isFull() {
        if(this.currentIndex == this.size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.currentIndex == 0) {
            return true;
        }
        return false;
    }

    public void display() {
        if(!isEmpty()) {
            System.out.print("[ ");
            for(int i = 0; i < this.currentIndex;i++) {
                if(i != this.currentIndex - 1) {
                    System.out.print(this.arr[i] + ", ");
                }
                else {
                    System.out.print(this.arr[i]);
                }
            }
            System.out.println(" ]");
        }
        else {
            System.out.println("Set is Empty.");
        }
    }

}
