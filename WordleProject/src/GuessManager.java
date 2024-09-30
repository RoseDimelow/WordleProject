import java.util.Scanner;

public class GuessManager 
{
	static int guessCounter = 1;
	public static void firstGuess()
	{
		System.out.println();
		System.out.println("Type in your word guess!");
				
		int wordleIndex = (int) (Math.random()*17);
		
		String wordle = WordleProject.wordList[wordleIndex];
		
		Scanner userInput = new Scanner(System.in);
		
		String userGuess = userInput.nextLine();
		
			
		if (guessCounter == 1)
		{
			
			String [] wordGoingInGrid = userGuess.split("");
			for (int i = 0; i <= 4; i++)
			{
				
				for (int col = 0; col < GridCode.grid[0].length; col++ )
				{
					GridCode.grid[0][col] = wordGoingInGrid[i];
//					System.out.println(GridCode.grid[0][col]));
				}

			}
						
			guessCounter ++;
			
			//use guess counter in a loop as the row of the grid

		}
		
	}

}
