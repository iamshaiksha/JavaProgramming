package com.Bridgelabz.BasicCoreProgramming;
/*  replace string
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */

import com.Bridgelabz.utility.Utility;

public class ReplaceString {

	static String UserName="";
	static String input="Hello username,how are you?";
	public static void main(String[] args) {
		System.out.println("Enter user name");
		UserName=Utility.getString();
		if(checkLength(UserName))
		{
			StringReplace(UserName);
		}
				
		
	}
	private static void StringReplace(String userName2) {
		// TODO Auto-generated method stub
		System.out.println(input.replaceAll("username",UserName));
		
	}
	private static boolean checkLength(String userName) {
		// TODO Auto-generated method stub
		if(userName.length()<3)
		{
			System.out.println("username length should be greater than 3 characters");
			return false;
		}
		else{
		return true;
		
	}

	}

}