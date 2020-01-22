package com.bridgelabz.dataStructures.Balencedparenthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Bridgelabz.utility.Utility;

public class Prime {

	public static void main(String[] args)  {
		Utility primeUtility=new Utility();
		int start=0;
		int end=100;
		int prime[][]=new int[10][];
		int j1=0;
		int j2=0;
		for (int i = 0; i < prime.length; i++) {
			for(int j=start;j<=end;j++)
			{
				if(utility.isprime(j))
				{
					j1++;
				}
			}
			prime[i]=new int[j1];
	          start = end + 1;
	            end =end+ 100;
	            j1 = 0;
		}
		start=0;
		end=100;
		for(int i=0;i<10;i++)
		{
			for (int j = start; j < end; j++) {
				if(utility.isprime(j))
				{
					prime[i][j2]=j;
					j2++;
				}
			}
			   start = end + 1;
	            end =end+ 100;
			j2=0;
		}
		//printing array
		  for (int i = 0; i < prime.length; i++) {
	            for (int j = 0; j < prime[i].length; j++)
	                System.out.print(prime[i][j] + " ");
	            System.out.println();
	        }

	    }
		
		
		
		
	}


