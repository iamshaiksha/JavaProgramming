package com.bridgelabz.ClinicManagementProject;

import java.util.Date;

public class Appointment {
	Integer did;
	Date date;
	
	public Appointment(int did, Date date) {
		// TODO Auto-generated constructor stub
		this.did=did;
		this.date=date;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String toString() 
	{
		return "Appointment [did=" + did + ", date=" + date +  "]";
	}
	
	

}
