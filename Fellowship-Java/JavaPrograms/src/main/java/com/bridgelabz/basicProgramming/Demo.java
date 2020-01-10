package com.bridgelabz.basicProgramming;

public class Demo {
	
	public static void main(String[] args) {
		int key=91;
		System.out.println("ahaha");
		int []arr= {1,7,14,91,100};
		int li=0;
		int hi=arr.length-1;
		
		int mi=(li+hi)/2;
		
		while(li<=hi)
		{
			
			if(arr[mi]==key)
			{
				System.out.println(mi);
				break;
			}
			else if(arr[mi]<key)
			{
				li=mi+1;
				
			}
			else if(arr[mi]>key)
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	}
	

}
