package com.bridgelabz.dataStructures;

import com.bridgelabz.utility.Utility;

//practice one more time sunday.

public class Hashing {

	static Node rear;

	static Node[] nodeArray = new Node[11];

	public static void main(String[] args) {
		insert(5);
		insert(16);
		display();

	}

	public static int hashCode(int number) {

		int hashCode = 0;
		hashCode = number % 11;

		return hashCode;
	}

	public static <T> void insert(int data) {
		int index = hashCode(data);
		Node node = new Node<T>();
		node.data = data;
		node.next = null;

		if (nodeArray[index] == null) {
			nodeArray[index] = node;

		} else {
			Node rear = nodeArray[index];

			rear.next = node;
			rear = node;
		}
	}

	public static void display() {

		for (int i = 0; i < nodeArray.length; i++) {
			
				Node n = nodeArray[i];
				while (n != null) {
					System.out.print(n.data+"----");
					n = n.next;
				}
				System.out.println();
				
				
			}

		}

	
}
