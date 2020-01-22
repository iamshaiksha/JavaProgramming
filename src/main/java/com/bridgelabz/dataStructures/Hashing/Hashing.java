package com.bridgelabz.dataStructures;

public class Hashing {

	public Hashing()
	{
	  	OrderedLinkedList[] order=new OrderedLinkedList[11];
		int a[]= {77,44,55,0,0,26,93,17,31,20,54};
		for(int i=0;i<a.length;i++)
		{
			int rem=a[i]%11;
			if(order[rem]==null)
			{
				order[rem]=new OrderedLinkedList();
				order[rem].additem(a[i]);
			}
			else
			{
				order[rem].additem(a[i]);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+i+"--->");
			if(order[i]!=null)
			{
				order[i].display();
			}
			else
			{
				System.out.println(order[i]+"--->"+"null");
			}
		}
	}
	public static void main(String[] args) {
		Hashing hs=new Hashing();
		
		
	}

}
