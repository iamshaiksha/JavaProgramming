package com.bridgelabz.jsonPrograms;
import java.util.LinkedList;
	public class Queue<T> {
	    LinkedList<T> linkedList;
		public Queue()
		{
			linkedList=new LinkedList<T>();
		}
		//adds the element at end of list.
		public  void enqueue(T data)
		{
			linkedList.add(data);
		}
		//removes the element from list.
		public  T dequeue()
		{
			return linkedList.pop();
		}
		//return true if the list is empty else false.
		public boolean isEmpty()
		{
			return linkedList.isEmpty();
		}
		//return the size.
		public int size()
		{
			return linkedList.size();
		}
		


	}