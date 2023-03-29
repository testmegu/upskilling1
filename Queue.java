package com.cg.List;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		// Queue: (Front)10 9 8 7 6 5 4 3 2 1(rear)
		//PriorityQueue sorts the data for us
		// Queue: (Front)1 2 3 4 5 6 7 8 9 10(Rear) -> in this manner the queue will be sorted
		
		System.out.println("Queue size is:" +queue.size());
		System.out.println("Head of Queue is:" +queue.peek());// head of the queue is 1
		
		// peeking - obtaining the head of queue
		//polling - remove the head of queue
		
		queue.poll();//removing the head 1
		System.out.println("Queue size after poll is:" +queue.size());
		
		System.out.println("Head of Queue:" +queue.peek()); // new head of the queue :2

	}

}
