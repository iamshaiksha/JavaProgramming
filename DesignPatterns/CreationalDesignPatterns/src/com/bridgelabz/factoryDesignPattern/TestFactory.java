package com.bridgelabz.factoryDesignPattern;
/**Factory design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class TestFactory {

	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer("pc", "2 GB" , "500" , "2.4GHz");	
		Computer server=ComputerFactory.getComputer("Server" , "3 GB" , "intel", "8 Ghz");
		System.out.println("factory of pc config:"+pc);
		System.out.println("factory of server config"+server);
	}

}
