package com.bridgelabz.mediatordesignPattern;

public class Mediator {
	public static void main(String args[])  
	{
		WhatsupRoom chat = new WhatupRoomImplementation();  

		User1 u1=new User1(chat);  
		u1.setname("person1");  
		u1.sendMsg("Hi Ashwani! how are you?");  


		User2 u2=new User2(chat);  
		u2.setname("person2");  
		u2.sendMsg("I am Fine ! You tell?");
	}
}
