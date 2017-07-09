package com.trees;

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
}
