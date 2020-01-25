package com.bridgelabz.ClinicManagementProject;

public class Patients {
	int pid;
	String pName;
	int age;
	String mobile;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pName;
	}
	public void setPname(String pname) {
		this.pName = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void addPatient() {
		Utility utility=new Utility();
		System.out.println("Enter the Details");
		System.out.println();
		System.out.println("Enter the patient id");
		this.pid=utility.inputInt();
		System.out.println();
		System.out.println("Enter the pateint name");
		this.pName=utility.getString();
		System.out.println();
		System.out.println("Enter the pateint age");
		this.age=utility.inputInt();
		System.out.println();
		System.out.println("Enter the patient mobile number");
		this.mobile=utility.getString();
		System.out.println();
		System.out.println("Patient added...");
	}
	public String toString()
	{
		return "Patient[pid="+ pid +" pname="+ pName +" age="+ age +"MobileNumber"+mobile+"]";
	}

}
