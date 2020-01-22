package com.bridgelabz.dataStructures;

import java.util.Scanner;

public class Banking {
	private static int balance=0;
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		QueueLogic queue=new QueueLogic();
		queue.enQueue(balance);
		do
		{
			System.out.println("Enter 1 to deposite");
			System.out.println("Enter 2 to withdraw");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
					int bal1=deposite();
					queue.enQueue(bal1);
					queue.deQueue();
					break;
			case 2:
					int bal2=withdraw();
					queue.enQueue(bal2);
					queue.deQueue();
					break;
		
			
			}
		}while(balance>0);
		
	}

	private static int deposite() {
		System.out.println("Enter the amount you want to deposited");
		int depositAmount=scan.nextInt();
		if(depositAmount%100==0)
		{
			balance=balance+depositAmount;
			System.out.println("Balance deposited is="+balance);
		}
		else
		{
			System.out.println("deposit amount should be multiples of 100");
		}
		return balance;
	}
	private static int withdraw() {
		System.out.println("Enter the amount to be withdrawl");
		int withdrawAmount=scan.nextInt();
		if(balance>withdrawAmount)
		{
			balance=withdrawAmount;
			System.out.println("balance amount="+balance);
		}
		else
		{
			System.out.println("Sorry amount is lessthan balance");
			withdraw();
			System.exit(0);
		}
		
		return balance;
	}

}
