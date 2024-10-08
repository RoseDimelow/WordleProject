import java.util.Scanner;

public class WordleProject 
{
	static String [] wordList = {"amber", "agile", "biome", "brisk", "court", "debug", "floss", "forge", "glide", "guppy", "maple", "spell", "twirl", "zesty", "rainy", "query"};
	static boolean userIsPlaying = true;

	public static void main(String[] args) 
	{
//		greetUser();
//		GuessManager.chooseWordle();
		
		//NEED TO ADD A WHILE LOOP FOR WHILE THE USER IS PLAYING SO I CAN STOP THE GAME AT SPECIFIC PLACES IN OTHER METHODS
		userIsPlaying = true;

		while (userIsPlaying == true)
		{
		GridCode.printEmptyGrid();
		GuessManager.UserIsGuessing();
		CheckingAnswers.checkAnswers();
		GridCode.printFirstGuess();
		
		GuessManager.UserIsGuessing();
		CheckingAnswers.checkAnswers();
		GridCode.printSecondGuess();
		
		GuessManager.UserIsGuessing();
		CheckingAnswers.checkAnswers();
		GridCode.printThirdGuess();
		
		GuessManager.UserIsGuessing();
		CheckingAnswers.checkAnswers();
		GridCode.printFourthGuess();
		
		GuessManager.UserIsGuessing();
		CheckingAnswers.checkAnswers();
		GridCode.printFifthGuess();
		
		GuessManager.UserIsGuessing();
		CheckingAnswers.checkAnswers();
		GridCode.printSixthGuess();
		}
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
			System.out.println("You have to guess the 5-letter wordle in 6 tries.");
			System.out.println("Letters from the word that you use as your guess can either be in the right place, the right letter in the wrong place, or completely wrong.");
			System.out.println("Good luck!");
		}
		
			System.out.println();	
	}

	
}
