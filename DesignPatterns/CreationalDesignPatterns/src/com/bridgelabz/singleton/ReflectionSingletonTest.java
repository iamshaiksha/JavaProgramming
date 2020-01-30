package com.bridgelabz.singleton;
/** ReflectionSingletonTest design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
	public static void main(String []args)
	{
		EagerInitialization instanceOne=EagerInitialization.getInstance();
		EagerInitialization instanceTwo=null;
		Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();
		for(Constructor constructor:constructors )
		{
			//if we give here false indicates that the reflected object should enforce Java language access checks.
			constructor.setAccessible(true);
			try {
				instanceTwo=(EagerInitialization) constructor.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			break;
		}
		System.out.println("instanceone--->"+instanceOne.hashCode());
		System.out.println("instancetwo--->"+instanceTwo.hashCode());
	}
}
