package com.bridgelabz.singleton;
/** Singleton design pattern main class for all aproaches 
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Singleton {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("EagerInitialization...");
		EagerInitialization eagerSingle=EagerInitialization.getInstance();
		System.out.println(eagerSingle.hashCode());
		System.out.println();
		System.out.println("*******************************");
		System.out.println("LazyInitialization...");
		LazyInitialization l=LazyInitialization.getInstance();
		System.out.println(l.hashCode());
		System.out.println();
		System.out.println("*******************************");
		System.out.println("StaticBlockInitialization");
		StaticBlockInitialization s=StaticBlockInitialization.getInstance();
		System.out.println(s.hashCode());
		System.out.println("*******************************");
		System.out.println();
		System.out.println("ThreadSafeSingleton...");
		ThreadSafeSingleton threadSafe=ThreadSafeSingleton.getInstance();
		System.out.println(threadSafe.hashCode());
		System.out.println("*******************************");
		System.out.println();
		System.out.println("ThreadSafeSingleton by usingDoubleChecking...");
		ThreadSafeSingleton threadSafeDouble=ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(threadSafeDouble.hashCode());
		System.out.println("*******************************");
		System.out.println();
		System.out.println("BillPughSingleton...");
		/**
		 * if we want to create two static inner classes  BillPughSingleton.SingletonHelper sh=new BillPughSingleton.SingletonHelper(); is used
		 * we are accesing by outer class so inner class sholud be private
		 * if inner class is private it is not possible to create object
		 * */
		//	BillPughSingleton.SingletonHelper sh=new BillPughSingleton.SingletonHelper();
		System.out.println(BillPughSingleton.getInstance().hashCode());
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Enum singleton...");
		EnumSingleton e=EnumSingleton.APPLE;
		System.out.println(e);
		e.setValue(20);
		System.out.println("value ---->"+e.getValue());
		/**
		 * if we want to create two static inner classes SerializedSingleton.SingletonHelper sh2=new SerializedSingleton.SingletonHelper(); is used
		 * we are accesing by outer class so inner class sholud be private
		 * if inner class is private it is not possible to create object
		 * 
		 * */
		System.out.println("Serailible and singleton......");
		
			//SerializedSingleton.SingletonHelper sh2=new SerializedSingleton.SingletonHelper();
			//Serialize object state to file
			Object instance1=SerializedSingleton.getInstance();
			SerializedSingleton instance2=null;
			

			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("src/designpattern.ser"));
			out.writeObject(instance1);
			out.close();
			
			// deserialize from file to object
			ObjectInput in=new ObjectInputStream(new FileInputStream( ("src/designpattern.ser")));
			try {
				 instance2= (SerializedSingleton) in.readObject();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("instance 1----->"+instance1.hashCode());
			System.out.println("instance 2----->"+instance2.hashCode());
		}

	}

