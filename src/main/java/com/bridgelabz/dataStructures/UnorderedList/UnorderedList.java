package com.bridgelabz.dataStructures;


public class UnorderedList {

	Node head;
	
	public void add(String data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			
		}
	}
	public String display()
	{
		Node node=head;
		String data="";
		while(node.next!=null)
		{
			System.out.println(node.data);
			data=data+node.data;
			node=node.next;
		}
		System.out.println(node.data);
		return data;
			
		}
	public boolean searchWord(String word) {
		
		Node node=head;
		int index=0;
		while(node.next!=null)
		{
			
			if(node.data.equalsIgnoreCase(word))
			{
				removeAt(index);
				return true;
			}
			index++;
			node=node.next;
		}
		System.out.println(node.data);
		if (node.data.equalsIgnoreCase(word)) {
			removeAt(index);
			return true;
		} 
		return false;
		
		
		
		
	}
	private void removeAt(int index) {
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("deleted"+n1.data);
			n1=null;
		}
		
	}
	

}