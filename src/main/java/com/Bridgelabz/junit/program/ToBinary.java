package com.Bridgelabz.junit.program;

import com.Bridgelabz.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {
		
		System.out.println("Enter decimal number");
		int n=Utility.inputInt();
		binary(n);	
	}

	public static int binary(int n) {
		int binary[]=new int[100];
		int i=0;
		while(n>0)
		{
			binary[i]=(int)n%2;
			n=n/2;
			i++;
			for(int j=i;j>0;j--)
			{
				System.out.println(binary[j]);
			}
			
		}
		return i;
	}

}
