package com.problemsontrees;

public class MaximumElementInBinaryTree {

	public int maximumElement(Node root){
		
		int left,right,rootvalue,max =0;
		
		if(root!=null){
			
			rootvalue = root.data;
			
			left = maximumElement(root.left);
			right = maximumElement(root.right);
			
			if(left > right){
				max = left;
			}
			else{
				max = right;
			}
			if(rootvalue > max){
				max = rootvalue;
			}
		}
		return max;
	}
}
