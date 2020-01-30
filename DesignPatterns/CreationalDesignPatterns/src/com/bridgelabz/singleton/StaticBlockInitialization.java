package com.bridgelabz.singleton;
/** StaticBlockInitialization design pattern 
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;
	private StaticBlockInitialization()
	{

	}
	static {
		try
		{
			instance=new StaticBlockInitialization();
		}
		catch(RuntimeException e) {e.printStackTrace();}
	}
	public static StaticBlockInitialization getInstance()
	{

		return instance;
	}
}
