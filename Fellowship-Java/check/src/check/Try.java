package check;

import java.util.ArrayList;

public class Try {
	
	
	public static void main(String[] args) {
		int num=1;
		iterate(1);
	}
	
	public static void iterate(int num)
	
	{
		
		System.out.println(num);
		num=num+1;
		if(num<100)
		{
			iterate(num);
		}
	}
}
	
	