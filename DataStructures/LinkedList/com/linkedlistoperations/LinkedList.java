package com.linkedlistoperations;

import java.util.Iterator;

public class LinkedList implements Iterator{
	
     static ListNode head;
	//for holding next node data 
	ListNode next;
    int length=0;
	//iterator methods to print list
	ListNode iteratorNode;
	
	
	//linked list constructor assigning head node to iterator node
	public LinkedList(){
		iteratorNode = head;
	}
	
	
	//creating an iterator for the linked list
	
	
	public Iterator iterator(){
		return new LinkedList();
	}
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(iteratorNode!=null){
			return true;
		}
		return false;
	}
	@Override
	public String next() {
		// TODO Auto-generated method stub
		String result ="";
		if(hasNext()){
			result = iteratorNode.data;
			iteratorNode = iteratorNode.next;
		}
		return result;
	}
 
	/**
	 * @return the length of the list
	 */
	public int getLengthOfList(){
		//assigning head node to current node
		ListNode currentnode = head;
		// traversing the entire list till the value reaches to null
		while(currentnode!=null){
			currentnode =currentnode.getNext();
			//length++;
		}
		return length;
	}
	
	/**
	 * @param node
	 * the time complexity of inserting at the beginning of the list is big oh(1) 
	 * no need to traverse the entire list
	 */
	public void insertAtBegining(ListNode node){
			node.next =head;
			head = node;
			length++;
	}
	
	/**
	 * @param node
	 * the time complexity of inserting at the end of the list is big oh(n)
	 * need to traverse the entire list till it reached the null value 
	 */
	public void insertAtEnd(ListNode node){
		if(head==null){
			head = node;
		}
		ListNode p,q;
		for(p=head;(q=p.getNext())!=null;p=q);
				p.setNext(node);
				length++;
	}
	
	/**
	 * @param node to be inserted
	 * @param position where to be inserted
	 * time taking to travese the list is big oh of (1)
	 */
	public void insertAtAnyPosition(ListNode node,int position){
		//checking the position values less than zero and greater than length
		if(position < 0){
			//make position values to zero
			position =0;
		}
		
		if(position > length){
			//make position to length 
			position = length;
		}
		//if head node is null make node as head
		if(head == null){
			head = node;
		}
		//when position is 0 make the node as head and head node as next node
		else if(position == 0){
			ListNode temp = node;
			temp.next = head;
			head = temp;
		}
		else{
			// when position is not 0 
			ListNode temp = head;
			//traverse the list from head
			for(int i=1;i<position;i++){
				//head next node is saved in temp and so on...till the position values is reached
				temp = temp.getNext();
			}
			ListNode newnode = node;
			newnode.next = temp.next;
			//setting the node.next position to passed node
			temp.setNext(node);
		}
		length++;
	}
	
	/**
	 * @return
	 * setting head node reference to null 
	 * the time complexity for removal first node is big oh(1)
	 */
	public void removeFirstNode(){
		ListNode node =head;
		if(head!=null){
			//assigning the reference of head node to next node
			head = node.getNext();
			//the head node reference is set to null
			node.setNext(null);
			length--;
		}
		}
	
	/**
	 * @return last node
	 * to remove last node we should traverse the list and assign previoustolast node is null
	 * the time complexity of deleting last node is big oh(n)
	 * we need to traverse the entire list to find the last node
	 */
	public void removeLastNode(){
		//creating last node which points to head
		ListNode last =head;
		//creating another node which is set previoustolast is null
		ListNode previousTolast =null;
		//when head of the list is null
		if(head ==null){
			return;
		}
		//we should reach the last node of the list when last.nxt is null
		//setting previoustolast is lastnode
		while(last.next!=null){
			previousTolast = last;
			last = last.next;
		}
		//assigning previoustolast node reference to null
		previousTolast.next = null;
		length--;
		//return last;
	}
	/**
	 * Displaying the contents in the list
	 * time taken to display the contents in the list is big oh(n)
	 */
	public void display(){
		ListNode  currentNode = head;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}	
	}

	/**
	 * @param node to be removed
	 * @param position at the which position 
	 * time complexity to remove at a given  position is big oh(1)
	 */
	public void removeNodeAtPosition(ListNode node,int position){
		
		if(position < 0){
			position =0;
		}
		if(position > length){
			position = length;
		}
		if(head == null){
			return;
		}
		if(position == 0){
			head = head.getNext();
		}
		else{
			ListNode temp = head;
			for(int i=1;i<position;i++){
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		length--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating linked list
		LinkedList list = new LinkedList();
		
		//creating nodes 
		ListNode node1 = new ListNode("one");
		ListNode node2 = new ListNode("two");
		ListNode node3 = new ListNode("three");
		ListNode node4 = new ListNode("zero");
		
		
		System.out.println("the length of the list is : "+list.getLengthOfList());
		
		System.out.println("inserting the node at the begining of the list");
		
		list.insertAtBegining(node4);
		
		System.out.println("after inserting the node the list as follows:");
		
		list.display();
		
		list.insertAtEnd(node1);
		
		System.out.println("after inserting the node at the end of the list");
		
		list.display();
		
		list.insertAtAnyPosition(node2,2);
		
		System.out.println("after inserting at the position is");
		
		list.display();
		
		list.insertAtEnd(node3);
		
		list.display();
		
		System.out.println("removing the first node of the list");
		
		list.removeFirstNode();
		
		System.out.println("after removing the first node");
		
		list.display();
		
		System.out.println("after removing the last node");
		
		list.removeLastNode();
		
		list.display();
		
		System.out.println("removing the element at a given position");
		
		list.removeNodeAtPosition(node1, 1);
		
		list.display();
		
		System.out.println("printing the list from iterator..");
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
		System.out.println("the length of the list is : "+list.getLengthOfList());
	}
	
}
