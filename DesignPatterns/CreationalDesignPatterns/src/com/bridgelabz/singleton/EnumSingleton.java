package com.bridgelabz.singleton;
/** EnumSingleton design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public enum EnumSingleton {
APPLE;
	int value;
	
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
	
}
