package com.bridgelabz.logicalProgramming;

import java.util.Random;

import com.bridgelabz.utility.Utility;
public class TicTacToe {

	//static reference to access non static methods in static method
	
	
	private static final String PLAYER = "Player 1 Wins";
	private static final String COMPUTER = "Computer Wins";
	static String[][] mArray = new String[3][3]; 
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mArray[i][j] = "";
			}
		}		
		runGame();
	}

	//Function to enter input from computer
	
	public static void computerInput() {
		
		Random random = new Random();
		int row = 0 + random.nextInt(3);
		int column = 0 + random.nextInt(3);
		if(mArray[row][column]!="X" && mArray[row][column]!="0") {
			mArray[row][column] = "0";
		}else {
			computerInput();
		}
	}

	//Function for user to enter the input
	
	public static void playerInput() {
		
		System.out.print("Enter X at: ");
		int row = Utility.readInteger();
		int column = Utility.readInteger();
		if(mArray[row][column].equals("")) {
			mArray[row][column]="X";
		}else {
			System.out.println("Enter at empty Slot");
			playerInput();
		}

	}

	//function to check the game status after each turn
	
	public static String checkWinDraw() {
		
		//logic to check match in rows
		
		for(int i=0; i<3; i++) {
			int j=0;
			if(mArray[i][j].equals(mArray[i][j+1]) && mArray[i][j].equals(mArray[i][j+2]) && mArray[i][j]!="") {
				if(mArray[i][j]=="X") {
					return PLAYER;
				}else {
					return COMPUTER;
				}
			}
		}

		//logic to check match in columns
		
		for(int j=0; j<3; j++) {
			int i=0;
			if(mArray[i][j].equals(mArray[i+1][j]) && mArray[i][j].equals(mArray[i+2][j]) && mArray[i][j]!="") {
				if(mArray[i][j]=="X") {
					return PLAYER;
				}else {
					return COMPUTER;
				}
			}
		}

		//diagonal check Logic
		
		boolean flag = false;
		int x = (mArray.length-1);
		for(int i=0; i<(mArray.length-1); i++) {
			flag = false;
			if(mArray[i][i].equals(mArray[i+1][i+1]) && mArray[i][i]!="") {
				flag = true;
			}
			if(mArray[i][x].equals(mArray[i+1][x-1]) && mArray[i][x]!="") {
				flag = true;
			}
			x--;
			if(!flag)
				break;
		}
		if(flag) {
			if(mArray[1][1]=="X") {
				return PLAYER;
			}else {
				return COMPUTER;
			}
		}

		//logic to check if draw
		
		int count = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(mArray[i][j].equals("X") || mArray[i][j].equals("0")) {
					count++;
				}				
			}
			if(count==9) {
				return "Draw";
			}
		}
		return "go on";
	}

	//function to print the layout after every step
	
	public static void printArray() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(mArray[i][j]+": ");
			}
			System.out.println("\n---------");
		}
	}

	//static function to run the game and check
	
	public static void runGame() {	
		System.out.println("Computer Turn");
		computerInput();
		printArray();
		String firstCheck = checkWinDraw();
		if(firstCheck.equals("go on")) {
			playerInput();
			printArray();
			String secondCheck = checkWinDraw();
			if(secondCheck.equals("go on")) {
				runGame();
			}else {
				System.out.println(secondCheck);
			}
		}else {
			System.out.println(firstCheck);
		}
	}

	
	
	

	
}