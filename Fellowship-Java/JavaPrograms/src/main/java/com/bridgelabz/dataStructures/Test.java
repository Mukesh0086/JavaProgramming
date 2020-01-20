package com.bridgelabz.dataStructures;

public class Test {
	static int c=0;
	
	Test()
	{
		c++;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
	}
}
