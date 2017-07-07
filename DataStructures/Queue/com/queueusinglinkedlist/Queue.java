package com.queueusinglinkedlist;

public class Queue {

	QueueNode front = null;
	QueueNode rear = null;
	int queuesize;
	
	
	public boolean isQueueEmpty(){
		
		if(front == null && rear == null){
			return true;
		}
		return false;
	}
	public void enqueue(int element){
		
		QueueNode temp = new QueueNode();
		temp.data = element;
		temp.next = null;
		
		if(isQueueEmpty()){
			
			front = rear = temp;
		}
		rear.next = temp;
		rear = temp;
		queuesize++;
	}
	
	public void dequeue(){
		
		
		if(isQueueEmpty()){
			
			System.out.println("the queue is empty can't perform dequeue operation");
		}
		else{
			front = front.next;
			queuesize--;
		}
	}
	
	public void printQueue(){
		
		QueueNode currentNode = front;
		
		while(currentNode != null){
			
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public int ElementAtFront(){
		if(isQueueEmpty()){
			System.out.println("the are no elements in the front of the queue");
		}
		return front.data;
	}
	
	public int ElemntAtRear(){
		if(isQueueEmpty()){
			System.out.println("the are no elements in the rear of the queue");
		}
		return rear.data;
	}

}
