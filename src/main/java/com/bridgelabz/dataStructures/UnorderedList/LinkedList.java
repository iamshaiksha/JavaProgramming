package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LinkedList {
	public static void main(String[] args) throws IOException
	{
		Scanner scan=new Scanner(System.in);
		UnorderedList list=new UnorderedList();
		BufferedReader br=new BufferedReader(new FileReader("/home/user/Desktop/Bridgelabz/src/sample.txt"));
		String line;
		while((line=br.readLine())!=null) {
			
			String[] data=line.split(" ");
			System.out.println(line);
			for(int i=0;i<data.length;i++)
			{
				list.add(data[i]);
			}
			
		}
		System.out.println("given data");
		list.display();
		System.out.println("Enter the word you want to search");
		String word=scan.next();
		boolean value=list.searchWord(word);
		if(value==false)
		{
			list.add(word);
		}
		System.out.println("data after deleting");
		String outData = list.display();
		fileOut(outData);
		
		scan.close();
		
		
	}

	private static void fileOut(String outData) throws IOException {

		String path="/home/user/Desktop/Bridgelabz/sampleoutput.txt";
		File file=new File(path);
		FileWriter fw=null;
		
		fw=new FileWriter(file);
		fw.write(outData+" ");
		
		
		
	}
}

