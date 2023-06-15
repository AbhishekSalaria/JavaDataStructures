package org.dsa.implementations.Set;

public class Executor {
    public static void main(String[] args) {
        Set set = new Set(5);

        System.out.println(set.isEmpty());
        System.out.println(set.isFull());

        System.out.println(set.delete(1));

        System.out.println(set.insert(1));
        System.out.println(set.insert(2));
        System.out.println(set.insert(2));
        System.out.println(set.insert(3));
        System.out.println(set.insert(4));
        System.out.println(set.insert(5));
        System.out.println(set.insert(6));

        set.display();

        System.out.println(set.delete(7));
        System.out.println(set.delete(3));

        set.display();

    }
}
