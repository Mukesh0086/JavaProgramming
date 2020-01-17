package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Demo {
	static Node head;
	public static void main(String[] args) {
		String [] words= {"mango","banana","nuts","apple"};
		for(String word:words)
			
		{
			insertSort(word);
		}
		display();
		
	}
	public static void insertSort(String str)
	{
		System.out.println("ahaha");
		int campare=0;
		Node node=new Node();
		node.data=str;
		node.next=null;
		
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			int index=0;
			while(n.next!=null)
			{
				index=index+1;
				campare=n.data.toString().compareToIgnoreCase(str);
				if(campare<0)
				{
					insertAt(index, str);
				}
				else
				{
					insert(str);
				}
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public static void display() {

		Node n = head;
		while (n.next!= null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);

	}
	
	public static void insertAt(int index,String data)
	{
		Node n=head;
		Node node=new Node();
		node.data=data;
		node.next=null;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	
	public static void insert(String data)
	{
		Node node =new Node();
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
		}
	
	
	
	
	
	
	
	
	
	
	
	
}