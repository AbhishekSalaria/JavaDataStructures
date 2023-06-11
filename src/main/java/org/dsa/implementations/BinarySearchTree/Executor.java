package org.dsa.implementations.BinarySearchTree;

public class Executor {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        BinarySearchTree.Node root = new BinarySearchTree.Node(3);

        binarySearchTree.insert(root,1);
        binarySearchTree.insert(root,2);
        binarySearchTree.insert(root,4);
        binarySearchTree.insert(root,5);

        binarySearchTree.traverse(root);
    }
}
