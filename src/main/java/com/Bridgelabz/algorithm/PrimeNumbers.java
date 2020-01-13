package com.Bridgelabz.algorithm;

import com.Bridgelabz.utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a starting number");
		int start=Utility.inputInt();
		System.out.println("Enter a ending number");
		int end=Utility.inputInt();
		PrimeNum(start,end);
	}

	private static void PrimeNum(int start, int end) {
		
		for(int i=start;i<=end;i++)
		{	int c=1;
			for(int j=start;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
				
			}
			
		}
	
		
	
	}
	
	

}
