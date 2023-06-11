package org.dsa.implementations.BinarySearchTree;

public class BinarySearchTree {

    public Node root;

    static class Node {
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if(value < node.value){
            if(node.left != null) {
                insert(node.left,value);
            }
            else {
               node.left = new Node(value); 
            }
        } else{
            if(node.right != null) {
                insert(node.right,value);
            }
            else {
                node.right = new Node(value);
            }
        }
    }

    public void traverse(Node node) {
        if(node != null) {
            traverse(node.left);
            System.out.print(" " + node.value);
            traverse(node.right);
        }
    }
}
