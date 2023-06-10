package org.dsa.implementations.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head,tail=null;

    class Node {
        private int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public void insert(int data) {

        Node node = new Node(data);

        if(this.head == null) {
            this.head = node;
            this.tail = node;
            this.head.previous = null;
            this.tail.next = null;

        }
        else {
            this.tail.next = node;
            node.previous = this.tail;
            this.tail = node;
            this.tail.next = null;
        }

    }

    public void delete(int data) {
        if(this.head == null) {
            System.out.println("List is Empty.");
        }
        else {
            if(this.head.data == data) {
                if(this.head.next != null) {
                    this.head.next.previous = null;
                    this.head = this.head.next;
                    return;
                }
                else {
                    this.head = null;
                    return;
                }
            }
            else if(this.head.data != data && this.head.next == null) {
                System.out.println("Not Found.");
                return;
            }

            Node previous = null;
            Node current = this.head;

            while(current.next != null && current.data != data) {
                previous = current;
                current = current.next;
            }

            if(current.data == data) {
                previous.next = previous.next.next;

                if(previous.next != null) {
                    previous.next.previous = previous;
                }
            }
            else {
                System.out.println("Not Found.");
            }
        }
    }

    public void display() {
        Node current = this.head;

        if(current == null) {
            System.out.println("List is Empty.");
            return;
        }
        System.out.println("Nodes of Doubly Linked List: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }
}
