package com.bridgelabz.dataStructures;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String string="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)()";
		StackLogic stack = new StackLogic(10);
		for (int i = 0; i < string.length(); i++)
		{    
		char ch = string.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() );
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
