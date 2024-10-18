
public class GridCode 

{
	static String [][] grid = new String [6][5];
	
	//grids are all good to go

	public static void printEmptyGrid()
	{
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
	}
	
	public static void printFirstGuess()
	{
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" : "+CheckingAnswers.letterStatus[0][0]+" | "+grid[GuessManager.row][1]+" : "+CheckingAnswers.letterStatus[0][1]+" | "+grid[GuessManager.row][2]+" : "+CheckingAnswers.letterStatus[0][2]+" | "+grid[GuessManager.row][3]+" : "+CheckingAnswers.letterStatus[0][3]+" | "+grid[GuessManager.row][4]+" : "+CheckingAnswers.letterStatus[0][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
	}
	
	public static void printSecondGuess()
	{
		//PRINTS OUT NULL FOR FIRST WORD
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[0][0]+" : "+CheckingAnswers.letterStatus[0][0]+" | "+grid[0][1]+" : "+CheckingAnswers.letterStatus[0][1]+" | "+grid[0][2]+" : "+CheckingAnswers.letterStatus[0][2]+" | "+grid[0][3]+" : "+CheckingAnswers.letterStatus[0][3]+" | "+grid[0][4]+" : "+CheckingAnswers.letterStatus[0][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" : "+CheckingAnswers.letterStatus[1][0]+" | "+grid[GuessManager.row][1]+" : "+CheckingAnswers.letterStatus[1][1]+" | "+grid[GuessManager.row][2]+" : "+CheckingAnswers.letterStatus[1][2]+" | "+grid[GuessManager.row][3]+" : "+CheckingAnswers.letterStatus[1][3]+" | "+grid[GuessManager.row][4]+" : "+CheckingAnswers.letterStatus[1][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
	}
	
	public static void printThirdGuess()
	{
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[0][0]+" : "+CheckingAnswers.letterStatus[0][0]+" | "+grid[0][1]+" : "+CheckingAnswers.letterStatus[0][1]+" | "+grid[0][2]+" : "+CheckingAnswers.letterStatus[0][2]+" | "+grid[0][3]+" : "+CheckingAnswers.letterStatus[0][3]+" | "+grid[0][4]+" : "+CheckingAnswers.letterStatus[0][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[1][0]+" : "+CheckingAnswers.letterStatus[1][0]+" | "+grid[1][1]+" : "+CheckingAnswers.letterStatus[1][1]+" | "+grid[1][2]+" : "+CheckingAnswers.letterStatus[1][2]+" | "+grid[1][3]+" : "+CheckingAnswers.letterStatus[1][3]+" | "+grid[1][4]+" : "+CheckingAnswers.letterStatus[1][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" : "+CheckingAnswers.letterStatus[2][0]+" | "+grid[GuessManager.row][1]+" : "+CheckingAnswers.letterStatus[2][1]+" | "+grid[GuessManager.row][2]+" : "+CheckingAnswers.letterStatus[2][2]+" | "+grid[GuessManager.row][3]+" : "+CheckingAnswers.letterStatus[2][3]+" | "+grid[GuessManager.row][4]+" : "+CheckingAnswers.letterStatus[2][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
	}
	
	public static void printFourthGuess()
	{
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[0][0]+" : "+CheckingAnswers.letterStatus[0][0]+" | "+grid[0][1]+" : "+CheckingAnswers.letterStatus[0][1]+" | "+grid[0][2]+" : "+CheckingAnswers.letterStatus[0][2]+" | "+grid[0][3]+" : "+CheckingAnswers.letterStatus[0][3]+" | "+grid[0][4]+" : "+CheckingAnswers.letterStatus[0][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[1][0]+" : "+CheckingAnswers.letterStatus[1][0]+" | "+grid[1][1]+" : "+CheckingAnswers.letterStatus[1][1]+" | "+grid[1][2]+" : "+CheckingAnswers.letterStatus[1][2]+" | "+grid[1][3]+" : "+CheckingAnswers.letterStatus[1][3]+" | "+grid[1][4]+" : "+CheckingAnswers.letterStatus[1][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[2][0]+" : "+CheckingAnswers.letterStatus[2][0]+" | "+grid[2][1]+" : "+CheckingAnswers.letterStatus[2][1]+" | "+grid[2][2]+" : "+CheckingAnswers.letterStatus[2][2]+" | "+grid[2][3]+" : "+CheckingAnswers.letterStatus[2][3]+" | "+grid[2][4]+" : "+CheckingAnswers.letterStatus[2][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" : "+CheckingAnswers.letterStatus[3][0]+" | "+grid[GuessManager.row][1]+" : "+CheckingAnswers.letterStatus[3][1]+" | "+grid[GuessManager.row][2]+" : "+CheckingAnswers.letterStatus[3][2]+" | "+grid[GuessManager.row][3]+" : "+CheckingAnswers.letterStatus[3][3]+" | "+grid[GuessManager.row][4]+" : "+CheckingAnswers.letterStatus[3][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
	}
	
	public static void printFifthGuess()
	{
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[0][0]+" : "+CheckingAnswers.letterStatus[0][0]+" | "+grid[0][1]+" : "+CheckingAnswers.letterStatus[0][1]+" | "+grid[0][2]+" : "+CheckingAnswers.letterStatus[0][2]+" | "+grid[0][3]+" : "+CheckingAnswers.letterStatus[0][3]+" | "+grid[0][4]+" : "+CheckingAnswers.letterStatus[0][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[1][0]+" : "+CheckingAnswers.letterStatus[1][0]+" | "+grid[1][1]+" : "+CheckingAnswers.letterStatus[1][1]+" | "+grid[1][2]+" : "+CheckingAnswers.letterStatus[1][2]+" | "+grid[1][3]+" : "+CheckingAnswers.letterStatus[1][3]+" | "+grid[1][4]+" : "+CheckingAnswers.letterStatus[1][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[2][0]+" : "+CheckingAnswers.letterStatus[2][0]+" | "+grid[2][1]+" : "+CheckingAnswers.letterStatus[2][1]+" | "+grid[2][2]+" : "+CheckingAnswers.letterStatus[2][2]+" | "+grid[2][3]+" : "+CheckingAnswers.letterStatus[2][3]+" | "+grid[2][4]+" : "+CheckingAnswers.letterStatus[2][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[3][0]+" : "+CheckingAnswers.letterStatus[3][0]+" | "+grid[3][1]+" : "+CheckingAnswers.letterStatus[3][1]+" | "+grid[3][2]+" : "+CheckingAnswers.letterStatus[3][2]+" | "+grid[3][3]+" : "+CheckingAnswers.letterStatus[3][3]+" | "+grid[3][4]+" : "+CheckingAnswers.letterStatus[3][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" : "+CheckingAnswers.letterStatus[4][0]+" | "+grid[GuessManager.row][1]+" : "+CheckingAnswers.letterStatus[4][1]+" | "+grid[GuessManager.row][2]+" : "+CheckingAnswers.letterStatus[4][2]+" | "+grid[GuessManager.row][3]+" : "+CheckingAnswers.letterStatus[4][3]+" | "+grid[GuessManager.row][4]+" : "+CheckingAnswers.letterStatus[4][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("|       |       |       |       |       |");
		System.out.println("-----------------------------------------");
	}
	
	public static void printSixthGuess()
	{
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[0][0]+" : "+CheckingAnswers.letterStatus[0][0]+" | "+grid[0][1]+" : "+CheckingAnswers.letterStatus[0][1]+" | "+grid[0][2]+" : "+CheckingAnswers.letterStatus[0][2]+" | "+grid[0][3]+" : "+CheckingAnswers.letterStatus[0][3]+" | "+grid[0][4]+" : "+CheckingAnswers.letterStatus[0][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[1][0]+" : "+CheckingAnswers.letterStatus[1][0]+" | "+grid[1][1]+" : "+CheckingAnswers.letterStatus[1][1]+" | "+grid[1][2]+" : "+CheckingAnswers.letterStatus[1][2]+" | "+grid[1][3]+" : "+CheckingAnswers.letterStatus[1][3]+" | "+grid[1][4]+" : "+CheckingAnswers.letterStatus[1][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[2][0]+" : "+CheckingAnswers.letterStatus[2][0]+" | "+grid[2][1]+" : "+CheckingAnswers.letterStatus[2][1]+" | "+grid[2][2]+" : "+CheckingAnswers.letterStatus[2][2]+" | "+grid[2][3]+" : "+CheckingAnswers.letterStatus[2][3]+" | "+grid[2][4]+" : "+CheckingAnswers.letterStatus[2][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[3][0]+" : "+CheckingAnswers.letterStatus[3][0]+" | "+grid[3][1]+" : "+CheckingAnswers.letterStatus[3][1]+" | "+grid[3][2]+" : "+CheckingAnswers.letterStatus[3][2]+" | "+grid[3][3]+" : "+CheckingAnswers.letterStatus[3][3]+" | "+grid[3][4]+" : "+CheckingAnswers.letterStatus[3][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[4][0]+" : "+CheckingAnswers.letterStatus[4][0]+" | "+grid[4][1]+" : "+CheckingAnswers.letterStatus[4][1]+" | "+grid[4][2]+" : "+CheckingAnswers.letterStatus[4][2]+" | "+grid[4][3]+" : "+CheckingAnswers.letterStatus[4][3]+" | "+grid[4][4]+" : "+CheckingAnswers.letterStatus[4][4]+" |");
		System.out.println("-----------------------------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" : "+CheckingAnswers.letterStatus[5][0]+" | "+grid[GuessManager.row][1]+" : "+CheckingAnswers.letterStatus[5][1]+" | "+grid[GuessManager.row][2]+" : "+CheckingAnswers.letterStatus[5][2]+" | "+grid[GuessManager.row][3]+" : "+CheckingAnswers.letterStatus[5][3]+" | "+grid[GuessManager.row][4]+" : "+CheckingAnswers.letterStatus[5][4]+" |");
		System.out.println("-----------------------------------------");
	}
	
	
	
}
