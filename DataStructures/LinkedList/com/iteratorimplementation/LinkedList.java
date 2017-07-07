package com.iteratorimplementation;

import java.util.Iterator;

public class LinkedList implements Iterator{

	static LinkNode head;
	LinkNode current = head;
	int currentIndex = 0;
	static int length =0;
	
	LinkedList LinkNode;

	public int LinkedListSize(LinkNode head){
		LinkNode current = head;
		while(current!=null){
			current = current.getNext();
			length++;		
		}
		
		return length;	
	}
	
		

	public Iterator<LinkedList> iterator()
	   {
	      return new LinkedList();
	   }
	 LinkNode nextnode;
		//LinkNode head;
		
		public LinkedList() {
		    nextnode = head;
		}	

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(nextnode!=null)
			{
				return true;
			}
			return false;
		}

		
		public String next() {
			// TODO Auto-generated method stub
			 String result ="";
			if(hasNext())
				 result  = nextnode.data;
			    nextnode = nextnode.next;
			return result;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList list = new LinkedList();
       LinkNode node = new LinkNode("sujani");
       LinkNode node2 = new LinkNode("nekkanti");
       LinkNode node3 = new LinkNode("abcd");
       LinkNode node4 = new LinkNode("xyz");
     
      list.head = node;
       head.next = node2;
       node2.next = node3;
       node3.next = node4;
     
     // list.display();
       System.out.println("the length of linked list is "+list.LinkedListSize(head));
   
       Iterator itr = list.iterator();
       
       while(itr.hasNext()){
    	   System.out.println(itr.next()+" ");
    	   //System.out.println();
       }
      
}
}
