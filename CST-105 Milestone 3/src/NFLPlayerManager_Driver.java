
public class NFLPlayerManager_Driver {

	/* Created by James Harbison
	 * this program acts as a driver to test the NFLPlayerManager class
	 */
	
	public static void main(String[] args) {
		
		// initialize player array with default size 6 using the no arg constructor
		NFLPlayerManager manager1 = new NFLPlayerManager();
		
		// creates named players following the naming convention of Player 1, Player 2, Player 3, etc...
		for(int i = 0; i < manager1.getNumberOfPlayers(); i++) {
			manager1.createNamedPlayer(i, "Player " + (i + 1));
		}
		
		// sets random values for each property of NFLPlayer
		for(int i = 0; i < manager1.getNumberOfPlayers(); i++) {
			manager1.setPlayerPassYards(i, (int)(Math.random() * 200));
			manager1.setPlayerRushYards(i, (int)(Math.random() * 200));
			manager1.setPlayerGamesPlayed(i, (int)(Math.random() * 10));
			manager1.setPlayerMinutesPlayed(i, (int)(Math.random() * 2000));
			manager1.setPlayerTackles(i, (int)(Math.random() * 25));
			manager1.setPlayerSacks(i, (int)(Math.random() * 10));
			manager1.setPlayerInterceptions(i, (int)(Math.random() * 10));
			manager1.setPlayerFumbles(i, (int)(Math.random() * 10));
		}
		
		// tests the toString method
		System.out.println("No arg constrcutor test\n");
		System.out.println(manager1.toString());
		
		// initialize player array with size 10 using the alternate constructor
		NFLPlayerManager manager2 = new NFLPlayerManager(10);
		
		// initialize player names following convention of Player 10, Player 11, Player 12 etc...
		for(int i = 0; i < manager2.getNumberOfPlayers(); i++) {
			manager2.setPlayerName(i, "Player " + (10 + i));
		}
		
		// sets random values for each property of NFLPlayer
		for(int i = 0; i < manager2.getNumberOfPlayers(); i++) {
			manager2.setPlayerPassYards(i, (int)(Math.random() * 200));
			manager2.setPlayerRushYards(i, (int)(Math.random() * 200));
			manager2.setPlayerGamesPlayed(i, (int)(Math.random() * 10));
			manager2.setPlayerMinutesPlayed(i, (int)(Math.random() * 2000));
			manager2.setPlayerTackles(i, (int)(Math.random() * 25));
			manager2.setPlayerSacks(i, (int)(Math.random() * 10));
			manager2.setPlayerInterceptions(i, (int)(Math.random() * 10));
			manager2.setPlayerFumbles(i, (int)(Math.random() * 10));
		}		
		
		// tests the toString method with manager 2
		System.out.println("\nSize constructor arg test with size 10;\n");
		System.out.println(manager2);
	}
}
