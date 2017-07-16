package com.problemsontrees;

public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.root = new Node(0);
		tree.root.left = new Node(1);
		tree.root.right = new Node(20);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(4);
		
		MaximumElementInBinaryTree maxElement = new MaximumElementInBinaryTree();
		
		System.out.println("the maximum element in the binary tree is : " + maxElement.maximumElement(tree.root));
		
		SearchingAnElement search = new SearchingAnElement();
		
		System.out.println("to search an element ...");
		
		search.searchAnElement(tree.root,7);
	}

}
