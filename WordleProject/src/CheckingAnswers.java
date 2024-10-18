
public class CheckingAnswers 
{
	static String[][] letterStatus = new String [6][5];
	static boolean userHasWon = false;


	public static void checkAnswers()
	{
		String [] splitWordle = GuessManager.staticWordle.split("");
		
		int letterCounter = 0;	
				
		for (int i = 0; i < 5; i++)
		{
			
//			System.out.println(splitWordle[i]);
			
			//CASE: LETTER IS CORRECT
			
			if (splitWordle[i].equals(GridCode.grid[GuessManager.row][i]))
			{
				letterCounter++;
//				letterStatus [GuessManager.row][i] = "✔";
				letterStatus [GuessManager.row][i] = "♥";
			}
	
			//CASE: LETTER IS IN WRONG PLACE
			
			else if ((splitWordle[i]) != (GridCode.grid[GuessManager.row][i]))
			{
				
			//CASE: LETTER IS RIGHT BUT IN WRONG PLACE

				if (GuessManager.staticWordle.contains(GridCode.grid[GuessManager.row][i]))
				{
					letterStatus [GuessManager.row][i] = "*";
				}
				
			//CASE: LETTER IS COMPLETELY WRONG
				
				else
				{
					letterStatus [GuessManager.row][i] = "X";
				}
				
			}
			
			//CASE: WHOLE WORD IS CORRECT
			
			if (letterCounter == 5)
			{
				System.out.println("Congrats! You guessed the wordle!");
				userHasWon = true;
			}	
					
		}

	}
	
	public static void checkIfGameIsGoing()
	{

		if ((GuessManager.guessCounter == 7) && (! userHasWon))
		{
			System.out.println("Sorry, you have run out of guesses. Better luck next time!");
			System.exit(0);
		}
		
		if (userHasWon)
		{
			System.exit(0);
		}
	}

}

