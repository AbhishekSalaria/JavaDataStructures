package org.dsa.implementations.DoublyLinkedList;

public class Executor {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.display();

        System.out.println("Adding Data...");

        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(5);

        doublyLinkedList.display();

        doublyLinkedList.delete(1);
        doublyLinkedList.delete(3);
        doublyLinkedList.delete(5);
        doublyLinkedList.delete(6);

        doublyLinkedList.display();
    }
}
