package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class OrderedList {
	static class Node{
		String data;
		Node next;
	}
	static Node head;
	static OrderedList list=new OrderedList();
	
	public static void main(String[] args) {
		
		
		//reading from file and storing it in String array using Buffered Reader
		String[] str=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/file.txt"));
			String lines=br.readLine();
			while(lines!=null)
				{
			
				
				str = lines.split(" ");
				for (String words : str) {
					
					
					list.add(words);
					
					
					
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
		//list.isPresent(addlist);
		
		//Printing linkedlist after operation
		System.out.println("After user input and operation");
		list.show();
		
		//writing into a file
		
		
		
	}
	
	
	public static  void add(String words) {
		System.out.println("add");
		int ctr = 0;
		Node node = new Node();
		node.data=words;
		
		if (head == null|| ) {
			node.next = head;
			head = node;
		} else {
			Node prev = head;
			Node follow = head;
			while (follow.next != null) {
				if (words.compareTo(follow.data)>0){
					prev = follow;
					follow = follow.next;
				}
				else {
					ctr = 1;
					prev.next = node;
					node.next = follow;
					break;
				}
			}
			if (ctr == 0)
				follow.next = node;
		}
	}
	
	
	
	public void show()
	{
		System.out.println("show");
		Node node=head;
		
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
		
		
	}
	
	
	
	
}
