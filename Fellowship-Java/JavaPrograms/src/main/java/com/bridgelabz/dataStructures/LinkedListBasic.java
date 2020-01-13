package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LinkedListBasic {
	Node head;
	
	public static void main(String[] args) {
		LinkedListBasic list=new LinkedListBasic();
		String[] str=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/file.txt"));
			String lines=br.readLine();
			while(lines!=null)
				{
			
		
				str = lines.split(" ");
				for (String words : str) {
					

					
					lines=br.readLine();
									
				}
			}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		
		for(String words:str)
		{
			boolean isPresent=list.isPresent(words);
			System.out.println(isPresent);
			if(isPresent==false)
			{
				
				list.insert(words);
			}
			
			
		}
		list.show();
		
	}
	
	
	
	public void insert(String data)
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
	
	public void insertAtBeg(String data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
			
		}
	}
	
	public void insertAt(int index,String data)
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
	
	public void show()
	{
		
		
		Node node=head;
		
			while(node.next!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
		
		
	}
	
	public boolean isPresent(String str)
	{
		boolean flag=false;
		Node node=head;
		if(head==null)
		{
			node=head;
		}
		else
		{

			while (node.next != null) {

				if (node.data.equals(str)) {
					flag = true;
					break;

				}
				node = node.next;
			}
			
			
		}
		
		return flag;
	}
		
	
	public void deleteAtStart()
	{
		head=head.next;
	}
	
	public void deleteAt(int index)
	{
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		Node node=n.next;
		n.next=node.next;
	}
	
	public void linkedListLength()
	{
		if(head==null)
		{
			
		}
	}
	
	public void deleteAtEnd()
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n=null;
		
	}
	

}
