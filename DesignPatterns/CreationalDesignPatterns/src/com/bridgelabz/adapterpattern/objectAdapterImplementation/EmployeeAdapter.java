package com.bridgelabz.adapterpattern.objectAdapterImplementation;

import java.util.ArrayList;

/**
 * @author shaik shaiksha vali
 *
 */
public class EmployeeAdapter extends ThirdPartyBillingSystem implements ITarget {

	ThirdPartyBillingSystem thirdPartyBillingSystem=new ThirdPartyBillingSystem();
	
	
	
	@Override
	public void processCompanySalary(String[][] employeeInfo) {
		 String empID=null;
		 String name=null;
		 String designation=null;
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		for(int i=0;i<employeeInfo.length;i++)
		{
			for(int j=0;j<employeeInfo[i].length;j++)
			{
				if(j==0)
				{
					empID=employeeInfo[i][j];
				}
				else if(j==1)
				{
					name=employeeInfo[i][j];
				}
				else 
				{
					designation=employeeInfo[i][j];
				}
			}
			
			employeeList.add(new Employee(Integer.parseInt(empID),name,designation));
		}
		
		
		System.out.println("Adapter convert  array of employeeto ArrayList of employee:\n"+employeeList+"\n"+"then delegate to the thirdpartybillingSystem for proacessing the employee salary");
		thirdPartyBillingSystem.processSalary(employeeList);
	}
}
