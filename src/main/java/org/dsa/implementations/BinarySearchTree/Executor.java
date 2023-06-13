package org.dsa.implementations.BinarySearchTree;

public class Executor {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        BinarySearchTree.Node root = new BinarySearchTree.Node(3);

        binarySearchTree.insert(root,1);
        binarySearchTree.insert(root,2);
        binarySearchTree.insert(root,4);
        binarySearchTree.insert(root,5);

        System.out.println("Inroder Traversal");
        binarySearchTree.inorderTraversal(root);

        System.out.println("");
        System.out.println("Preorder Traversal");
        binarySearchTree.preorderTraversal(root);

        System.out.println("");
        System.out.println("Postorder Traversal");
        binarySearchTree.postorderTraversal(root);

        System.out.println("");
        binarySearchTree.search(root,1);
        binarySearchTree.search(root,2);
        binarySearchTree.search(root,3);
        binarySearchTree.search(root,4);
        binarySearchTree.search(root,5);
        binarySearchTree.search(root,6);

        root = binarySearchTree.delete(root,3);

        binarySearchTree.postorderTraversal(root);
    }
}
