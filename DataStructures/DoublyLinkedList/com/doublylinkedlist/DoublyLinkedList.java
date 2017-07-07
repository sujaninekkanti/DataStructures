package com.doublylinkedlist;

import java.util.ListIterator;

public class DoublyLinkedList implements ListIterator{
	
	 ListNode head;
	 ListNode tail;
	ListNode previous;
	ListNode next;
	int length;

	ListNode iteratorNode;
	
	int index = 0;
	
	public DoublyLinkedList(){
		iteratorNode = head;
		//iteratorNode = tail;
	}
	
	public ListIterator createIterator(){
		return new DoublyLinkedList();
	}
	
	
	@Override
	public void add(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(head!=null){
			return true;
		}
		return false;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		if(iteratorNode!=null){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Integer temp=0;
		if(hasNext()){
			temp = head.data;
			head = head.next;
			index++;
			
		}
		
		return temp.toString();
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return index;
	}

	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		//System.out.println("in the previous method");
		Integer temp=0;
		if(hasPrevious()){
			temp = iteratorNode.data;
			iteratorNode = iteratorNode.previous;
			index--;
		}
		return temp.toString();
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return index-1;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(Object arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void display(){
		
		ListNode currentNode  = head;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public int getLengthOfList(){
		ListNode currentNode = head;
		while(currentNode!=null){
			currentNode = currentNode.next;
		}
		return length;
	}
	
	public void insertAtBegining(ListNode node){
		if(head==null){
			head = node;
			tail = head;
		}
		else{
			head.previous = node;
			node.next = head;
			head = node;
		}
		length++;
		
	}
	
	public void insertAtEnd(ListNode node){
		if(head == null){
			head = node;
			tail = head;
		}
		else{
			tail.next = node;
			node.previous = tail;
			node.next = null;
			tail = node;
		}
		
		length++;
	}
	
	public void insertAtAnyPosition(ListNode node,int position){
	    if(position < 0){
	    	position = 0;
	    }
	    if(position > length){
	    	position = length;
	    }
	    if(head == null){
	    	head = node;
	    	tail = head;
	    }
	    if(position == 0){
	    	node.next = head;
	    	head = node;
	    }
	    else{
	    	ListNode temp = head;
	    	for(int i=1;i<position;i++){
	    		temp = temp.getNext();
	    	}
	    	node.next = temp.next;
	    	node.previous = temp;
	    	node.next.previous = node;
	    	temp.next = node;
	    }
	    length++;
	}
	
	public void deleteHead(){
		ListNode node = head;
		if(head!=null){
			head = node.next;
			head.previous = null;
		}
		length--;
	}
	
	public void deleteTail(){
		ListNode node = tail;
		if(tail!=null){
			tail = tail.previous;
			tail.next = null;
		}
		length--;
	}
	
	public void palindrome(){
		
		for(int i =0;i<length/2;i++){
			
			if(head.data == tail.data){
				head = head.next;
				tail = tail.next;
			}else{
				System.out.println("the given list is not palindrome");
				return;
			}
			length--;
			System.out.println("the given list is a palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList doublylist = new DoublyLinkedList();
		
		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(8);
		ListNode node5 = new ListNode(5);


		
		doublylist.insertAtBegining(node);
		doublylist.insertAtBegining(node2);
		doublylist.insertAtEnd(node3);
		doublylist.insertAtEnd(node4);
		doublylist.insertAtAnyPosition(node5,3);
		
		doublylist.deleteHead();
		doublylist.deleteTail();
		
		doublylist.display();
		
		System.out.println("the length of the doubly linked list is "+doublylist.getLengthOfList());
	
	    
		ListIterator itr = doublylist.createIterator();
	
		System.out.println("from iterator");
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("from previous iterator");
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		System.out.println("checking the list palindrome or not");
		
		
		doublylist.palindrome();
		
	}

	

}
