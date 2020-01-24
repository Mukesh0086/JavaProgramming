package com.bridgelabz.dataStructures;

public class OrderedTry {
	static class Node{
		int data;
		Node next;
	}
	
	 static Node head;
	 public static void main(String[] args) {
		 insertion(23);
		 insertion(12);
		 insertion(1);
		 insertion(45);
		 display();
		
	}
	 public static  void insertion(int data)
	 {
		 Node node=new Node();
		 node.data=data;
		 node.next=null;
		 if(head==null|| node.data<head.data)
		 {
			 node.next=head;
			 head=node;
		 }
		 else {
			 Node n=head;
			 while(n.next!=null)
			 {
				 if(n.data<node.data)
				 {
					 n=n.next;
				 }
			 }
			 n.next=node.next;
			 n.next=node;
		 }
		 
	 }
	
	 public static void display()
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
