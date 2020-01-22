package com.bridgelabz.dataStructures;


public class Stack {

	int top;
	static final int max=1000;
	int  a[]=new int[1000];

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(123);
		s.push(34);
		s.push(12);
		System.out.println(s.pop(12));


	}

	boolean isEmpty()
	{
		return (top<0);
		
	}
	Stack()
	{
		top=-1;
	}
	boolean pop(int x) {

		if(top<0)
		{
			System.out.println("Stack underflow");
			return false;
		}
		else
		{
			a[top--]=x;
			return true;
		}


	}

	boolean  push(int item) {
		if(top>max-1)
		{
			System.out.println("stack is overflowflow");
			return false;
		}
		else
		{
			a[++top]=item;
			System.out.println(item+"pushed into stack");
			return true;
		}
	}
	int peak()
	{
		if(top<0)
		{
			return 0;
		}
		else
		{
			int x=a[top];
			return x;
		}
	}

}
