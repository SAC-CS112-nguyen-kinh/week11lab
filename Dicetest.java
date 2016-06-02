package week11;

import java.util.Scanner;

public class Dicetest {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numberOfDice;
		int bounces;
		int userGuess;
		int diceRolled;
		int gameWon = 0;
		int gameLoss = 0;
		
		boolean again = true;
		
		Dice game = new Dice();
		
		while(again)
		{
			System.out.printf("Enter number of dice: ");
			numberOfDice = input.nextInt();
			
			System.out.printf("Enter number of bounces: ");
			bounces = input.nextInt();

			diceRolled = game.Throw(numberOfDice, bounces);
			
			System.out.printf("guess points: ");
			userGuess = input.nextInt();
			
			if( userGuess == diceRolled)
			{
				System.out.printf("YOU got it! it was %d\n." , diceRolled);
				gameWon++;
			}
			else
			{
				System.out.printf("You lose! it was %d\n.", diceRolled);
				gameLoss++;
			}
			
			game.history(gameLoss, gameWon);
			
			System.out.printf("\nPress 1 to play again");
			int playAgain = input.nextInt();
			if(playAgain != 1)
				again = false;
		}
		input.close();
	}
}

