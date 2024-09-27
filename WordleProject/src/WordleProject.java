import java.util.Scanner;

public class WordleProject 
{

	public static void main(String[] args) 
	{
		greetUser();
		GridCode.printGrid();

		String [] wordList = {"AMBER", "AGILE", "BIOME", "BRISK", "COURT", "DEBUG", "FLOSS", "FORGE", "GLIDE", "GUPPY", "MAPLE", "SPELL", "TWIRL", "ZESTY", "RAINY", "QUERY"};
	}
	
	public static void greetUser()
	{
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Hello there! Welcome to the game of Wordle where you have to guess the computer's secret word.");
		System.out.println("Do you know how to play?");
		System.out.println("A: Yes");
		System.out.println("B: No");
		
		String userChoice = userInput.nextLine();
		
		if (userChoice.equals("A") || userChoice.equals("a"))
		{
			System.out.println("Ok then; let's start!");
		}
		
		else if (userChoice.equals("B") || userChoice.equals("b"))
		{
			System.out.println("Here's how to play:");
			System.out.println("You have to guess the wordle in 6 tries.");
			System.out.println("Letters from the word that you use as your guess can either be in the right place, the right letter in the wrong place, or completely wrong.");
			System.out.println("Good luck!");
		}
		
			System.out.println();	
	}

	//brainstorming:
	//need: classes and matrix
	//need: grid
}
