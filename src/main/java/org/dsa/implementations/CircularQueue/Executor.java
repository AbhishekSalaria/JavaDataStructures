package org.dsa.implementations.CircularQueue;

public class Executor {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.display();
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.isEmpty());

        circularQueue.enQueue(5);
        circularQueue.display();

        circularQueue.enQueue(4);
        circularQueue.enQueue(3);
        circularQueue.display();

        System.out.println(circularQueue.deQueue());
        circularQueue.display();

        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.isEmpty());

        circularQueue.enQueue(4);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.enQueue(3);
        System.out.println(circularQueue.isFull());
        circularQueue.display();

        System.out.println(circularQueue.deQueue());
        circularQueue.display();
        System.out.println(circularQueue.isFull());

        circularQueue.enQueue(20);
        circularQueue.display();
        System.out.println(circularQueue.isFull());

        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        circularQueue.display();

        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        circularQueue.display();
        System.out.println(circularQueue.deQueue());

    }
}
