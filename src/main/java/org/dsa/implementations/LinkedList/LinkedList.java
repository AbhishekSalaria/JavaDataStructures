package org.dsa.implementations.LinkedList;

public class LinkedList {

    private Node head;

    class Node {
        private int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);

        if(this.head == null) {
            this.head = node;
        }
        else {
            Node last = this.head;

            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public void delete(int data) {
        Node current = this.head, previous = null;

        if (current != null && current.data == data) {
            System.out.println("Record " + data + " found and deleted.");
            this.head = current.next;
            return;
        }

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if(current != null) {
            previous.next = current.next;
            System.out.println("Record " + data + " found and deleted.");
        }

        if(current == null) {
            System.out.println("Record " + data + " not found.");
        }
    }

    public void display() {

        Node current = this.head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}