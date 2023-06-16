package org.dsa.implementations.LinkedList;

public class Executor {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();

        list.search(1);
        list.search(3);
        list.search(5);
        list.search(6);

        list.delete(4);
        list.display();
        list.delete(7);
        list.display();
    }
}
