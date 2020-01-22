package com.bridgelabz.dataStructures;

import java.util.Arrays;

public class PrimeAnagram {
	public static void main(String[] args) {

	int start=0;
	int end=100;
	int [][]a=new int[10][];
	int j1=0,j2=0;
	for(int i=0;i<10;i++)
	{
		for(int j=start;j<=end;j++)
		{
			if(isprime(j))
			{
				for(int k=j+1;k<end;k++)
				{
					if(isprime(k))
					{
						if(isAnagram(String.valueOf(j),String.valueOf(k)))
						{
							j1=j1+2;
						}
					}
				}
			}
		}
		a[i]=new int[j1];
		start=end+1;
		end=end+100;
		j1=0;
	}
	start=0;
	end=100;
	j1=0;
	for(int i=0;i<10;i++)
	{
		for(int j=start;j<=end;j++)
		{
			if(isprime(j))
			{
				for(int k=j+1;k<=end;k++)
				{
					if(isprime(k))
					{
						if(isAnagram(String.valueOf(j),String.valueOf(k)))
						{
							a[i][j2]=j;
							a[i][j2+1]=k;
							j2=j2+2;
						}
					}
				}
			}
		}
		
		
		start=end+1;
		end=end+100;
		j2=0;
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]+"");
		}
		if(a[i].length!=0)
		{
			System.out.println();
		}
	}
	
}

	private static boolean isAnagram(String str1, String str2) {
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1,arr2))
					{
						return true;
					}
		}
		return false;
		
		
	}

	public static boolean isprime(int num) {

		if(num==0||num==1) {
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
