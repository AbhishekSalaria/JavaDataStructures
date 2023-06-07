package org.dsa.implementations.Stack;

public class Executor {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        stack.display();
        stack.pop();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println(stack.pop());
        stack.display();

        stack.push(4);
        stack.push(7);
        stack.push(6);
        stack.display();
        stack.push(90);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(90);
        stack.display();
    }
}
