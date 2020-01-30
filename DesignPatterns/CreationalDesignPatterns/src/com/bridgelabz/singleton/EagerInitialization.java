package com.bridgelabz.singleton;
/** EagerInitialization design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class EagerInitialization {
	private static EagerInitialization instance=new EagerInitialization();
	private EagerInitialization()
	{
		
	}
	public static EagerInitialization getInstance()
	{
		return instance;
		
	}
}
