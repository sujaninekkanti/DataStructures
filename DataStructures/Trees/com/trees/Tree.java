package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	Node root;

	// *****************Tree Traversals****************** //

	public void printInorder(Node node) {

		if (node == null) {
			return;
		} else {

			printInorder(node.getLeft());

			System.out.print(" " + node.getData());

			printInorder(node.getRight());
		}
	}

	public void printPreorder(Node node) {

		if (node == null) {
			return;
		} else {

			System.out.print(" " + node.getData());

			printPreorder(node.getLeft());

			printPreorder(node.getRight());

		}
	}

	public void printPostorder(Node node) {

		if (node == null) {
			return;
		} else {

			printPostorder(node.getLeft());

			printPostorder(node.getRight());
			
			System.out.print(" " + node.getData());
		}
	}
   
	
	/* inserting a node in a binary tree*/
	
	public void insert(int data){
		
		if(root ==null){
			root = new Node(data);
			return;
		}else{
			Queue<Node> queueToInsert = new LinkedList<Node>();
			queueToInsert.add(root);
			
			while(!queueToInsert.isEmpty()){
				
				Node tempNode = (Node) queueToInsert.poll();
				
				if(tempNode.left==null){
					tempNode.left = new Node(data);
					return;
				}
				
				if(tempNode.right==null){
					tempNode.right = new Node(data);
					return;
				}
				queueToInsert.add(tempNode.left);
				queueToInsert.add(tempNode.right);
			}
		}
	}

}
