package com.numbergame;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
	 
		//This is My Task 1:Codsoft Internship-Java Programming
		   Scanner scanner = new Scanner(System.in);
		   Random random = new Random();
		        
		   boolean playagain = true;
		        
		        while (playagain) {
		            int start = 1;
		            int end = 100;
		            
		            int randomno = random.nextInt(end - start + 1) + start; //To generate a Random number
		            
		            int attempts = 0; //number of loop or attempts
		            
		            boolean computerNumber = false;
		            
		            System.out.println("Welcome to the Number Game!");
		            System.out.println("I have selected a number between " + start + " and " + end);
		            System.out.println("Try to guess it!");
		            
		            while (!computerNumber) {
		                System.out.print("Enter your guess: ");
		                int usersGuess = scanner.nextInt();
		                attempts++;
		                
		                if (usersGuess < randomno) {
		                    System.out.println("The Number is too low");
		                } else if (usersGuess > randomno) {
		                    System.out.println("The number is too high.");
		                } else {
		                    computerNumber = true;
		                    System.out.println("Congratulations!" + "You Guessed right!..." );
		                    System.out.println("You've guessed the number " + randomno + " in " + attempts + " attempts.");
		                }
		            }
		            
		            System.out.print("Do you want to play again? (yes/no): ");
		            String userResponse = scanner.next();
		            playagain = userResponse.equalsIgnoreCase("yes"); //play again 
		        }
		        // if no then print->
		        
		        System.out.println("Thanks for playing! Goodbye.");
		      
		    }
}

		
		




