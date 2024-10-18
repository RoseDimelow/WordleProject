import java.util.Scanner;

public class GuessManager 
{
	static int guessCounter = 1;
	static int row = guessCounter-1;
	static String staticWordle = chooseWordle();
	
	public static String chooseWordle()
	{
		int wordleIndex = (int) (Math.random()*3102);
		
		String wordle = WordleProject.wordList[wordleIndex];
		
		String [] splitWordle = wordle.split("");
		
		return wordle;
	}

	public static void userIsGuessing()
	{
		System.out.println();
		System.out.println("Type in your word guess! 😀");
				
//		System.out.println(wordle);
		
		Scanner userInput = new Scanner(System.in);
		
		String userGuess = userInput.nextLine();
		
		if (userGuess.length() != 5)
		{
			System.out.println("Hey! That wasn't 5 letters long!");
			System.exit(0);
		}
		
		//In the next code, the user's guess is split into single letters and inserted into grid matrix

		String [] wordGoingInGrid = userGuess.split("");
			
		row = guessCounter-1;
	
			for (int col = 0; col < GridCode.grid[row].length; col++ )
			{
				GridCode.grid[row][col] = wordGoingInGrid[col];
//				System.out.println(GridCode.grid[row][col]);
			}
						
		guessCounter ++;
			
			//use guess counter in a loop as the row of the grid

	}

}
