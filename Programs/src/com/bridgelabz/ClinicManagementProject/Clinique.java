package com.bridgelabz.ClinicManagementProject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Clinique {

	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException {
		Utility utility=new Utility();
		Find f=new Find();
		Doctor d=new Doctor();
		Patients p=new Patients();
		ArrayList<Doctor> ald=new ArrayList<Doctor>();
		ArrayList<Patients> alp=new ArrayList<Patients>();
		HashMap<Appointment,Integer> appoint=new HashMap<Appointment,Integer>();
		int c=0;
		do {
			
			System.out.println("------clinic management system------");
			System.out.println();
			System.out.println("1.Add doctor");
			System.out.println("2.Add patients");
			System.out.println("3.print Docters");
			System.out.println("4.print patients");
			System.out.println("5.take appointments");
			System.out.println("6.print appointments");
			System.out.println("7.search doctor by name,Id,Specializtion,availability");
			System.out.println("8.serach patients by name,id,mobilenumber");
			System.out.println("9.exit");
			System.out.println();
			System.out.println("Please Enter your choice");
			int choice=utility.inputInt();
			switch(choice)
			{
				case 1:
						System.out.println("Add doctor");
						d.addDoctor();
						ald.add(d);
						d.addDoctor();
						ald.add(d);
						break;
				case 2:
					    System.out.println("Add patient");
					    p.addPatient();
					    alp.add(p);
					    break;
				case 3:
						System.out.println("All the doctor details");
						
						System.out.println(ald.toString());
					    break;
				case 4:
					   System.out.println("All the patient details");
					   
						System.out.println(alp.toString());
					    break;
				case 5:
					System.out.println("Take an appointment ");
				
					System.out.println("Enter doctor id");
					
					int did=utility.inputInt();
					ArrayList<Doctor>doc=f.findById(ald,did);
					if(doc!=null)
					{
						if(doc.size()>=1)
						{
							System.out.println("Enter date of appointment ex:12/2/2020");
							Date date =utility.printDate(utility.getString());
							System.out.println(date);
							if(date==null)
							{
								System.out.println("Date format is not correct");
							}
							//Checking availability of doctors
							else
							{
							
								Appointment newApp=new Appointment(did,date);
								System.out.println(newApp.toString());
								if(appoint.containsKey(newApp))
								{
									Integer appointment=appoint.get(newApp);
									if(appointment<=5)
									{
										appointment++;
										appoint.put(newApp,appointment);
										System.out.println("Appointment Scheduled on"+date.toString()+" "+"with DoctorId"+did);
										
									}
									else
									{
										System.out.println("please select another date");
									}
									
								}
								appoint.put(newApp,1);
								
							}
						}
						else
						{
							System.out.println("Invalid doctor id");
						}
					}
					else
					{
						System.out.println("Invalid doctor id");
					}
					break;
					
					case 6:
							System.out.println("Printing All Appointments...");
							appoint.putAll(appoint);
							System.out.println(appoint);
							break;
					case 7:	
							int ch1=0;
							do
							{
								System.out.println();
								System.out.println("Search a doctor");
								System.out.println("1.search by id");
								System.out.println("2.search by name");
								System.out.println("3.Search by availabity");
								System.out.println("4.exit");
								System.out.println();
								System.out.println("Enter your choice");
								int choice1=utility.inputInt(); 
								switch(choice1)
								{
								case 1 :
									System.out.println("1.Enter doctor id");
									int did1=utility.inputInt();
									ald=f.findById(ald, did1);
									System.out.println(ald);
									break;
								case 2 :
									System.out.println("2.Enter doctor by name");
									String dname=utility.getString();
									ald=f.findById(ald, dname);
									System.out.println(ald.toString());
								case 3 :
									System.out.println("3.Enter doctor availabity");
									String availabity=utility.getString();
									ald=f.findById(ald, availabity);
									System.out.println(ald.toString());
								case 4 :
									System.exit(0);
								default :
									System.out.println("Invalid choice");
									break;
								}
							}while(ch1<5);
							
					case 8:
						Find f1=new Find();
						int ch2=0;
						do
						{
							System.out.println();
							System.out.println("----------Search Patients---------");
							System.out.println();
							System.out.println("1.Search Patients By Id");
							System.out.println("2.Search Patients By Name");
							System.out.println("3.Search Patients By Mobile Number");
							System.out.println("4.Exit");
							System.out.println();
							System.out.println("Enter your Choice: ");
							int ch3=utility.inputInt();
							switch (ch3) 
							{
							case 1:
									//Search Patients by id
									System.out.println("Enter Patients  Id");
									int pid1=utility.inputInt();
									alp=f1.findById1(alp,pid1);
									System.out.println(alp);
									break;
							case 2:
									//Search Patients by Name
									System.out.println("Enter Patients Name");
									String pname1=utility.getString();
									alp=f1.findByName1(alp,pname1);
									System.out.println(alp);
									break;
							case 3:
									//Search Patients by Mobile Number
									System.out.println("Enter Patients Mobile Number");
									String avail1=utility.getString();
									alp=f1.findByavailability(alp,avail1);
									System.out.println(alp);
									break;
							case 4:
									System.exit(0);
							default:
									System.out.println("Invalid choice");
									break;
							}
						}
						while(ch2<5);
					case 9 :
						System.exit(0);
					default :
						System.out.println("Invalid choice");
						break;
						
			}
			
		}while(c<10);
		
		
		
		
	}

	
		
	}


