package com.bridgelabz.algorithmicProgramming;


import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class BinarySearchFromFile {
	
	public static void main(String[] args) throws IOException {
		String file=readFile();
		boolean flag=findWord(file);
		System.out.println(flag);
		
	}
	
	public static String readFile() throws FileNotFoundException 
	{
		String st = "";
		Scanner file1=new Scanner (new File("/home/admin1/fellowship/search.text")); 
		while(file1.hasNext())
		{
			st=st+" "+file1.next();
		}
		return st;
		  
		
	}
	
	public static boolean findWord(String file)
	{
		System.out.println("into the function");
		String [] words=file.split(" ");
		
		
	
		
		return false;
	}

}
