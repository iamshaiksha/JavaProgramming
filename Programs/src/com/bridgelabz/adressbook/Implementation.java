package com.bridgelabz.adressbook;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Implementation {
	Utility utility=new Utility();
	AcessFile file=new AcessFile();
	public 	void askUser() {
		System.out.println("Select an option..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");

		int ch = utility.inputInt();
		switch(ch) {
		//add the details of person
		case 1:
			addAPerson();
			System.out.println("\n");
			askUser();
			break;
			//enter first and last names of user to edit the details
		case 2:
			System.out.print("Enter first and last name of the person to edit the contact: ");
			commonPart(ch);
			System.out.println("\n");
			askUser();
			break;
			//delete the details of the person
		case 3:
			System.out.print("Enter first and last name of the person to delete the contact: ");
			commonPart(ch);
			System.out.println("\n");
			askUser();
			break;
			//searching of person
		case 4:
			System.out.print("Enter first and last name of the person to search: ");
			commonPart(ch);
			System.out.println("\n");
			askUser();
			break;
		default:
			break;
		}
	}

	//gets user's information
	@SuppressWarnings("static-access")
	public void addAPerson() {
		System.out.print("Enter first name:");
		String firstName = utility.getString();
		System.out.print("enter last name: ");
		String lastName = utility.getString();

		System.out.print("Enter complete address: ");
		String address = utility.getString();

		System.out.print("Enter city, state and zip: ");
		String city = utility.getString();
		String state = utility.getString();
		String zip = utility.getString();

		System.out.println("Enter phone number: ");
		String phoneNumber = utility.getString();

		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();

		file.writeBook(jsonObject);
	}


	// Edit a persons information 
	@SuppressWarnings({ "unchecked", "static-access" })
	public void edit(JSONObject jsonObject, JSONArray bookArray, int i) {
		System.out.println("What do you want to edit?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");

		int choice = utility.inputInt();
		switch (choice) {
		//edit address
		case 1:
			System.out.print("Enter address: ");
			utility.getString();

			String address = utility.getString();
			System.out.print("Enter city, state and zip: ");
			String city = utility.getString();
			String state = utility.getString();
			String zip = utility.getString();

			jsonObject.put("Address", address);
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("Zip", zip);
			break;
			//edit mobile number
		case 2:
			System.out.println("Enter phone number: ");
			String phoneNumber = utility.getString();
			jsonObject.put("Phone Number", phoneNumber);
			break;
		}

		bookArray.remove(i);
		bookArray.add(i, jsonObject);

		file.printWriter(bookArray);
		System.out.println(" updated successfully");
	}

	// Deletes a person's information 
	public void delete(JSONArray bookArray, int i) {
		bookArray.remove(i);

		file.printWriter(bookArray);
		System.out.println("Contact deleted successfully");
	}

	// Displays person's record 
	public void search(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("Zip"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}

	
	@SuppressWarnings("unchecked")
	// Reads json file and adds information to json array
	public void commonPart(int choice) {
		JSONParser parser = new JSONParser();
		String firstName = utility.getString();
		String lastName = utility.getString();
		JSONArray bookArray = null;

		try {
			bookArray = (JSONArray) parser.parse(new FileReader("addressbook.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		@SuppressWarnings("rawtypes")
		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean b = false;
		outer:
			while (iterator.hasNext()) {
				JSONObject jsonObject = (JSONObject) iterator.next();
				if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName)) {
					b = true;
					switch (choice) {
					case 2:
						edit(jsonObject, bookArray, i);
						break outer;
					case 3:
						delete(bookArray, i);
						break outer;
					case 4:
						search(jsonObject);
						break outer;
					}
				}
				i++;
			}
		if(!b) {
			System.out.println("\nSorry!!! Person not found...");
		}
	}
}