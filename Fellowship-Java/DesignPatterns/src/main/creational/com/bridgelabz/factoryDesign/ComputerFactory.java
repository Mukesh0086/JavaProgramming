package com.bridgelabz.factoryDesign;
/**
 * Factory design is used mainly for giving abstraction to the client.
 * @author Mukesh
 * In factory design client or user can call the result through Factory but implementation was written in somewhere.
 *
 */
public class ComputerFactory 
{
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type)) 
			return new Pc(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}
