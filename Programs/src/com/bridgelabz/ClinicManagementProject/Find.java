package com.bridgelabz.ClinicManagementProject;

import java.util.ArrayList;

public class Find {

	public ArrayList<Doctor> findById(ArrayList<Doctor> ald, int did) {
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		for(Doctor d:ald)
		{
			if(d.getDid()==did)
			{
				temp.add(d);
			}
		}


		return temp;
	}

	public ArrayList<Doctor> findById(ArrayList<Doctor> ald, String dname) {

		ArrayList<Doctor> temp=new ArrayList<Doctor>();

		for(Doctor d:ald)
		{
			if(d.getDname()==dname)
			{
				temp.add(d);
			}
		}
		return temp;
	}
	public ArrayList<Doctor> FindByava (ArrayList<Doctor> ald, String availability)  //search doctor by availability
	{
		ArrayList<Doctor> temp=new ArrayList<Doctor>();

		for(Doctor d:ald)
		{
			if(d.getAvailability()==availability)
			{
				temp.add(d);
			}
		}
		return temp;	
	}

	public ArrayList<Patients> findById1(ArrayList<Patients> alp, int pid1) {
		ArrayList<Patients> temp=new ArrayList<Patients>();

		for(Patients p1:alp)
		{
			if(p1.getPid()==pid1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<Patients> findByavailability(ArrayList<Patients> alp, String mobile) {



		ArrayList<Patients> temp=new ArrayList<Patients>();

		for(Patients p1:alp)
		{
			if(p1.getMobile()==mobile)
			{
				temp.add(p1);
			}
		}
		return temp;

	}

	public ArrayList<Patients> findByName1(ArrayList<Patients> alp, String pname1) {
		ArrayList<Patients> temp=new ArrayList<Patients>();

		for(Patients p1:alp)
		{
			if(p1.getPname()==pname1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}		
}