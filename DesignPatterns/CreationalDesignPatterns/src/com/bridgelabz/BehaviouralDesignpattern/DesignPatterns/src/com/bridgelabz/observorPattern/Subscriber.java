/**
 * 
 */
package com.bridgelabz.observorPattern;

/**
 * @author shaik shaiksha vali
 *
 */
public class Subscriber {
	String name;
	Channel channel=new Channel();
	public Subscriber(String name) {
		super();
		this.name = name;
	}
public void update()
{
	System.out.println("Hey...!"+"  "+name+" "+"video uploaded"+" "+channel.title);
}
public void SubscribeChannel(Channel ch)
{
channel=ch; 	
}


}
