import java.util.Scanner;

public class GuessManager 
{
	static int guessCounter = 1;
	static int row = guessCounter-1;
	
	public static void chooseWordle()
	{
		int wordleIndex = (int) (Math.random()*16);
		
		String wordle = WordleProject.wordList[wordleIndex];
		
		System.out.println(wordle);
	}

	public static void UserIsGuessing()
	{
		System.out.println();
		System.out.println("Type in your word guess! 😀");
				
//		int wordleIndex = (int) (Math.random()*16);
//		
//		String wordle = WordleProject.wordList[wordleIndex];
//		
//		System.out.println(wordle);
		
		Scanner userInput = new Scanner(System.in);
		
		String userGuess = userInput.nextLine();
		
		//In the next code, the user's guess is split into single letters and inserted into grid matrix
			
//		if (guessCounter == 1)
//		{
			String [] wordGoingInGrid = userGuess.split("");
			
			row = guessCounter-1;
	
				for (int col = 0; col < GridCode.grid[row].length; col++ )
				{
					GridCode.grid[row][col] = wordGoingInGrid[col];
//					System.out.println(GridCode.grid[row][col]);
				}
						
			guessCounter ++;
			
			//use guess counter in a loop as the row of the grid

//		}
		
	}

}
