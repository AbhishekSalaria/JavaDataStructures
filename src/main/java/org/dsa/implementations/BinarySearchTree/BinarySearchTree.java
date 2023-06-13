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

    public void search(Node node, int value) {
        if(node == null) {
            System.out.println(value + " Not Found!");
            return;
        }
        else if(node.value == value) {
            System.out.println(value + " Found!");
        }
        else if(value < node.value) {
            search(node.left,value);
        }
        else {
            search(node.right,value);
        }
    }

    public Node delete(Node node, int value) {
        if(node == null) {
            return node;
        }
        if(value < node.value) {
            node.left = delete(node.left,value);
        } else if (value > node.value) {
            node.right = delete(node.right,value);
        }
        else {
            if(node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if(temp == null) {
                    return null;
                }
                else {
                    return temp;
                }
            }
            else  {
                Node successor = getSuccessor(node);
                node.value = successor.value;
                node.right = delete(node.right,successor.value);
                return node;
            }
        }
        return node;
    }

    private Node getSuccessor(Node node) {
        if(node == null) {
            return null;
        }
        Node temp = node.right;

        if(temp.left != null) {
            temp = temp.left;
        }
        return  temp;
    }

    public void inorderTraversal(Node node) {
        if(node != null) {
            inorderTraversal(node.left);
            System.out.print(" " + node.value);
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(Node node) {
        if(node != null) {
            System.out.print(" " + node.value);
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
    public void postorderTraversal(Node node) {
        if(node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(" " + node.value);
        }
    }
}