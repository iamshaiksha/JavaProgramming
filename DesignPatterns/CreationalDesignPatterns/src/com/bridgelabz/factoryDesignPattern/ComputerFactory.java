package com.bridgelabz.factoryDesignPattern;
/**Factory design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class ComputerFactory {
		
	public static Computer getComputer(String type,String ram,String cpu,String hdd )
	{
		if("PC".equalsIgnoreCase(type))
		{
			return new PC(ram,hdd,cpu);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(ram,hdd,cpu);
		}
		return null;
		
		
	}
}
