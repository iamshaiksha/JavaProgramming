package com.Bridgelabz.logicalPrograms;
/**Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. 
    Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
 *  @Shaik Shaiksha vali
 *  1.0v
 *  9/01/2020
 */


public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stacks=Integer.parseInt(args[0]);
		int trails=Integer.parseInt(args[1]);
		int goals=Integer.parseInt(args[2]);
		 int bets=0;
		 int wins=0;
		 for(int i=0;i<=stacks;i++)
		 {
			 int cash=stacks;
			 while(cash>0&&cash<goals)
			 {
				 bets++;
				 if(Math.random()<0.5)
				 {
					 cash++;
				 }
				 else
				 {
					 cash--;
				 }
				 if(cash==goals)
					 wins++;
			 }
		 }
		 System.out.println(wins+"  "+"wins of"+"  "+trails);
		 System.out.println("bets are"+" "+bets);
		 System.out.println("percentage of matches won="+100*wins/trails);
		 System.out.println("Avg  bets="+" "+1.0*bets/trails);

	}

}
