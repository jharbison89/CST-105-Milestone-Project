
public class NFLPlayerManager_Driver {

	/* Created by James Harbison
	 * this program acts as a driver to test the NFLPlayerManager class
	 */
	
	public static void main(String[] args) {
		
		// initialize player array with default size 6 using the no arg constructor
		NFLPlayerManager manager1 = new NFLPlayerManager();
		
		// creates named players following the naming convention of Player 1, Player 2, Player 3, etc...
		for(int i = 0; i < manager1.getNumberOfPlayers()/2; i++) {
			manager1.createOffensiveNamedPlayer(i, "Player " + (i + 1));
		}
		for(int i = manager1.getNumberOfPlayers()/2; i < manager1.getNumberOfPlayers(); i++) {
			manager1.createDefensiveNamedPlayer(i, "Player " + (i + 1));
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
		System.out.println("\nNo arg constrcutor test\n");
		System.out.println(manager1.toString());
		
	}
}
