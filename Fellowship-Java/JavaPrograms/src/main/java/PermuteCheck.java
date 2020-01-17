import com.bridgelabz.utility.Utility;

public class PermuteCheck {
	
	public static void main(String[] args) {
		System.out.println("entyer the string");
		String str=Utility.readString();
		permuteIterate(str);
	}
	public static void permuteIterate(String str)
	{
		char[] array=str.toCharArray();
		int length=array.length;
		int fact=1;
		while(length>0)
		{
			fact=fact*length;
			length--;
		}
		length=array.length;
		fact=fact/length;
		System.out.println(fact);
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			int size=length-1;
			for(int j=fact;j>0;j--)
			{
				char temp=array[size];
				array[size]=array[size-1];
				array[size-1]=temp;
				size--;
				if(size==1)
				{
					size=length-1;
				}
				for(int k=0;k<array.length;k++)
				{
					System.out.print(array[k]);
				}
				System.out.println();
			}
			count++;
			
			if (count != array.length) {
				char ch = array[count];
				
				array[count] = array[0];
				array[0] = ch;
		}
		
		
		
		
	}
}
}