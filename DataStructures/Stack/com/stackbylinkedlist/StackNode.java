package com.stackbylinkedlist;

public class StackNode {

	char data;
	StackNode next;
	
	
	public StackNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StackNode(char data) {
		super();
		this.data = data;
	}


	public char getData() {
		return data;
	}


	public void setData(char data) {
		this.data = data;
	}


	public StackNode getNext() {
		return next;
	}


	public void setNext(StackNode next) {
		this.next = next;
	}
	
	
	
}
