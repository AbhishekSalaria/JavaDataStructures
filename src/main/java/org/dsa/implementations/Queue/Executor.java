package org.dsa.implementations.Queue;

public class Executor {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.add(10);
        queue.add(23);
        queue.add(454);
        queue.add(-24);
        queue.add(26);
        queue.display();

        queue.add(19); // It won't be added as queue is full.

        System.out.println(queue.remove());
        queue.display();

        System.out.println(queue.remove());
        queue.display();

        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());

        System.out.println(queue.remove());
        queue.display();

        System.out.println(queue.remove());
        queue.display();

        System.out.println(queue.remove());
        queue.display();

        queue.remove();
    }
}
