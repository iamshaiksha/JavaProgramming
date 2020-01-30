package com.bridgelabz.singleton;
/** SerializedSingleton design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	private static final long serilalVersionUID=-987654;
	private SerializedSingleton()
	{
System.out.println("constructor is being called");
	}
	
	private static class SingletonHelper
	{
		private static final SerializedSingleton instance=new SerializedSingleton();
	}
	public static SerializedSingleton getInstance()
	{
		return SingletonHelper.instance;
		
		
	}
}
