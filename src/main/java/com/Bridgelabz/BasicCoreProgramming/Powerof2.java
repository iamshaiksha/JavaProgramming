package com.Bridgelabz.BasicCoreProgramming;
/** power of 2
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	7/01/2020
 */
import com.Bridgelabz.utility.Utility;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		int n=Utility.inputInt();
		Power(n);
		

	}

	private static void Power(int n) {
		// TODO Auto-generated method stub
		if(n<=31&&n>0)
		{
			for(int i=1;i<=n;i++)
			{
			
				System.out.println("2^"+i+" = "+(int)Math.pow(2,i));
			
			}
		}
		else
		{
			System.out.println("integer over flow");
		}
		
	}

}
