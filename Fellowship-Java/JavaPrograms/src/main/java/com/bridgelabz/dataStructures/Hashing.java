package com.bridgelabz.dataStructures;

import com.bridgelabz.utility.Utility;

//practice one more time sunday.

public class Hashing {
	
	static Node head;
	
	static Node [] nodeArray=new Node[11];
	
	public static void main(String[] args) {
		OrderedList list=new OrderedList();
		System.out.println("enter number");
		int number=Utility.readInteger();
		int hashNumber=hashCode(number);
		int hashNumber2=hashCode(53);
		
		nodeArray[hashNumber]=insert(number);
		nodeArray[hashNumber]=insert(53);
		for (int i = 0; i < nodeArray.length; i++) {
			if(nodeArray[i]!=null)
			{
				System.out.println(nodeArray[i].data);
				System.out.println(nodeArray[i].next.data);
			}
		}
		
		
		
		
		
		
	}
	
	public static int hashCode(int number)
	{
		
		int hashCode=0;
		hashCode=number%11;
		
		return hashCode;
	}
	
	public static <T> Node insert(int data)
	{
		Node node=new Node<T>();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
		return node;
	}
	
	
	public void display() {
		
		if(head==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node n=head;
			while(n!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}
		
	
	}
}
