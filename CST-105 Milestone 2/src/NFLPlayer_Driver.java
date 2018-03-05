
public class NFLPlayer_Driver {

	/* Created by James Harbison
	 * This program serves as a driver for testing the NFLPlayer.java class
	 */
	
	public static void main(String[] args) {
	
		// initialize new NFLPlayer using no argument constructor
		NFLPlayer player1 = new NFLPlayer();
		
		// initialize new NFLPlayer using all argument constructor
		NFLPlayer player2 = new NFLPlayer("Player 2", 20, 10, 3, 200, 1, 0, 5, 2, 30);
		
		// sets several properties using setters for the NFLPlayer created using no argument constructor
		player1.setName("Player 1");
		player1.setRushYards(20);		
		player1.setFumbles(2);		
		player1.setGamesPlayed(3);
		player1.setPassYards(45);
		player1.setMinutesPlayed(120);
		
		// System outputs several statements testing getters and several calculations housed in the NFLPlayer.java class
		System.out.println(player1.getName() + " has " + player1.getTotalYards() + " total yards with " + 
				player1.getYardsPerGame() + " yards per game");	
		System.out.println(player1.getName() + " has played " +player1.getMinutesPlayed() + " minutes with "+ 
				player1.getMinutesPerGame() + " minutes per game");	
		System.out.println(player1.getName() + " has " + player1.getFumbles() + " fumbles with "+ 
				player1.getFumblesPerGame() + " fumbles per game\n\n");	
		
		// tests the output of the toString function with the information from the NFLPlayer created with all argument constructor
		System.out.println(player2.toString());
		
	}
}
