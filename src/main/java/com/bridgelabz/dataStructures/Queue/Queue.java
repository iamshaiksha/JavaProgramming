package com.bridgelabz.dataStructures.Balencedparenthesis;

public class Queue {
	int q[]=new int[10];
	int rear;
	int front;
	int size;

	public int enQueue(int i) {
		q[rear]=i;
		rear++;
		size++;
		return i;
	}
public int deQueue() {
		
		int data=q[front];
		front--;
		size--;
		return data;
		
	}
	
	public void show() {
		for(int i=0;i<size;i++)
		{
			System.out.print(q[front+i]+" "+":element");
		}
	}

	
	
	
}
