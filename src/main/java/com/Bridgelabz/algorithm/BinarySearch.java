
package com.Bridgelabz.algorithm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import com.Bridgelabz.utility.Utility;
public class BinarySearch {
	public static void main(String[] args) throws Exception
	{
		//BufferedReader r=new BufferedReader(new FileReader("D:\\filesd.txt"));
		System.out.println("Enter size of an array");
		int n=Utility.inputInt();
		String b[]=Utility.input1DstringArray(n);
		Arrays.sort(b);
		System.out.println("Enter a word");
		String word=Utility.getString();
		int position=Utility.binarysearch(word,b);
		if(position==-1)
		{
			System.out.println("position not found");
		}
		else
		{
			System.out.println("found at"+position+"position");
		}
		
	}
}












/*********************************************************************************************************************************************
 * package com.Bridgelabz.algorithm;


import java.io.BufferedReader;
import java.io.FileReader;

import com.Bridgelabz.utility.Utility;

public class BinarySearch {
	public static void main(String[] args) throws Exception
	{

		BufferedReader r=new BufferedReader(new FileReader("D:\\filesd.txt"));//shaiksha welcome to file
		String line;														 //how are you shaiksha
		System.out.println("Enter a word you want to search");				 //what r u doing shaiksha
		String word=Utility.getString();
		int count=0;
		while((line=r.readLine())!=null)
		{
			System.out.println(line);
			String spliting[]=line.split(" ");
			for(int i=0;i<spliting.length;i++)
			{

				if(spliting[i].contains(word))
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println("Words found are"+count);
			}

		}
		r.close();
	}

}****************************************************************************************************************************************/