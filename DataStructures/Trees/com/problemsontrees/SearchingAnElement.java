package com.problemsontrees;

public class SearchingAnElement {

	public int searchAnElement(Node root,int data){
		
		if(root == null){
			return 0;
		}
		else{
			if(root.data == data){
				System.out.println("the element found and the value is "+root.data);
			}else{
				int temp = searchAnElement(root.left,data);
				if(temp!=0){
					System.out.println("the element found and the value is "+temp);
					return temp;
				}
				else{
					temp = searchAnElement(root.right,data);
				}
			}
		}
		
		return 0;
	}
	
}
