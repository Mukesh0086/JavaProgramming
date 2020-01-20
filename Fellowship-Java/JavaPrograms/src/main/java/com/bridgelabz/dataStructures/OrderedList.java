// should read generics and implement hold for now 



// complete writing into file on sunday

package com.bridgelabz.dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.dataStructures.Main.Node;
import com.bridgelabz.utility.Utility;

public class OrderedList {
	static class Node{
		int data;
		Node next;
	}
	static Node head;
	
	
	public static void main(String[] args) {
		
		insertOrder(20);
		insertOrder(21);
		show();
		
		
		
	}
	
	
	public static Node insertOrder(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null||node.data<=head.data)
			
		{
			
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
		return node;
	}
	
	
	
	public static void show()
	{
		System.out.println("show");
		Node node=head;
		
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
			
		
		
	}
	
	
	
	
}
