package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

	public void levelOrder(Node root){
		
		if(root == null){
			return;
		}
		else{
			//creating a queue
			Queue<Node> queue = new LinkedList<Node>();
			//add the root to queue
			queue.add(root);
			
			while(!queue.isEmpty()){
				
			Node tempNode = (Node) queue.poll();
			System.out.print(" "+tempNode.data);
			
			if(tempNode.left !=null){
				queue.add(tempNode.left);
			}
			if(tempNode.right !=null){
				queue.add(tempNode.right);
			}
			}
		}
	}
}
