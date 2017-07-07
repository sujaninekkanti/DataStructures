package com.stackbylinkedlist;

public class Stack {

	StackNode  head = null;
	
	int lengthOfStack =0;
	
	public boolean isEmpty(){
		
		if(head == null){
			return true;
		}
		return false;
	}
	
	public void push(char data){
		StackNode node = new StackNode(data);
		node.next = head;
		head = node;
		lengthOfStack++;
	}
	
	public void pop(){
		
		StackNode currentNode = head;
		if(head != null){
			
			head = currentNode.getNext();
			currentNode.setNext(null);
			
			lengthOfStack--;
		}
		
	}
	
	
	public char peek(){
		StackNode currentNode = head;
		char peek = head.data;
		return peek;
	}
	
	
	public int lengthOfStack(){
		
		StackNode currentNode = head;
		
		while(currentNode != null){
			currentNode = currentNode.next;      
		}
		return lengthOfStack;
	}
	
	public void display(){
		
		StackNode currentNode = head;
		
		while(currentNode != null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		
		/*StackNode node = new StackNode(1);
		StackNode node1 = new StackNode(2);
		StackNode node2 = new StackNode(3);
		StackNode node3 = new StackNode(4);
		StackNode node4 = new StackNode(5);
		StackNode node5 = new StackNode(6);
		StackNode node6 = new StackNode(7);*/
		

		stack.push('1');
		stack.push('2');
		stack.push('3');
		stack.push('4');
		stack.push('5');
		stack.push('6');
		stack.push('7');

		System.out.println("the length of the stack is : "+stack.lengthOfStack());
		
		System.out.println("the elements in the stack are :");
		stack.display();
		stack.pop();
		
		System.out.println("Is stack empty  : "+stack.isEmpty());
		
		System.out.println("the length of the stack is : "+stack.lengthOfStack());
		
		System.out.println("the elements in the stack are :");
		stack.display();
		
		System.out.println("the peek element of the stack is "+stack.peek());
	}

}
