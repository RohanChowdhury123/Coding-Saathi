package com.rohan_javaInternshipTasks;
import java.util.Scanner;
public class GuessTheNumber {
	void numberGuessingGame() {
		Scanner sc = new Scanner (System.in); 
		int randomNumber = (int)(Math.random()*100)+1;
		int userGuess;
		int numberOfGuesses=0;
		System.out.println("<<<----WELCOME TO THE NUMBER GUESSING GAME---->>>");
		System.out.println("THERE IS A NUMBER IN BETWEEN 1 AND 100. CAN YOU GUESS???");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* \n");
		do {
			System.out.println("ENTER YOUR GUESS : ");
			userGuess=sc.nextInt();
			numberOfGuesses++;
				if(userGuess<randomNumber) {
					System.out.println("THE NUMBER YOU HAVE GUESSED IS SMALLER THAN THE TARGET NUMBER....TRY AGAIN!!! ");	
				}
				else if(userGuess>randomNumber) {
					System.out.println("THE NUMBER YOU HAVE GUESSED IS LARGER THAN THE TARGET NUMBER....TRY AGAIN!!! ");	
				}
				else {
				System.out.println("CONGRATULATIONS!!!  YOU HAVE GUESSED THE TARGET NUMBER ON: "+numberOfGuesses+"th  GUESS.");	
				}
			}while (userGuess!=randomNumber);  
		sc.close();
	}
	public static void main(String[] args) {
		GuessTheNumber obj = new GuessTheNumber();
		obj.numberGuessingGame();
	}
}
