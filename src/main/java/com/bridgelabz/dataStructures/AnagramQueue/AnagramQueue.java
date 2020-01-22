package com.bridgelabz.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Bridgelabz.utility.Utility;

public class AnagramQueue {

	public static void main(String[] args) {
		QueueLogic queue=new QueueLogic();
		Utility utility=new Utility();
		int a[]=new int[1000];
		int l=0;
		int n = 1000;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i<n; i++){

			list.add(i);
		}
		System.out.println(list);
		for (int i = 0; i<list.size()-1; i++){
            if (!isPrime(list.get(i))){
                list.remove(list.get(i));
                i--;
            }
        }
		System.out.println(list);
		for(Object ele:list)
		{	
			a[l]=(int)ele;
			l++;

		}
		System.out.println("the prime numbers are:");
		for (int prime : a) {
			if (prime != 0)
				System.out.print(" " + prime);
		}
		System.out.println(" ");
		System.out.println("The anagrams are");
		for(int k=0;k<l;k++)
		{
			for(int m=k+1;m<l;m++)
			{
				char x[]=((""+a[k]).toCharArray());
				char y[]=((""+a[m]).toCharArray());
				if(utility.areAnagram(x,y)==true)
				{
					System.out.println(""+a[k]+"----"+a[m]+"");
					queue.enQueue(a[k]);
					queue.enQueue(a[m]);
				}
			}
		}
		queue.show();
		System.out.println();
	}

	private static boolean isPrime(Integer t) {
		 boolean itIs = true;
	        for (int i = 2; i < t; i++){
	            if(t%i == 0){
	                itIs = false;  
	            }
	        }
	        return itIs;
		
		
		
		
	}



}
