package com.queueusingarrays;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new Queue();
		
		System.out.println("is queue empty :  "+queue.isEmpty());
		
		queue.enqueue(1);
		queue.enqueue(10);
		queue.enqueue(107);
		queue.enqueue(1777);
		queue.enqueue(10977);
		
		System.out.println("is queue empty :  "+queue.isEmpty());
		
		System.out.println("the size of queue is :  "+queue.size);
		
		System.out.println("the elements in the queue are :");
		
		queue.printQueue();
		
		queue.dequeue();
		
		queue.dequeue();
		
		System.out.println("the queue after dequeuing is :");
		
		System.out.println("the size of queue is :  "+queue.size);
		
		System.out.println("the elements in the queue are :");
		
		queue.printQueue();
   
	}

}
