package com.program;

public class BinarySearchTree {

	    /*
	     * Class containing left and right child of current
	     *  node and key value
	     */
	    class Node {
	        int key;
	        Node left;
	        Node right;

	        public Node(int item) {
	            key = item;
	            left = right = null;
	        }
	    }

	    // Root of BST
	    Node root;

	    // Constructor
	    BinarySearchTree() {
	        root = null;
	    }

	    // This method mainly calls insertRec()
	    public void insert(int key) {
	        root = insertRec(root, key);
	    }

	    /*
	     * A recursive function to insert a new key in BST
	     */
	    Node insertRec(Node root, int key)
	    {

	        /*
	         * If the tree is empty, return a new node
	         */
	        if (root == null)
	        {
	            root = new Node(key);
	            return root;
	        }

	        /* Otherwise, recur down the tree */
	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);

	        return root;
	    }
	    public void preorder(Node root) {
		    if(root == null) {
		        System.out.print(-1+" ");
		        return;
		    }
		    System.out.print(root.key+" ");
		    preorder(root.left);
		    preorder(root.right);
		 }
	  

	    public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();
	       
	        tree.insert(56);
	        tree.insert(30);
	        tree.insert(70);
            tree.preorder(tree.root);

	    }
	}
