
public class CheckingAnswers 
{
	static String [] letterStatus = new String [5];

	public static void checkAnswers()
	{
		String [] splitWordle = GuessManager.staticWordle.split("");
		int letterCounter = 0;
		
		
		for (int i = 0; i < 5; i++)
		{
			
			System.out.println(splitWordle[i]);
			
			//CASE: WHOLE WORD IS CORRECT
			
			if (splitWordle[i].equals(GridCode.grid[GuessManager.row][i]))
			{
				letterCounter++;
			}
			
			if (letterCounter == 5)
			{
				System.out.println("Congrats! You guessed the wordle!");
				//NEED TO END PROGRAM
			}
			
			//CASE: LETTER IS WRONG
			
			if ((splitWordle[i]) != (GridCode.grid[GuessManager.row][i]))
			{
				letterStatus [i] = "X";
			}
			
			//CASE: LETTER IS RIGHT BUT IN WRONG PLACE
					
			
		}

	}

}

//to check the answer, use a for loop and have both the wordle and guess split up
//compare letter by letter with if statements to see whether letters are = to each other
