package com.bridgelabz.stockProgram;

import com.bridgelabz.ClinicManagementProject.Utility;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StockImplementation s=new StockImplementation();	
		Utility utility=new Utility();
		boolean traverse=true;
				System.out.println("1.view particular company value ");
				System.out.println( "2.value of total companies ");
				System.out.println( "3.buy company share");
				System.out.println( "4.sell company share ");
				System.out.println( "5.add company ");
				System.out.println( "6.delete companny");
				System.out.println( "7.print report");
				System.out.println( "t 8.exit");
		while(traverse==true)
		{
			System.out.println("Enter choice");
			int choice=Utility.inputInt();
			System.out.println("***--------------***");
			switch(choice)
			{
			case 1:System.out.println("enter company name ");
			String particularstock=utility.getString();
			double singleval=s.eachstockval(particularstock);
			System.out.println("share value of "+particularstock+" in $:"+singleval/70);
			break;
			case 2:double totalval=s.allstockval();
			System.out.println("value of total companies in $:"+totalval/70);
			break;
			case 3:System.out.println("enter company name to buy shares");
			String symbols=utility.getString();
			System.out.println("enter no.of shares u want to buy");
			int amount=utility.inputInt();
			s.buy(amount, symbols);
			break;
			case 4:System.out.println("enter companyname to sell shares");
			String symbol=utility.getString();
			System.out.println("enter how many shares u want to sell");
			int sells=utility.inputInt();
			s.sell(sells, symbol);
			break;
			case 5:s.addcompany();
			System.out.println("successfully added");
			break;
			case 6:System.out.println("enter company name to delete");	
			s.deletecompany(utility.getString());
			System.out.println("successfully deleted");
			break;
			case 7:s.printreport();
			break;
			case 8:System.out.println("gud buy");
			traverse=false;
			break;
			default :System.out.println("enter correct choice");
			break;
			}
		}
//		System.out.println("stored in linked list");
//		LinkedList l=s.linkedlist();
//		l.show();
//		System.out.println("symbol status with stack");
//		l=s.linkedliststack(l);
//		l.show();
	}
}


