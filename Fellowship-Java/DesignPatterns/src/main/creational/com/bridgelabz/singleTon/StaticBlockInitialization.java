package com.bridgelabz.singleTon;
/**
 * changes:just like eager initialiazation but here we can handle the exception
 * @author Mukesh
 *
 */
public class StaticBlockInitialization 
{
	static StaticBlockInitialization obj=new StaticBlockInitialization();//eager initialization
	private StaticBlockInitialization() 
	{
		System.out.println("static block initialization");
	}
	static
	{
		try {
			obj=new StaticBlockInitialization();
		}
		catch(Exception e)
		{
			throw new RuntimeException("instance creation problem occurs");
		}
	}
	public static StaticBlockInitialization getinstance()
	{
		return obj;
	}
}
