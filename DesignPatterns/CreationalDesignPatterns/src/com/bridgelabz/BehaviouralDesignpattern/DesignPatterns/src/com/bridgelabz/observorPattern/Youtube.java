package com.bridgelabz.observorPattern;

public class Youtube {

	public static void main(String[] args) {
		Channel bridgelabz=new Channel();
		Subscriber sub1=new Subscriber("person1");
		Subscriber sub2=new Subscriber("person2");
		Subscriber sub3=new Subscriber("person3");
		Subscriber sub4=new Subscriber("person4");
		Subscriber sub5=new Subscriber("person5");
		Subscriber sub6=new Subscriber("person6");
		
		bridgelabz.subscribe(sub1);
		bridgelabz.subscribe(sub2);
		bridgelabz.subscribe(sub3);
		bridgelabz.subscribe(sub4);
		bridgelabz.subscribe(sub5);
		bridgelabz.subscribe(sub6);
		
		sub1.SubscribeChannel(bridgelabz);
		sub2.SubscribeChannel(bridgelabz);
		sub3.SubscribeChannel(bridgelabz);
		sub4.SubscribeChannel(bridgelabz);
		sub5.SubscribeChannel(bridgelabz);
		sub6.SubscribeChannel(bridgelabz);
		bridgelabz.upload("How to learn programming");
	}

}
