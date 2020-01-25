package com.bridgelabz.jsonPrograms;


public class Player {
	Queue<Card> cardQueue;
	int[][] playerCards;
	public Player()
	{
		cardQueue=new Queue<Card>();
		playerCards=new int[4][13];
	}
	public void addCard(int suit,int rank)
	{
		playerCards[suit][rank]=1;
	}
	public Card getCard() {
		return cardQueue.dequeue();
	}
	//enqueue cards in ascending order.
	public void enqueueCards()
	{
		for(int suit=0;suit<4;suit++)
		{
			for(int rank=0;rank<13;rank++)
			{
				if(playerCards[suit][rank]==1)
				{
					cardQueue.enqueue(new Card(suit,rank));
				}
			}
		}
	}

}
