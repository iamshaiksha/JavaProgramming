package com.bridgelabz.singleton;
/** LazyInitialization design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class LazyInitialization {
private static LazyInitialization instance;
private LazyInitialization()
{
	
}
public static LazyInitialization getInstance()
{
	
	if(instance==null)
	{
		instance=new LazyInitialization();
	}
	return instance;
	}
}

