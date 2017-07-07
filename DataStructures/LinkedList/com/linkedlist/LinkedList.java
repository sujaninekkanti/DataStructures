package com.linkedlist;

public class LinkedList {

	static Node head;
	
	public void display(){
		
		Node currentnode = head;
		
		while(currentnode!=null){
			
			System.out.println(" "+currentnode.data);
			currentnode = currentnode.next;
		}
	}
	
	public Node reverseList(Node currentnode){
		
		Node prevnode = null;
		Node nextnode;
		while(currentnode != null){
			
			nextnode = currentnode.next;
			currentnode.next = prevnode;
			prevnode = currentnode;
			currentnode = nextnode;
		}
		head = prevnode;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.head = new Node("1");
		
		Node second = new Node("2");
		Node third = new Node("3");
		Node fourth = new Node("4");
		
        linkedlist.head.next = second;
        second.next = third;
        third.next = fourth;
        
        linkedlist.display();
        System.out.println("after reversing the list");
        
        head  = linkedlist.reverseList(head);
        linkedlist.display();
	}

}
