package co.grandcircus.lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Up for a game of Rock, Paper, Scissors?!");
	
		String humanName = Validator.getString(scnr, "Enter your name \n");
		
		HumanPlayer human = new HumanPlayer(humanName, scnr);
		
		System.out.println("Choose your opponent");
		int opponent = Validator.getInt(scnr, "1. JoRanda \n2. Leia\n", 1, 2);

		Player challenger;

		
		if (opponent == 1) {
			challenger = new RandomPlayer("Leia");
			System.out.println("Let's Play!");

		} else {
			challenger = new RandomPlayer("Leia");
			System.out.println("Okay, Let's Play!");
		}

		String choice = "y"; 
		
		do {

			startGame(human, challenger);


			choice  = Validator.getString(scnr, "Would you like to play again?\n");
		} 
		while (choice.matches("y"));

		System.out.println("Thanks for playing Superstar!");

		scnr.close();

	}

	private static void startGame(HumanPlayer human, Player challenger) {
		Roshambo input = human.generateRoshambo();
		Roshambo randomPlayer = challenger.generateRoshambo();

		System.out.println(input);
		System.out.println(randomPlayer);
		theGame(input, randomPlayer);
	}

	public static void theGame(Roshambo input, Roshambo output) {

		if ((input == Roshambo.ROCK && output == Roshambo.ROCK) || (input == Roshambo.PAPER && output == Roshambo.PAPER)
				|| (input == Roshambo.SCISSORS && output == Roshambo.SCISSORS)) {
			System.out.println("It's A Tie!");
		} else if ((input == Roshambo.PAPER && output == Roshambo.ROCK)
				|| (output == Roshambo.PAPER && input == Roshambo.ROCK)) {
			System.out.println(Roshambo.PAPER + " Won!");
		} else if ((input == Roshambo.PAPER && output == Roshambo.SCISSORS)
				|| (output == Roshambo.PAPER && input == Roshambo.SCISSORS)) {
			System.out.println(Roshambo.SCISSORS + " Won!");
		} else if ((input == Roshambo.SCISSORS && output == Roshambo.ROCK)
				|| (input == Roshambo.ROCK && output == Roshambo.SCISSORS)) {
			System.out.println(Roshambo.ROCK + " Won!");
		}
	}
}