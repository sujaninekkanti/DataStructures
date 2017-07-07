package com.doublylinkedlist;

public class ListNode {

	int data;
	ListNode previous;
	ListNode next;
	
	
	public ListNode() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ListNode(int data) {
		super();
		this.data = data;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public ListNode getPrevious() {
		return previous;
	}


	public void setPrevious(ListNode previous) {
		this.previous = previous;
	}


	public ListNode getNext() {
		return next;
	}


	public void setNext(ListNode next) {
		this.next = next;
	}
	
	
	
	
}
