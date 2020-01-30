package com.bridgelabz.singleton;
/** ThreadSafeSingleton design pattern 
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton()
	{
	}
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(instance==null)
		{
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
	{
		if(instance==null)
		{
			synchronized (ThreadSafeSingleton.class) {
				if(instance==null)
				{
					instance=new ThreadSafeSingleton();
				}

			}
		}
		return instance;

	}
}
