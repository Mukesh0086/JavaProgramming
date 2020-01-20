
//Add return type and complete on sunday  

package com.bridgelabz.dataStructures;



import com.bridgelabz.utility.Utility;

public class DoublyEndedQueue {
	
	static class Node{
		Node prev;
		char data;
		Node next;
		
	}
	static Node front;
	static Node rear;
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		String word=Utility.readString();
		char wordArray[]=word.toCharArray();
		for(int i=0;i<wordArray.length;i++)
		{
			insertRear(wordArray[i]);
		}
		display();
		
	}
	
	public static void insertFront(char a) {
		
		Node node=new Node();
		node.prev=null;
		node.next=null;
		node.data=a;
		
		if(front==null)
		{
			front=node;
			rear=node;
		}
		else {
			
			node.next=front;
			front.prev=node;
			front=node;
		}
	
	}
	
	public static void insertRear(char a) {
		Node node=new Node();
		node.prev=null;
		node.next=null;
		node.data=a;	
		if(front==null)
		{
			front=node;
			rear=node;
		}
		else
		{
			rear.next=node;
			rear.prev=rear;
			rear=node;
		}
		
	}
	
	public static void deleteFront() {
		
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			front=front.next;
			front.prev=null;
		}
		
	}
	public static void deleteRear() {
		
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			rear.next=null;
			rear=rear.prev;
		}
		
	}
	
	public static void display()
	{
		if(front==null)
		{
			System.out.println("empty");
		}
		else {
			Node n=front;
			while(n.next!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}
	}

	
}
