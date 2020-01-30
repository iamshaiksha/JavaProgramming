package com.bridgelabz.singleton;
/** BillPughSingleton design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class BillPughSingleton {
	private BillPughSingleton()
	{

	}
	private static class SingletonHelper
	{
		private static final BillPughSingleton instance=new BillPughSingleton();
	}
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.instance;
	}


}
