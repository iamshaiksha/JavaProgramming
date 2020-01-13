package com.Bridgelabz.logicalPrograms;
/**Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
 *  @Shaik Shaiksha vali
 *  1.0v
 *  9/01/2020
 */

public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String startTime="01:02:44";
		String start[]=startTime.split(":");
		for(int i=0;i<start.length;i++)
		{
			System.out.println(start[i]);
		}
		String s1=new String(start[0]);
		String s2=new String(start[1]);
		String s3=new String(start[2]);
		Long hours=Long.parseLong(s1)*60*60;
		Long minutes=Long.parseLong(s2)*60;
		Long seconds=Long.parseLong(s3);
		long startingTime=hours+minutes+seconds;
		System.out.println("starting time="+startingTime);
		
		String endtime="03:01:01";//hh:mm:ss
		String end[]=endtime.split(":");
		for(int i=0;i<end.length;i++)
		{
			System.out.println(end[i]);
		}
		String s4=new String(end[0]);
		String s5=new String(end[1]);
		String s6=new String(end[2]);
		Long hrs=Long.parseLong(s4)*60*60;
		Long min=Long.parseLong(s5)*60;
		Long secs=Long.parseLong(s6);
		long totalTime=hrs+min+secs;
		System.out.println("total time="+totalTime);
		System.out.println("Elapsed time="+(totalTime-startingTime));
		
		
                                                  
	}

}
