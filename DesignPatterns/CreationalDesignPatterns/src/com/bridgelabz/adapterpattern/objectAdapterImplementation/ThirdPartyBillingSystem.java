package com.bridgelabz.adapterpattern.objectAdapterImplementation;

import java.util.ArrayList;

public class ThirdPartyBillingSystem {
public void processSalary(ArrayList<Employee> employeeList)
{
	for(Employee employee:employeeList)
	{
		//System.out.println(employee.toString());
		if(employee.getDesignation().equalsIgnoreCase("Teamleader"))
		{
			System.out.println("70000Rs salary credited to "+employee.getName()+" "+"Account\n");
		}
		else if(employee.getDesignation().equalsIgnoreCase("developer"))
		{
			System.out.println("70000Rs salary credited to "+employee.getName()+" "+"Account\n");
		}
		else if(employee.getDesignation().equalsIgnoreCase("destination"))
		{
			System.out.println("70000Rs salary credited to "+employee.getName()+" "+"Account\n");
		}
	}
}
	
	
	
}
