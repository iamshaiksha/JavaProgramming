package com.bridgelabz.dataStructures;

public class QueueLogic {
	int queue[]=new int[1000];
	int front;
	int size;
	int rear;
	public void enQueue(int balance) {
	queue[rear++]=balance;
	size++;
	}
	public void deQueue() {
		int data=queue[front];
		front=(front++)%5;
		size--;
		
	}
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.println(queue[(front+i)%5]+" ");
		}
		System.out.println();
		for(int n :queue) {
			if(n!=0)
			System.out.print(n+" ");
		}
		
		
		
		
		
	}
	

}
