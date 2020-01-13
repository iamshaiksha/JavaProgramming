package com.Bridgelabz.algorithm;

import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		
	System.out.println("Enter String1");
	String string1=Utility.getString();
	System.out.println("Enter string2");
	String string2=Utility.getString();
	StringBuffer sb1=new StringBuffer(""+string1);
	StringBuffer sb2=new StringBuffer(""+string2);
	if(sb1.length()==sb2.length())
	{
		char a[]=sb1.toString().toLowerCase().toCharArray();
		char b[]=sb2.toString().toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		string1=new String(a);
		string2=new String(b);
		
	}
	else
	{
		System.out.println("It is not a anagram");
	}
	if(string1.equals(string2))
	{
		System.out.println("Yes,it is a anagram");
	}
	else
	{
		System.out.println("It is not a anagram");
	}
	

	}

}
