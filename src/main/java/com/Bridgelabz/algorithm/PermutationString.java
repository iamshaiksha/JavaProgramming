package com.Bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class PermutationString {

	static ArrayList result=new ArrayList();
	public static void main(String[] args) {
		System.out.println("Enter a string");
		stringPermutation("",Utility.getString());
		System.out.println(Arrays.toString(result.toArray()));
		
		
	}
	private static ArrayList<String> stringPermutation(String f, String u) {

		
			for(int i=0;i<u.length();i++)
			{
				String fixed=f+u.charAt(i);
				String unfixed=u.substring(0,i)+u.substring(i+1);
				stringPermutation( fixed,  unfixed);
				
			}
			if(u.length()==0)
			{
				result.add(f);
				
			}
			return result;
			
	}

}
