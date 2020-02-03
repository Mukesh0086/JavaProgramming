package com.bridgelabz.prototypeDesign;
/**
 * Prototype:-it is a process of cloning the object without accessing database data everytime to save time time and costly resources.
 * In cloning there are 2 types 1.shallow cloning 2.Deep cloning.
 */
import java.util.*;

public class Employees implements Cloneable
{
	private List<String> emplist=new ArrayList<String>();
	/**
	 * getting employee value to linkedList
	 * @return
	 */
	public List<String> getEmplist() {
		return emplist;
	}
	/**
	 * setting employee value to linkedList
	 * @param emplist
	 */
	public void setEmplist(List<String> emplist) {
		this.emplist = emplist;
	}
	/**
	 * put data into employee linkedlist
	 */
	public void loadData()
	{
		emplist.add("koti");
		emplist.add("firoz");
		emplist.add("naveen");
		emplist.add("hima");
		emplist.add("sai");
	}
	/**
	 * Deep cloning:-which doesn't effect the other object after cloning for this we can override the clone method
	 * and we can implement ourself.
	 */
	@Override
	protected Employees clone() throws CloneNotSupportedException 
	{
		Employees e=new Employees();
		for(String e1 : getEmplist())
		{
			e.getEmplist().add(e1);
		}
		return e;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employees e=new Employees();
		e.loadData();
		/**
		 * shallow cloning:-if we delete any element after cloning it will effect other object also.
		 * cloning data into another object
		 * @param args
		 */
		Employees e1=new Employees();
		e1=e.clone();
		System.out.println("-----------before removing any element in original object---------------");
		System.out.println(e.emplist);
		System.out.println(e1.emplist);
		e.emplist.remove(3);
		System.out.println("-----------after removing any element in original object---------------");
		System.out.println(e.emplist);
		System.out.println(e1.emplist);
		
		
	}
}
