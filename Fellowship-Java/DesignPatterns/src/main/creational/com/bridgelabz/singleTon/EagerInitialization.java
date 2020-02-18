package com.bridgelabz.singleTon;
/**
 * step-1:create instance as static
 * step-2:create constructor as private
 * step-3:create method as static and return instance
 * problem:created automatically without calling thats waste of memory
 * @author Mukesh
 *version 1.0
 */
public class EagerInitialization 
{
	static EagerInitialization obj=new EagerInitialization();//eager initialization
	private EagerInitialization()
	{
		System.out.println("eager initialization");
	}
	public static EagerInitialization getinstance()
	{
		return obj;
	}
//	public static void main(String[] args) 
//	{
//		EagerInitialization obj1=EagerInitialization.getinstance();
//		EagerInitialization obj2=EagerInitialization.getinstance();
//	}
}
