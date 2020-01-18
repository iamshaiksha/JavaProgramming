package com.bridgelabz.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	private static char item;
	private static char a[];
	private static int top=-1;

	public static void main(String[] args) {

		
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println(" enter the size");
	int n=scan.nextInt();
	System.out.println("Enter a simple parenthesis");
	char a[]=new char[n];
	String inp=scan.next();
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=inp.charAt(i);
	}
	for (int  i= 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	int i=0;
	
	while(a[i]==0)
	{
		item=a[i];
		if(item=='(')
		{
			push(item);
		}
		else
		{
			pop();
		}
		++i;
	}
		
		
		
	if(top==-1)
	{
		System.out.println("Balanced");
	}else
	{
		System.out.println("not balanced");
	}

		
		
		
		
	}

	  static char pop() {
		 
	return a[top--];	 
		
	}

	static void push(char item2) {
		a[++top]=item;
	}
		
	

	
}
