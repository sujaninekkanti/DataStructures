package com.trees;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.root = new Node(0);
		tree.root.left = new Node(1);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(4);

		System.out.print("the inorder traversal of a tree is :");

		tree.printInorder(tree.root);

		System.out.print("\n the preorder traversal of a tree is :");

		tree.printPreorder(tree.root);

		System.out.print("\n the postorder traversal of a tree is :");

		tree.printPostorder(tree.root);
		
		System.out.print("\n the levelorder traversal of a tree is :");
		
		BreathFirstSearch breathfirstsearch = new BreathFirstSearch();
		
		breathfirstsearch.levelOrder(tree.root);

	}

}
