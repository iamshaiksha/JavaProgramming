package com.Bridgelabz.BasicCoreProgramming;
import com.Bridgelabz.utility.Utility;
/** Flip Coin and print percentage of Heads and Tails
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */


public class Flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of times to Flip Coin.");
		int heads=0;
		int tails=0;
		int counts=1;
		int n=Utility.inputInt();
		while(counts<=n)
		{
			System.out.println("counts="+counts+" "+"flips="+n);
			if(Math.random()<0.5)
			{
				heads++;
			}
			else
			{
				tails++;
			}
			counts++;
		}
		System.out.println(heads);
		System.out.println(tails);
	System.out.println( "headsPercentage="+(heads*100/10));
	System.out.println("tailsPercentage="+(tails*100/10));
	}

}
