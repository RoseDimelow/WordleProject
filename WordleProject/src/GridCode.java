
public class GridCode 

{
	static String [][] grid = new String [5][6];

	public static void printGrid()
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
		
		if (GuessManager.guessCounter > 0)
		{
			System.out.println("--------------------------");
			System.out.println("| +" "+ | ++ | ++ | ++ | ++ |");
			System.out.println("--------------------------");
			System.out.println("| ++ | ++ | ++ | ++ | ++ |");
			System.out.println("--------------------------");
			System.out.println("| ++ | ++ | ++ | ++ | ++ |");
			System.out.println("--------------------------");
			System.out.println("| ++ | ++ | ++ | ++ | ++ |");
			System.out.println("--------------------------");
			System.out.println("| ++ | ++ | ++ | ++ | ++ |");
			System.out.println("--------------------------");
			System.out.println("| ++ | ++ | ++ | ++ | ++ |");
			System.out.println("--------------------------");
			
		}
	}
	
	
}
