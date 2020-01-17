package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Demo {
	static Node head;
	static Node n=head;
	
	public static void main(String[] args) {
		
		String[] str=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/file.txt"));
			String lines=br.readLine();
			while(lines!=null)
				{
			
		
				str = lines.split(" ");
				for (String words : str) {

					
					lines=br.readLine();
					addWordsLinkList(words);				
				}
			}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		//System.out.println("Length"+str.length);
		
		
	
}
	
	
	
	
	public static void addWordsLinkList(String str) {
		System.out.println("check");
		Node head = null;

		Node node = new Node();
		node.data = str;
		node.next = null;
		if (head == null) {
			head = node;

		} else {
			Node n = head;
			while (n != null) {
				n = n.next;
			}
			n = node;
			System.out.println(n.data);

		}

	}
		
		
	
	public static void display()
	{
		System.out.println("check");
		
		
		while (n!= null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
		
	}
	
	
	
	
	
	
	
	
	
}
