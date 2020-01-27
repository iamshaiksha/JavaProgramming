package com.bridgelabz.stock;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.ClinicManagementProject.Utility;

public class Controller {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Factory service=new Factory();;
		Service inventory=service.factoryMethod();
		int count=0;
		do {
			System.out.println("1.To creat JsonFile");
			System.out.println("2.AddShares to Product");
			System.out.println("3.DisplayShares of Company");
			System.out.println("4.Adding the companys into the stock Market");
			System.out.println("5.Calculate the shares of company");
			System.out.println("6.Remove sharesHolder From comapny");
			System.out.println("7.To Know the companies in stock Market");
			int choice=Utility.inputInt();
			JSONObject obj;
			JSONArray array=new JSONArray();
			try {
				switch(choice)
				{
			case 1: 
			    obj=inventory.createJsonFile();
			    array.add(obj);
				FileAcess.writeIntoFile(array);
				count++;
				break;
			case 2:
				inventory.addShares();
				count++;
				break;
			case 3:
				inventory.displayItems();
				count++;
				break;
			case 4:
				inventory.addProducts();
				count++;
				break;
			case 5:
				inventory.calculate();
				count++;
				break;
			case 6:
				inventory.removeItem();
			    count++;
			    break;
			case 7:
				inventory.companies();
				break;
			
			default:
				throw new Invalidchoice();
			}
			System.out.println();
			System.out.println("1--> continue"+"\t"+"0-->Exit");
			int choice1 = Utility.inputInt();
			switch (choice1) {
			case 1:
				continue;

			case 0:
				System.exit(0);
				break;
		    default:throw new Invalidchoice();
			}
		} catch (Exception e) {
			
			System.out.println("Not aProper Input");
		}
	} while (count >= 1);
}
}