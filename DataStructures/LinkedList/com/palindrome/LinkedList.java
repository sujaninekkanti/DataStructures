package com.palindrome;

public class LinkedList {
	
	static ListNode head;
	static ListNode rhead;
	int length;
	

		public void display(ListNode current){
		
		//ListNode current = head;
		
		while(current!=null){
			System.out.println(" "+current.data);
			current = current.next;
		}
	}
	
	public ListNode reverseList(ListNode currentnode){
		
	    ListNode prevnode = null;
		ListNode nextnode;
		while(currentnode != null){
			
			nextnode = currentnode.next;
			currentnode.next = prevnode;
			prevnode = currentnode;
			currentnode = nextnode;
		}
		rhead = prevnode;
		return rhead;
	}

	
	public boolean compareTwoLists(ListNode head,ListNode rhead){
		
	
		LinkedList rlist = new LinkedList();
		 rhead  = rlist.reverseList(head);
		 
		
		 LinkedList list = new LinkedList();
		  head = list.reverseList(rhead);
	       
	       //checking both list heads null condition
		while(head != null && rhead != null){
			
			//if not null compare both data of two lists 
			if(head.data == rhead.data){
				head = head.next;
				rhead = rhead.next;
			}
			else 
			{
				System.out.println("the given linked list is not a palindrome");
				return false;
			}
		}
		if(head==null && rhead ==null){
			
			System.out.println("both the lists are empty so there are palindrome");
				return true;
			}
		else{
		System.out.println("the given linked list is  a palindrome");
		}
		return true;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       ListNode node = new ListNode("1");
       ListNode node1 = new ListNode("2");
       ListNode node2 = new ListNode("1");
       
       LinkedList list = new LinkedList();
       
       list.head = node;
       node.next = node1;
       node1.next = node2;
       
       System.out.println("the current list is ");
       
       list.display(head);
       
       System.out.println(list.compareTwoLists(head, rhead));
       
       System.out.println("the current list after reversing is... ");
       
       rhead  = list.reverseList(head);
       
       list.display(rhead);
       
	}

}
