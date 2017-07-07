package com.stackbyarrays;

public class Stack {

	int stackarray[]  = new int[1000];
	int top = -1;
	int length = 0;
	int lengthOfStackArray = stackarray.length;
	
	
	public boolean isEmpty(){
	
		if(top==-1){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		
		if(top == lengthOfStackArray){
			return true;
		}
		return false;
	}
	
	public int size(){
		return length;
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
		}
		else
		{
			top--;
			length--;
		}
		
	}
	
	public void push(int element){
		top++;
		
		if(top > lengthOfStackArray){
			
			System.out.println("stack is full");
		}else{
			
			stackarray[top] = element;
			length++;	
		}
		
	}
	
	public int peek(){
		
		if(isEmpty()){
			
			System.out.println("stack is empty..");
		}
		return stackarray[top];
	}
	
	public void display(){
		
		if(!isEmpty()){
		
			for(int i=0;i<length;i++){
			
				System.out.println(stackarray[i]);
		
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		System.out.println("the length of stack is  : "+stack.length);
		
		stack.push(3);
		stack.push(13);
		stack.push(567);
		stack.push(5675);
		
		stack.display();
		System.out.println("the length of stack is  : "+stack.size());
		
		
		stack.pop();
		System.out.println("after poping the element form the stack");
		
		
		stack.display();
		
		
		System.out.println("the length of stack is  : "+stack.size());
		
		System.out.println("is stack empty : "+stack.isEmpty());
		
		System.out.println("is stack full : "+stack.isFull());
	}

}
