package com.bridgelabz.utility;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bridgelabz.dataStructures.Node;



public class Utility {
	
	private static final Scanner SCAN=new Scanner(System.in);
	
	/*creating a Scanner object to use it across the project
	 * Scanner object is made final value cannot be changed
	 */
	
	private static final Logger LOG=Logger.getLogger(Utility.class.getName());
	
	/*creating a Logger object for the utility class
	 * to log informations and warnings
	 */
	
	public static int readInteger()
	{
		//Utility.LOG.info("readInteger() method called");
		return SCAN.nextInt(); 		//Scanner object to input Integer 
	}
	public static double readDouble()
	{
		return SCAN.nextDouble();		//Scanner object to input Double 
	}
	public static long readLong()
	{
		return SCAN.nextLong();		//Scanner object to input Long 
	}
	public static String readString()
	{
		return SCAN.nextLine();		//Scanner object to input String 
	}
	public static float readFloat()
	{
		return SCAN.nextFloat();		//Scanner object to input Float
	}
	
	
	/* The below flipsCoin method will take number of turns as input and generate
	 * a random value for each turns equate to head or possibility and returns the 
	 * percentage. 	
	 */
	
	public static int flipsCoin(int turns)
	{
		int head=0,tail=0;
		
		while(turns>0)
		{
			double result=Math.random();
			if(result>0.5)
			{
				head=head+1;
			}
			else
			{
				tail=tail+1;
			}
			turns=turns-1;
		}
		
		return ((head*100)/tail);
	}
	
	
	/* The below harmonicMean method will take number as input and generate
	 * the summation of harmonic mean and returns the summation upto numberth 
	 * terms.(Double value) 	
	 */
	
	public static double harmonicMean(int number) {
		
		double sum = 0.0;

		for (int i = 1; i <=number; i++) { 
			sum = sum +1.0 / i; 
		} 
		return   sum; 
	}
	
	
	/* The below isLeapYear method will take year as input and process the 
	 * conditions. If condition is passed flag is set to true else false  	
	 */
	
	public static boolean isLeapYear(int year)
	{
		boolean flag=false;
		if((year%4==0) && (year%100!=0) || (year%400==0) && (year%100!=0))
		{
			flag=true;
		}
		return flag;
		
	}
	
	
	/* The below power method will take exponent input and generate
	 * the value of 2 to the power of exponent. The functions works upto 2 to the power
	 * of 31, since thats the limit of Integer datatype. 	
	 */
	
	public static int power(int exp) {
	
		int base=2,result=1;
		for(int i=1;i<=exp;i++)
		{
			result=result*2;
		}
		return result;
	}
	
	
	/* The below primefactors method takes a number and calculate the number of
	 * the number and each prime factor is stored in a ArrayList which is returned
	 */
	
	
	public static ArrayList<Integer> primeFactors(int number)
	{
		int i=0;
		ArrayList<Integer> factorList=new ArrayList<Integer>();
		while(number>1)
		{
			for(i=2;i<=number;i++)
			{
				if(number%i==0)
				{
					number=number/i;
					factorList.add(i);
					break;
				}
			}
		}
		return factorList;
		
	}
	
	
	/* The below replace method takes a replace string and replaces <<username>>
	 * with replace string value 	
	 */
	
	public static String replace(String str,String replace)
	{
		return str.replaceFirst("<<username>>",replace);
	}
	

	/* The below sum of euclideanDistance Method takes two arguments x and y and 
	 * calculate the euclidean distance from origin to x and y  	
	 */
	
	public static double euclideanDistance(int x,int y)
	{
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	
	/* The below QuadriaticRoots method will take 3 integer as input and calculate
	 * the two roots of the Quadriatic equation created those 3 integers 
	 * and returns a Hashmap 	
	 */
	
	public static HashMap<String,Float> QuadriaticRoots(int a,int b,int c)
	{
		
		HashMap<String, Float> roots=new HashMap();
		float root1=0,root2=0;
		root1=(float) ((-b+Math.sqrt(b*b-4*a*c))/2*a);
		root2=(float) ((-b-Math.sqrt(b*b-4*a*c))/2*a);
		roots.put("root1", root1);
		roots.put("root2", root2);
		return roots;
	}
	
	
	/* The below sum of three numbers equals 0 method takes one integer array 
	 * iterate through it and if sum equals 0 the value ,the numbers are stored 
	 * in arraylist 	
	 */
	
	public static ArrayList<Integer> sumOfThreeNumberEqualsZero(int [] arr){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				for(int k=j+1;k<length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						list.add(arr[i]); //adding values  arraylist
						list.add(arr[j]);
						list.add(arr[k]);
					}
				}
			}
		}
		
		return list;
	}
	
	
	
	/* The below print2dArray method takes rows ,columns and array from input
	 *  method and then prints the value
	 */
	
	public static double [][] print2dArray(double [][]twodArray,int rows,int columns)
	{
		//PrintWriter pw=new PrintWriter(System.out,true);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print((twodArray[i][j])+" ");
			}
			System.out.println("");
		}
		return twodArray;
		
	}
	
	/* The below windChill method will take 2 integer temperature and speed
	 *  as input and calculate wind stores in a double and returns the wind 	
	 */
	
	public static double windChill(int t,int v)
	{
		double wind=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return wind;
	}
	
	
	/*The below distinctCoupons method uses a Hashset and counts by using boolean variable which
	 * returns true if successfully added to set and false if not added
	 */
	
	public static int distinctCoupons(int number){
		HashSet< Integer> hs=new HashSet();
		
		int count=0;
		int distinct=number;
		
		while(number>0 && hs.size()<=distinct)
		{
			
			boolean flag=false;
			
			count=count+1;
			int coupon=(int) (Math.random()*10);
			System.out.println("coupon"+coupon);
			
			
			flag=hs.add(coupon);
			
			
			
			if(flag==false)
			{
				number=number+1;
			}
		
			number=number-1;
		}	
		
		return count;
	}
	
	/*The below gambling method takes 3 integers as input and based on stake not equal to 0
	 * and stake not equal to goal the player keeps on playing. This method returns a Hashmap 
	 * with win percentage ,wins.
	 */
	
	
	
	public static HashMap<String,Float> gambling(int stake,int goal,int turns){
		
		int win=0,loss=0,count=0;
		while(turns>0)
		{
			float result=(float) Math.random();
			if(result>0.5)	
			{
				win=win+1;
				
			}
			if(result<0.5)	
			{
				loss=loss+1;
				
			}
			if(result==goal)	
			{
				System.out.println("Goal Reached");
				break;
				
			}
			
			if(result==0)	
			{
				System.out.println("Lost full stake");
				break;
				
			}
			
			turns=turns-1;
			count=count+1;
			
		}
		
		float totalWin=win;
		float winPercentage= (win*100)/count;
		float lossPercentage=(loss*100)/count;
		
		HashMap<String,Float> gamblingResult=new HashMap();
		gamblingResult.put("totalWins", totalWin);
		gamblingResult.put("winPercentage", winPercentage);
		gamblingResult.put("lossPercentage", lossPercentage);
		return gamblingResult;
		
	}
	
	

	/*The below stopwatch function uses Java Instant classes to capture the start and stop time
	 * then using Duration class between method the difference between the time id found 
	 * later its added to a LinkedHashMap 
	 */
	
	public static LinkedHashMap<String, Long>stopWatch()
	{
		LinkedHashMap<String, Long> stopwatch=new LinkedHashMap<String, Long>();
		Instant time1 = null,time2 = null;
		
		System.out.println("type start to start the watch");
		String start=Utility.readString();
		if(start.equalsIgnoreCase("start"))
		{
			time1=Instant.now();
		}
		System.out.println("type stop to stop the watch");
		String stop=Utility.readString();
		if(stop.equalsIgnoreCase("stop"))
		{
			time2=Instant.now();
		}
		
		Duration diff=Duration.between(time1, time2);
		long millisecond=diff.toMillis();
		long seconds=diff.toSeconds();
		long minutes=diff.toMinutes();
		long hours=diff.toHours();
		
		stopwatch.put("diff in hours ", hours);
		stopwatch.put("diff in minutes ", minutes);
		stopwatch.put("diff in seconds", seconds);
		return stopwatch;	
		
	}
	
	
	/* The below isAnagram method takes two strings convert them to a char array
	 * and then the sort elements by using arrays.sort method and then campare 
	 * both the elements 	
	 */
	
	public static boolean isAnagram(String s1,String s2)
	{
		boolean flag=false;
		
		char[] word1=s1.toCharArray();
		char[] word2=s2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if(Arrays.equals(word1, word2))
		{
			flag=true;
		}
		
		
		return flag;
	}
	
	
	/* The below bubblesort method takes an unsorted Integer array as input 
	 * and then  sort elements by using by using bubble sort logic	
	 */
	
	public static  int[] bubbleSort(int []array)
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		return array;
	}
	
	
	/*The below dayOfWeek method takes 3 inputs day ,month ,year and apply the formula
	 * and return a integer. In main method the appropriate day of week is printed using switch case 
	 */
	
	
	
	public static int dayOfWeek(int day, int month, int year) {
		
		int m0, y0, d0, x;
		y0 = year - (14 - month) / month;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	
	/*The below printifPrime method prints the prime numbers from the range between 
	 * 1 and 1000 by iteration
	 */
	
	public static ArrayList<Integer> printIfPrime(){
	
		int number=2;
		ArrayList<Integer> primenumbers=new ArrayList<Integer>();
		while(number<1000) {
			int count=0;
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				primenumbers.add(number);
				
			}
			number=number+1;
			
		}
		return primenumbers;
		
	}
	

	/*The below printifPrime method prints the prime numbers from the range between 
	 * 1 and 1000 by iteration
	 */
	
	public static ArrayList<Integer> printIfPrimeNumber(){
	
		int number=2;
		ArrayList<Integer> primenumbers=new ArrayList<Integer>();
		while(number<1000) {
			int count=0;
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				primenumbers.add(number);
				
				
			}
			number=number+1;
			
		}
		return primenumbers;
		
	}
	
	public static ArrayList<Integer> primePalindrome( ArrayList<Integer> primeList)
	{
		
		ArrayList<Integer> primePalindrome=new ArrayList<Integer>();
		
		int remainder;
		for(Integer primeNumber:primeList)
		{
			int number=primeNumber;
			int palindrome = 0;
			while(number>0)
			{
				
				remainder=number%10;
				palindrome=palindrome*10+remainder;
				number=number/10;
			}
			
			
			if(palindrome==primeNumber)
			{
				primePalindrome.add(palindrome);
				
				
			}
		}
		return primePalindrome;
	}
	
	public static ArrayList<Integer> anagramNumbers(ArrayList<Integer> primePalindromeList)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		int anagram=0;
		for(Integer ppNumber:primePalindromeList )
		{
			for(int i=2;i<10;i++)
				
			{
				anagram=ppNumber*i;
				char[] anagramArr=String.valueOf(ppNumber).toCharArray();
				char[] campareArr=String.valueOf(anagram).toCharArray();
				Arrays.sort(anagramArr);
				Arrays.sort(campareArr);
				boolean campare=Arrays.equals(anagramArr,campareArr);
				if(campare==true)
				{
					System.out.println(ppNumber+" | "+anagram);
					result.add(ppNumber);
					result.add(anagram);
				}
			}
		}
		
		return result;
	}
	
	/*The below regexPassageReplace method replaces the name fullName Phone and Date by using 
	 * replaceAll function
	 */
	
	public static String regexPassageReplace(String str,String name,String fullName,String phNumber,String date)
	{
		
		str=str.replace("<<name>>", name);
		str=str.replace("<<full name>>", fullName);
		str=str.replace("xxxxxxxxxx", phNumber);
		str=str.replace("01/01/2016", date);
		
		return str;
	}
	

	/* The below  temperatureConversion Method takes two arguments type and temperature and 
	 * convert to either in celsius or fahrenheit based on type  	
	 */
	
	public static double temperatureConversion(String type,int temperature)
	{
		double calculatedValue=0.0;
		
		if(type.equalsIgnoreCase("far"))
		{	
			calculatedValue=(((temperature)*(9))/5+32);
			
		}
		else if(type.equalsIgnoreCase("cel"))
		{
			calculatedValue=(((temperature-32)*(5))/(9));
			
		}
		else
		{
			System.out.println("Invalid input please choose cel or far");
		}
		
		return calculatedValue;
	}
	
	
	/* The below  ToDecimal Method takes a binary number as argument  and 
	 * convert to decimal by taking each places and multiplying with 2 power of respective positions  	
	 */
	
	public static double toDecimal(double binary)
	{
		
		String findLength=String.valueOf((int) binary);
		
		double decimal=0;
		int i=0;
		while(binary>=1)
		{
			
			int modulus=(int) (binary%10);
			binary=(int) binary/10;
			decimal=decimal+modulus*Math.pow(2, i);
			i=i+1;
		}
		
		return decimal;
	}
	
	/* The below  fewestNotes Method takes two arguments type and temperature and 
	 * convert to either in celsius or fahrenheit based on type  	
	 */
	
	
	
	public static ArrayList<Integer> fewestNotes(int [] result,int amount,int index,int count)
	{
		ArrayList<Integer> notes=new ArrayList<Integer>();
		while(amount>0)
		{
			if(amount>=result[index])
			{
				count=count+1;
				amount=amount-result[index];
				System.out.println(result[index]);
				notes=fewestNotes(result, amount, index,count);
			}
			else
			{
				
				index=index+1;
				notes=fewestNotes(result, amount, index,count);
			}
			break;
			
		}
		if(amount==0)
			System.out.println("Number of fewest notes required is "+count);
			
		return notes;
		
	}
	
	
	/* The below  DecimalToBinary Method takes decimal number and convert it to 
	 * Binary by dividing it by 2 and storing remainder until number reaches 0	
	 */
	
	public static ArrayList<Integer> decimalToBinary(int number){
		
		ArrayList<Integer> binaryList=new ArrayList<Integer>();
		
		int bit=0;
		while(number>=1)
		{
			bit=number%2;
			binaryList.add(bit);
			number=number/2;
			
		}
		return binaryList;
		
	}
	
	/*
	 * This function takes last element as pivot,places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	public static void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	/* A utility function to print array of size n */
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void insertionSort(int [] array)
	{
		int temp=0;
		int j=0;
		int swap=0;
		for(int i=1;i<=array.length-1;i++)
		{
			temp=array[i];
			j=i;
			while(j>0 && array[j-1]>temp)
			{
				array[j]=array[j-1];
				j=j-1;
			}
			array[j]=temp;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	
	public static int [][] primeRepresentation(ArrayList<Integer> primeList) {

		int start = 0;
		int end = 100;
		int count = 0;
		int ind = 0;
		int[][] array = new int[10][];
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> subPrime = new ArrayList<Integer>();
			for (Integer l1 : primeList) {
				if (l1 >= start && l1 <= end) {
					count++;
					subPrime.add(l1);
				}
			}
			array[ind] = new int[count];
			int k = 0;
			for (Integer ii : subPrime) {
				array[ind][k] = ii;
				k++;
			}
			ind++;
			count = 0;
			start = start + 100;
			end = end + 100;
		}
		
		return array;

	}	
	
	
	
	public static int[][] anagramsArray(int[][] array) {
		int[][] anagrams = new int[20][];
		int  row = 0, col1 = 0, col2 = 0;
		boolean flag1 = false, flag2 = false;
		for (int[] i : array) {
			ArrayList<Integer> l1 = new ArrayList<Integer>();
			ArrayList<Integer> l2 = new ArrayList<Integer>();
			for (int j : i) {
				String str1 = Integer.valueOf(j).toString();
				char[] ch1 = str1.toCharArray();
				Arrays.sort(ch1);
				for (int k : i) {

					String str2 = Integer.valueOf(k).toString();
					char[] ch2 = str2.toCharArray();
					Arrays.sort(ch2);
					if (str1.equals(str2) == false && str1.length() == str2.length()) {
						if (String.copyValueOf(ch1).equals(String.copyValueOf(ch2))) {
							flag1 = true;
						}
					} else {
						flag2 = true;
					}
				}
				if (flag1 == true) {
					l1.add(j);
					col1++;
				} else {
					l2.add(j);
					col2++;
				}
				flag1 = flag2 = false;
			}
			anagrams[row] = new int[col1];
			anagrams[row + 1] = new int[col2];
			int t1 = 0, t2 = 0;
			for (Integer ii : l1) {
				anagrams[row][t1] = ii;
				t1++;
			}
			for (Integer ii : l2) {
				anagrams[row + 1][t2] = ii;
				t2++;
			}
			row += 2;
			col1 = col2 = 0;
		}
		return anagrams;
	}
	
	
	
	public static Node storeAnagramsIntoStack(int[][] anagrams) {
		Node head = null, prev = null;
		for (int i = 0; i < 20; i += 2) {
			for (int j = 0; j < anagrams[i].length; j++) {
				Node node = new Node();
				node.data = anagrams[i][j];
				node.next = null;
				if (head == null) {
					head = node;
				} else {
					node.next = head;
					head = node;
				}
			}
		}
		return head;
	}
	
	
	public static Node storeAnagramsIntoQueue(int[][] anagrams) {
		Node front = null, rear = null;
		for (int i = 0; i < 20; i += 2) {
			for (int j = 0; j < anagrams[i].length; j++) {
				Node node = new Node();
				node.data = anagrams[i][j];
				node.next = null;
				if (front == null) {
					front = node;
					rear = node;
				} else {
					rear.next=node;
					rear = node;
				}
			}
		}
		return front;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	


