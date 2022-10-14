package com.program;

public class BinarySearchTree {

	 class Node {
	       int data;
	       Node left;
	       Node right;
	 
	       Node(int data) {
	           this.data = data;
	           this.left = null;
	           this.right = null;
	       }
	   }		 

	        int idx = -1;
	       public  Node buildTree(int nodes[]) {
	           idx++;
	           if(nodes[idx] == -1) {
	               return null;
	           }
	           Node newNode = new Node(nodes[idx]); 
	           newNode.left = buildTree(nodes);
	           newNode.right = buildTree(nodes);
	           return newNode;
	       }  
	 public void preorder(Node root) {
	    if(root == null) {
	        System.out.print(-1+" ");
	        return;
	    }
	    System.out.print(root.data+" ");
	    preorder(root.left);
	    preorder(root.right);
	 }
	 public boolean ifNodeExists( Node root, int input)
	    {
	        if (root == null)
	            return false;
	     
	        if (root.data == input)
	            return true;
	     
	        // then recur on left subtree /
	        boolean res1 = ifNodeExists(root.left, input);
	       
	        // node found, no need to look further
	        if(res1==true) return true;
	     
	        // node is not found in left,
	        // so recur on right subtree /
	        boolean res2 = ifNodeExists(root.right, input);
	     
	        return res2;
	    }
	   public static void main(String args[]) {
	       int nodes[] = {56, 30,22,11,3,-1,-1,16,-1,-1,-1,40,-1,
	    		   -1,70,60,-1,65,62,-1,-1,67,-1,-1,95,-1,-1};
	       
	       BinarySearchTree tree = new BinarySearchTree();  
	       Node root = tree.buildTree(nodes);
	       //   Search The Tree Input are In Below  put
	       System.out.println(tree.ifNodeExists(root, 67));
	   }
}

