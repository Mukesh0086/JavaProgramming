package com.bridgelabz.dataStructures;

import com.bridgelabz.utility.Utility;

// valid condition done check for balanced condition.

public class Stack {
	
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		
		System.out.println("Enter the equation");
		String equation=Utility.readString();
		char [] equationArray=equation.toCharArray();
		
		boolean balanced=checkBalanced(equationArray);
		System.out.println(balanced);
	}
		
	public static <T> boolean checkBalanced(char []arr)
	{
		boolean flag=false;
		for(char letter:arr)
		{
			
			if((letter=='[')|| (letter=='{')|| (letter=='('))
			{
				push(letter);
			}
			
			else if(letter==']')
			{
				T result=(T) pop();
				
				if(result.equals('['))
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
			
			else if(letter=='}')
			{
				T result=(T) pop();
				
				if(result.equals('{'))
				{
					flag=true;
				}
				else{
					flag=false;
					
				}
			}
			
			else if(letter==')')
			{
				T result=(T) pop();
				
				if(result.equals('('))
				{
					flag=true;
				}
				else {
					flag=false;
				}
			}
			
			
			
			
			
		}
		return flag;
		}
		
		
		
		
	
	static Node head;
	
	public static<T> void push(T k)
	{
		Node n=new Node();
		n.data=k;
		n.next=null;
		if(head==null)
		{
			head=n;
			
		}
		else
		{
			
			n.next=head;
			head=n;
		}
	}
	
	

	public static <T> Object pop()
	{
		
		T pop=(T) head.data;
		head=head.next;
		
		return pop;
		
		
		
	}
	
	public static <T> Object peek()
	{
		
		return head.data;
		
	}
	
	
	public void show()
	{
		
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		//System.out.println(n.data);
	}

}
