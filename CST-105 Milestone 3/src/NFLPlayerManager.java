
public class NFLPlayerManager {

	/* Created by James Harbison
	 * this program creates an array of NFLPlayers and manages them, it can set and get properties, return the 
	 * index of a specified player based on name and display all players in the array
	 */
	
	// initialize variables
	private int playerSelector;
	private NFLPlayer[] player;
	private int numberOfPlayers;
	private String stringValue;
	
	// no arg constructor initializes an array of size 6
	public NFLPlayerManager() {
		player = new NFLPlayer[6];
		createPlayers();
		numberOfPlayers = 6;
	}
	
	// a constructor that initializes an array of a specified size
	public NFLPlayerManager(int size) {	
		player = new NFLPlayer[size];
		numberOfPlayers = size;
		createPlayers();
	}
	
	// creates default players using the no arg constructor
	void createPlayers() {
		for(int i = 0; i < numberOfPlayers; i++) {
			player[i] = new NFLPlayer();
		}
	}
	
	// creates named players with default stats
	void createNamedPlayer(int i, String name) {
		player[i] = new NFLPlayer(name);
	}
	
	// creates players with all stats set
	void createCompletePlayer(int i, String name, int pass, int rush, int games, int minutes, int tack, int saks, int intercept, int fum, int yards) {
		player[i] = new NFLPlayer(name, pass, rush, games, minutes, tack, saks, intercept, fum, yards);
	}
	
	// sets the player name
	void setPlayerName(int i, String name) {
		player[i].setName(name);
	}
	
	// returns the player name
	String getPlayerName(int i) {
		return player[i].getName();
	}
	
	// sets the passing yards and also updates the total yards
	void setPlayerPassYards(int i, int a) {
		player[i].setPassYards(a);
	}
	
	// returns the passing yards
	int getPlayerPassYards(int i) {
		return player[i].getPassYards();
	}
	
	// sets the rushing yards and also updates the total yards
	void setPlayerRushYards(int i, int a) {
		player[i].setRushYards(a);
	}
	
	// returns the rushing yards
	int getPlayerRushYards(int i) {
		return player[i].getRushYards();
	}
	
	// sets the games played
	void setPlayerGamesPlayed(int i, int a) {
		player[i].setGamesPlayed(a);
	}
	
	// returns the games played
	int getPlayerGamesPlayed(int i) {
		return player[i].getGamesPlayed();
	}
	
	// sets minutes played
	void setPlayerMinutesPlayed(int i, int a) {
		player[i].setMinutesPlayed(a);
	}
	
	// returns minutes played
	int getPlayerMinutesPlayed(int i) {
		return player[i].getMinutesPlayed();
	}
	
	// sets total yards
	void setPlayerTotalYards(int i, int a) {
		player[i].setTotalYards(a);
	}
	
	// returns total yards
	int getPlayerTotalYards(int i) {
		return player[i].getTotalYards();
	}
	
	// returns yards per game, if no games are played returns 0
	double getPlayerYardsPerGame(int i) {
		return player[i].getYardsPerGame();
	}
	
	// returns minutes per game, if no games are played returns 0
	double getPlayerMinutesPerGame(int i) {
		return player[i].getMinutesPerGame();
	}
	
	// sets tackles
	void setPlayerTackles(int i, int a) {
		player[i].setTackles(a);
	}
	
	// returns tackles
	int getPlayerTackles(int i) {
		return player[i].getTackles();
	}
	
	// sets sacks
	void setPlayerSacks(int i, int a) {
		player[i].setSacks(a);
	}
	
	// returns sacks
	int getPlayerSacks(int i) {
		return player[i].getSacks();
	}
	
	// sets interceptions
	void setPlayerInterceptions(int i, int a) {
		player[i].setInterceptions(a);
	}
	
	// returns interceptions
	int getPlayerInterceptions(int i) {
		return player[i].getInterceptions();
	}
	
	// sets fumbles
	void setPlayerFumbles(int i, int a) {
		player[i].setFumbles(a);
	}
	
	// returns fumbles
	int getPlayerFumbles(int i) {
		return player[i].getFumbles();
	}
	
	// returns tackles per game counting both tackles and sacks as a tackle, if no games are played returns 0
	double getPlayerTacklesPerGame(int i) {
		return player[i].getTacklesPerGame();
	}
	
	// returns fumbles per game, if no games are played returns 0
	double getPlayerFumblesPerGame(int i) {
		return player[i].getFumblesPerGame();
	}
	
	// returns interceptions per game, if no games are played returns 0
	double getPlayerInterceptionsPerGame(int i) {
		return player[i].getInterceptionsPerGame();
	}
	
	// returns sacks per game, if no games are played returns 0
	double getPlayerSacksPerGame(int i) {
		return player[i].getSacksPerGame();
	}

	// returns the number of players in the array
	int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	// returns the array ID number of a player searched by name, if no player is matched by the name, returns -1 and displays error message
	int getPlayerID(String name) {
		playerSelector = -1;
		
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].getName().toUpperCase().equals(name.toUpperCase())) {
				playerSelector = i;
				i = numberOfPlayers + 1; // breaks the loop to stop searching for players
			}
		}
			
		if(playerSelector == -1) {
			System.out.println("No player named " + name + " found");
		}
		return playerSelector;
	}
	
	// creates a string value of all the players organized in tabular form 
	public String toString() {
		
		stringValue = "Player Name\t";		
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getName() + "\t";
		}
		stringValue = stringValue + "\nPassing Yards\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getPassYards() + "\t\t";
		}
		stringValue = stringValue + "\nRushing Yards\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getRushYards() + "\t\t";
		}
		stringValue = stringValue + "\nGamesPlayed\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getGamesPlayed() + "\t\t";
		}
		stringValue = stringValue + "\nMinutes Played\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getMinutesPlayed() + "\t\t";
		}
		stringValue = stringValue + "\nTackles\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getTackles() + "\t\t";
		}
		stringValue = stringValue + "\nSacks\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getSacks() + "\t\t";
		}
		stringValue = stringValue + "\nInterceptions\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getInterceptions() + "\t\t";
		}
		stringValue = stringValue + "\nFumbles\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getFumbles() + "\t\t";
		}
		stringValue = stringValue + "\nTotal Yards\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			stringValue = stringValue + player[i].getTotalYards() + "\t\t";
		}
		
		return stringValue;
	}
}

