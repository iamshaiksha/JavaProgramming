package com.bridgelabz.dataStructures;

import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Deque<Character> dq=new LinkedList<>();
		System.out.println("enter a string");
		String str=scan.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			dq.addFirst(str.charAt(i));
		}
		String deq="";
		for(Character data:dq)
		{
			deq=deq+data;
			
		}
		System.out.println(deq);
		String rev="";
		while(!dq.isEmpty())
		{
			rev=rev+dq.removeLast();
		}
		System.out.println(rev);
		if(deq.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
