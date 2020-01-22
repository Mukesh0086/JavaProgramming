package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class UnOrderedList {
	Node head;
	static UnOrderedList list=new UnOrderedList();
	
	public static <T> void main(String[] args) throws IOException {
		
		
		//reading from file and storing it in String array using Buffered Reader
		String[] str=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/file.txt"));
			String lines=br.readLine();
			while(lines!=null)
				{
			
				
				str = lines.split(" ");
				for (String words : str) {
					
					list.insert(words);
					
					lines=br.readLine();
									
				}
			}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		
		//Printing linkedlist before operation
		System.out.println("from file to linked list");
		list.show();
		
		System.out.println("Enter a string ");
		String addlist=Utility.readString();
		list.isPresent(addlist);
		
		//Printing linkedlist after operation
		System.out.println("After user input and operation");
		ArrayList<T> result=new ArrayList<T>();
		
		
		result=list.show();
		File file=new File ("/home/admin1/Desktop/muk.txt");
		
			FileWriter fw=new FileWriter(file);
			for(T words:result)
			{
				fw.append((CharSequence) words);
				fw.write("\n");
			}
			fw.close();
	}
	
	
	
	public <T> void insert(T data)
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
	
	public <T> void insertAtBeg(T data)
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
	
	public <T> void insertAt(int index,T data)
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
	
	public <T> ArrayList<T> show()
	{
		
		Node node=head;
		ArrayList<T> data=new ArrayList<T>();
		
			while(node.next!=null)
			{
				System.out.println(node.data);
				data.add((T) node.data);
				node=node.next;
			}
			System.out.println(node.data);
			return data;
		
		
	}
	
	public <T> void isPresent(T str)
	{
		
		int index=0;
		
		boolean flag = false;
		Node node=head;
		if(head==null)
		{
			node=head;
		}
		else
		{

			while (node!= null) {
				int count=0;
				index=index+1;
				if (node.data.equals(str)) {
					
					
					count=count+1;
				}
				
				if(count>=1)
				{
					flag=true;
					list.deleteAt(index-1);
					break;
				}
				
				node = node.next;
			}
			if(flag==false)
			{
				list.insert(str);
			}
		}
		
	}
		
	
	public void deleteAtStart()
	{
		head=head.next;
	}
	
	
	public <T> void deleteAt(int index)
	{
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		Node node=n.next;
		n.next=node.next;
	}
	
	
	public <T> void deleteElement(T value)
	{
		boolean flag;
		Node n=head;
		
		while(n!=null)
		{
			if(flag=n.data.equals(value))
			{
				Node node=n.next;
				n.next=node.next;
			}
			n=n.next;
		}
		
	}
	
	
	public int linkedListLength()
	{
		int count=0;
		if(head==null)
		{
			return 0;
		}
		else
		{
			Node n=head;
			while(n!=null)
			{
				count=count+1;
				n=n.next;
			}
		}
		return count;
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
