/* Class: CMSC203 
 * Instructor:Robert Alexander
 * Description: Build an application that will receive a guess and report if 
				your guess is the random number that was generated.  Your application 
				will narrow down the choices according to your previous guesses and 
				continue to prompt you to enter a guess until you guess correctly.  
 * Due: 09/30/2021
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Xiaozi Wang_
*/

import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		String answer = "";
		
		do {
			Scanner input = new Scanner(System.in);
			int randNum, nextGuess, lowGuess = 0, highGuess = 100;
			
		//call method rand to created random nubmer
		randNum = RNG.rand();
		//set count equal 0
		RNG.resetCount();
		//display message that user can make a guess
		
		System.out.println("Enter your first guess");
		nextGuess = input.nextInt();
		//determine what status the nextGuess is 
		while (nextGuess != randNum) {
			RNG.inputValidation(nextGuess, lowGuess, highGuess);
		
			System.out.println("Number of guesses is " + RNG.getCount());
		
			if(nextGuess > randNum) {
				System.out.println("Your guess is too high");
				highGuess = nextGuess;
			}
			else if (nextGuess < randNum) {
				System.out.println("Your guess is too low");
				lowGuess = nextGuess;
		}
		
		System.out.println("Enter your next between " + lowGuess + " and " + highGuess + " ");
		nextGuess = input.nextInt();
		}
		//output message 
		System.out.println("Number of guesses is " + RNG.getCount());
		System.out.println("Congratulation, you guessed correctly");
		System.out.println("Try again?(yes or no) ");
		// user's input
		input.nextLine();
		answer = input.nextLine();
		
		}while(answer.equals("yes"));
		
		System.out.println("Thanks for playing...");
	
	}

}
