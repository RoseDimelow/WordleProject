
public class GridCode 

{
	static String [][] grid = new String [6][5];

	public static void printEmptyGrid()
	{		
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	
	public static void printFirstGuess()
	{
		
		System.out.println("---------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" | "+grid[GuessManager.row][1]+" | "+grid[GuessManager.row][2]+" | "+grid[GuessManager.row][3]+" | "+grid[GuessManager.row][4]+" |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	
	public static void printSecondGuess()
	{
		System.out.println("---------------------");
		System.out.println("| "+grid[0][0]+" | "+grid[0][1]+" | "+grid[0][2]+" | "+grid[0][3]+" | "+grid[0][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" | "+grid[GuessManager.row][1]+" | "+grid[GuessManager.row][2]+" | "+grid[GuessManager.row][3]+" | "+grid[GuessManager.row][4]+" |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	
	public static void printThirdGuess()
	{
		System.out.println("---------------------");
		System.out.println("| "+grid[0][0]+" | "+grid[0][1]+" | "+grid[0][2]+" | "+grid[0][3]+" | "+grid[0][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[1][0]+" | "+grid[1][1]+" | "+grid[1][2]+" | "+grid[1][3]+" | "+grid[1][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" | "+grid[GuessManager.row][1]+" | "+grid[GuessManager.row][2]+" | "+grid[GuessManager.row][3]+" | "+grid[GuessManager.row][4]+" |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	
	public static void printFourthGuess()
	{
		System.out.println("---------------------");
		System.out.println("| "+grid[0][0]+" | "+grid[0][1]+" | "+grid[0][2]+" | "+grid[0][3]+" | "+grid[0][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[1][0]+" | "+grid[1][1]+" | "+grid[1][2]+" | "+grid[1][3]+" | "+grid[1][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[2][0]+" | "+grid[2][1]+" | "+grid[2][2]+" | "+grid[2][3]+" | "+grid[2][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" | "+grid[GuessManager.row][1]+" | "+grid[GuessManager.row][2]+" | "+grid[GuessManager.row][3]+" | "+grid[GuessManager.row][4]+" |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	
	public static void printFifthGuess()
	{
		System.out.println("---------------------");
		System.out.println("| "+grid[0][0]+" | "+grid[0][1]+" | "+grid[0][2]+" | "+grid[0][3]+" | "+grid[0][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[1][0]+" | "+grid[1][1]+" | "+grid[1][2]+" | "+grid[1][3]+" | "+grid[1][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[2][0]+" | "+grid[2][1]+" | "+grid[2][2]+" | "+grid[2][3]+" | "+grid[2][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[3][0]+" | "+grid[3][1]+" | "+grid[3][2]+" | "+grid[3][3]+" | "+grid[3][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" | "+grid[GuessManager.row][1]+" | "+grid[GuessManager.row][2]+" | "+grid[GuessManager.row][3]+" | "+grid[GuessManager.row][4]+" |");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	
	public static void printSixthGuess()
	{
		System.out.println("---------------------");
		System.out.println("| "+grid[0][0]+" | "+grid[0][1]+" | "+grid[0][2]+" | "+grid[0][3]+" | "+grid[0][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[1][0]+" | "+grid[1][1]+" | "+grid[1][2]+" | "+grid[1][3]+" | "+grid[1][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[2][0]+" | "+grid[2][1]+" | "+grid[2][2]+" | "+grid[2][3]+" | "+grid[2][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[3][0]+" | "+grid[3][1]+" | "+grid[3][2]+" | "+grid[3][3]+" | "+grid[3][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[4][0]+" | "+grid[4][1]+" | "+grid[4][2]+" | "+grid[4][3]+" | "+grid[4][4]+" |");
		System.out.println("---------------------");
		System.out.println("| "+grid[GuessManager.row][0]+" | "+grid[GuessManager.row][1]+" | "+grid[GuessManager.row][2]+" | "+grid[GuessManager.row][3]+" | "+grid[GuessManager.row][4]+" |");
		System.out.println("---------------------");
	}
	
	
	
}
