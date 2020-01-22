package com.bridgelabz.dataStructures;

public class OrderedLinkedList {
	Node start;
	public void additem(int ele) {
		Node head=start;
		Node temp=new Node();
		temp.ele=ele;
		temp.next=null;
		if(start==null)
		{
			start=temp;
		}
		else
		{
			while(head.next!=null)
			{
				head=head.next;
			}
			head.next=temp;
		}
	}
	public void display() {
		
		Node temp=start;
		while(temp!=null)
		{
			System.out.print(temp.ele+"----->");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	
	

}
