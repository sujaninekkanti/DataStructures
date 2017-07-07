package com.queueusinglinkedlist;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new Queue();
		
		System.out.println("is the queue empty :"+queue.isQueueEmpty());
		
		queue.enqueue(25);
		queue.enqueue(2577);
		queue.enqueue(2579);
		queue.enqueue(3344);
		queue.enqueue(567);
		
		System.out.println("is the queue empty :"+queue.isQueueEmpty());
		
		System.out.println("the size of the queue is : " +queue.queuesize);
		
		System.out.println("the elements in the queue are:");
		
		queue.printQueue();
		
		queue.dequeue();
		
		System.out.println("the queue after dequeuing the elements in the queue are :");
		
        System.out.println("is the queue empty :"+queue.isQueueEmpty());
		
		System.out.println("the size of the queue is : " +queue.queuesize);
		
		System.out.println("the elements in the queue are:");
		
		queue.printQueue();
		
		System.out.println("the element at front of the queue is :"+queue.ElementAtFront());
		
		System.out.println("the element at front of the queue is :"+queue.ElemntAtRear());
	}

}
