package com.bridgelabz.dataStructures;

public class Main {
	static class Node{
		int data;
		Node next;
	}
	static Node head;

	
	
	public static void main(String[] args) {
		insertOrder(23);
		insertOrder(4);
		
		insertOrder(45);
		
		insertOrder(10);
		insertOrder(7);
		insertOrder(2);
		insertOrder(33);
		display();
	}
	
	public static void insertOrder(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null||node.data<=head.data)
			
		{
			System.out.println("check head");
			node.next=head;
			head=node;
			
		}
		
		
		else
		{
			Node n=head;
			while(n.next!=null && n.next.data<node.data)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		
		}
	}
	
	public static void display()
	{
		if(head==null)
		{
			System.out.println("empty");
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}
	}
	
	
	
	
	
	
	
	
}
