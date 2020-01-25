package com.bridgelabz.jsonPrograms;

import java.util.Random;

public class DeckOfCards {
	static int cards[][]=new int[4][13];
	public static void main(String[] args) {
	for(int playNumber=1;playNumber<=4;playNumber++)
	{
		DeckOfCards.allotCard(playNumber);
		System.out.println("Player"+playNumber+"'s cards");
		DeckOfCards.print(playNumber);
	}
				
	}
	
	private static void allotCard(int playNumber) {
		for(int i=0;i<9;i++)
		{
			allotOneCard(playNumber);
		}
	}
	private static void allotOneCard(int playNumber) {
		Random random=new Random();
		int suit=random.nextInt(4);
		int rank=random.nextInt(13);
		if(cards[suit][rank]!=0)
		{
			allotOneCard(playNumber);
		}
		else
		{
			cards[suit][rank]=playNumber;
		}
	}
	private static void print(int playNumber) {
		for(int suit=0;suit<4;suit++)
		{
			for(int rank=0;rank<13;rank++)
			{
				if(cards[suit][rank]==playNumber)
				{
					System.out.print(getSuit(suit)+" "+getRank(rank)+"\t");
				}
			}
		}
		System.out.println();
	}

	private static String getRank(int rank) {
		switch(rank)
		{
		case 0:
			return "2";
		case 1:
			return "3";
		case 2:
			return "4";
		case 3:
			return "5";
		case 4:
			return "6";
		case 5:
			return "7";
		case 6:
			return "8";
		case 7:
			return "9";
		case 8:
			return "10";
				
		case 9:
			return "jack";
		case 10:
			return "king";
		case 11:
			return "queen";
		case 12:
			return "ace";
		case 13:
			return " ";
		}
		return "";
	}

	private static String getSuit(int suit) {
		switch(suit)
		{
		case 0:
			return "clubs";
		case 1:
			return "Daimonds";
		case 2:
			return "hearts";
		case 3:
			return "spades";
		}
		return "";
	}

}
