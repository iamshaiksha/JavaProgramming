package com.bridgelabz.ClinicManagementProject;

public class Doctor {
	int did;
	String dName;
	String availability;
	String spec;
	Utility utility=new Utility();
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dName;
	}
	public void setDname(String dname) {
		this.dName = dname;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public void addDoctor() {
		System.out.println("Enter the Details");
		System.out.println();
		System.out.println("Enter the doctor id");
		this.did=utility.inputInt();
		System.out.println();
		System.out.println("Enter the name");
		this.dName=utility.getString();
		System.out.println();
		System.out.println("Enter the availabity(1:PM 2:AM 3:Both");
		this.availability=utility.getString();
		System.out.println();
		System.out.println("Enter Specialization");
		this.spec=utility.getString();
		System.out.println();
		System.out.println("Docotor added..");
	}
	public String toString()
	{
		return "Doctor[did="+ did +" dname="+ dName +" availabity="+ availability +"spec"+spec+"]";
	}

}
