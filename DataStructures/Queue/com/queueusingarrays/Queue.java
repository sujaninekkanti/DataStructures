package com.queueusingarrays;

public class Queue {

	int Queue[] = new int[100];
	int front = -1;
	int rear = -1;
    int size;
	
	public boolean isEmpty(){
		
		if(front == -1 && rear == -1){
			return true;
		}
		return false;
	}
	
	public void enqueue(int element){
		
		/*if(!isEmpty()){
			System.out.println("the queue is full");
		}*/
		 if(isEmpty()){
			front = 0;
			rear = 0;
		}
		else{
			rear = rear+1;
		}
		Queue[rear] = element;
		size++;
	}
	
	public void dequeue(){
		
		if(isEmpty()){
			System.out.println("the queue is empty with no elements to dequeue");
		}
		else if(front == rear){
			front = -1;
			rear = -1;
		}
		else{
			
			front = front+1;
			size--;
		}
		
	}
	public void printQueue(){
		
		for(int i=front;i<=rear;i++){
			
			System.out.println(Queue[i]);
		}
	}
	
}
