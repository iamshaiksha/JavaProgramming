package com.Bridgelabz.BasicCoreProgramming;
/** prime facorization
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */
import com.Bridgelabz.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		int n=Utility.inputInt();
		PrimeFactoriztion(n);

	}

	private static void PrimeFactoriztion(int n) {
		// TODO Auto-generated method stub
		
		
		
			for(int i=2;i<=n/i;i++)
		{
			System.out.println("i ="+i+" "+"number ="+n);
			while(n%i==0)
			{
				n=n/i;
				System.out.println("Factor: "+i);
				
			}
			
		}
		if(n>1)
		{
			System.out.println("Factor="+n);
		}
		System.out.println();
		
	}

}
