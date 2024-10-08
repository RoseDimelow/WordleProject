
public class CheckingAnswers 
{
	static String[][] letterStatus = new String [6][5];

	public static void checkAnswers()
	{
		String [] splitWordle = GuessManager.staticWordle.split("");
		int letterCorrectCounter = 0;
		
		int letterCounter = 0;
		
		
		for (int i = 0; i < 5; i++)
		{
			
//			System.out.println(splitWordle[i]);
			
			//CASE: LETTER IS CORRECT (THIS PART WORKS)
			
			if (splitWordle[i].equals(GridCode.grid[GuessManager.row][i]))
			{
				letterCorrectCounter++;
				letterStatus [GuessManager.row][i] = "✔";
			}
	
			//CASE: LETTER IS IN WRONG PLACE
			
			else if ((splitWordle[i]) != (GridCode.grid[GuessManager.row][i]))
			{
				letterCounter = 0;
				for (int j = 0; j < 5; j++)
				{
					if (splitWordle[j].equals(splitWordle[i]))
					{
						letterCounter++;
						System.out.println(letterCounter);
					}
				}
				
				//CASE: LETTER IS RIGHT BUT IN WRONG PLACE
				
				if (letterCounter != 0)
				{
					letterStatus [GuessManager.row][i] = "*";
					//USE .contains() METHOD ON THE WORDLE AS A STRING
				}
				
				//CASE: LETTER IS COMPLETELY WRONG
				
				else if (letterCounter == 0)
				{
					letterStatus [GuessManager.row][i] = "X";
				}
				
			}
			
			//CASE: WHOLE WORD IS CORRECT
			
			if (letterCorrectCounter == 5)
			{
				System.out.println("Congrats! You guessed the wordle!");
				WordleProject.userIsPlaying = false;
			}		
			
		}

	}

}

//to check the answer, use a for loop and have both the wordle and guess split up
//compare letter by letter with if statements to see whether letters are = to each other
