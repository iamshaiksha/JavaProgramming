/**
 * 
 */
package com.bridgelabz.observorPattern;

/**
 * @author shaik shaiksha vali
 *
 */
public interface Subject {
	public void subscribe(Subscriber sub);
	public void unSubscribe(Subscriber sub);
	public void subscribenotify();
	public void upload(String title);
}
