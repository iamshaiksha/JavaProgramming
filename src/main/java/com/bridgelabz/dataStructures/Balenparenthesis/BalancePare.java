package com.bridgelabz.dataStructures;
/*
 *Created by:Shaiksha
 *Date: 20/01/2020
 *Purpose:read an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)
 *Ensure parentheses must appear in a balanced or not.
 **/

import java.io.FileNotFoundException;

import com.Bridgelabz.utility.Utility;

public class BalancePare
{	
	public static void main(String[] args) throws FileNotFoundException {
	Utility utility=new Utility();
	System.out.println("Enter max size: ");
	int n=utility.inputInt();


	/* Creating Stack */
	StackLogic stack = new StackLogic(n);
	System.out.println();
	System.out.println("Parenthesis Matching");
	System.out.println();


	/* Accepting expression */
	System.out.println("Enter expression: ");
	String exp = utility.getString();        
	int len = exp.length();
	System.out.println("Matches and Mismatches: ");

	for (int i = 0; i < len; i++)
	{    
		char ch = exp.charAt(i);

		if (ch == '(')
		{
			stack.push(i);
		}
		else if (ch == ')')
		{
			try
			{
				long p = (stack.pop() + 1);
				System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
			}
			catch(Exception e)
			{
				System.out.println("')' at index "+(i+1)+" is unmatched");
			}
		}            
	}
	while (!stack.isEmpty() )
	{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
	}                          
}
}

