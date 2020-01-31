package com.bridgelabz.adapterpattern.objectAdapterImplementation;

public class HumanResourceSystem {
	
	
	public static String[][] getEmployees()
	{
	String[][] employees=new String[4][];
	employees[0]=new String[]{"101","Shaiksha","Teamleader"};
	employees[1]=new String[]{"102","rahiman","Tester"};
	employees[2]=new String[]{"103","jayasree","Developer"};
	employees[3]=new String[]{"103","shamsheer","Developer"};
	return employees;
	}
	public static void main(String[] args) {
	ITarget target=new EmployeeAdapter();
		System.out.println("HR system passes employee String into adapter");
		target.processCompanySalary(getEmployees());
		
	}

}
