
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
		//creates half of available players as offensive players
		for(int i = 0; i < numberOfPlayers/2; i++) {
			player[i] = new NFLOffensivePlayer();
		}
		//creates half of available players as defensive players
		for(int i = numberOfPlayers/2; i < numberOfPlayers; i++) {
			player[i] = new NFLDefensivePlayer();
		}
	}
	
	// creates named offensive player with default stats
	void createOffensiveNamedPlayer(int i, String name) {
		player[i] = new NFLOffensivePlayer(name);
	}
	
	// creates named defensive player with default stats
		void createDefensiveNamedPlayer(int i, String name) {
			player[i] = new NFLDefensivePlayer(name);
		};
	// creates offensive player with all stats set
	void createCompleteOffensivePlayer(int i, String name, int passYards, int rushYards, int totalYards, int fumbles, int gamesPlayed, int minutesPlayed) {
		player[i] = new NFLOffensivePlayer(name, passYards, rushYards, totalYards, fumbles, gamesPlayed, minutesPlayed);
	}
	
	//created defensive player with all stats set
	void createCompleteDefensivePlayer(int i, String name, int tackles, int sacks, int interceptions, int fumbles, int gamesPlayed, int minutesPlayed) {
		player[i] = new NFLDefensivePlayer(name, tackles, sacks, interceptions, fumbles, gamesPlayed, minutesPlayed);
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
		if(player[i].isOffensive()) {
			((NFLOffensivePlayer) player[i]).setPassYards(a);
		}
	}
	
	// returns the passing yards
	int getPlayerPassYards(int i) {
		if(player[i].isOffensive()) {
			return ((NFLOffensivePlayer) player[i]).getPassYards();
		}
		else{
			return 0;
		}
	}
	
	// sets the rushing yards and also updates the total yards
	void setPlayerRushYards(int i, int a) {
		if(player[i].isOffensive()) {
			((NFLOffensivePlayer) player[i]).setRushYards(a);
		};
	}
	
	// returns the rushing yards
	int getPlayerRushYards(int i) {
		if(player[i].isOffensive()) {
			return ((NFLOffensivePlayer) player[i]).getRushYards();
		}
		else{
			return 0;
		}
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
		if(player[i].isOffensive()) {
			((NFLOffensivePlayer) player[i]).setTotalYards(a);
		}
	}
	
	// returns total yards
	int getPlayerTotalYards(int i) {
		if(player[i].isOffensive()) {
			return ((NFLOffensivePlayer) player[i]).getTotalYards();
		}
		else{
			return 0;
		}
	}
	
	// returns yards per game, if no games are played returns 0
	double getPlayerYardsPerGame(int i) {
		if(player[i].isOffensive()) {
			return ((NFLOffensivePlayer) player[i]).getYardsPerGame();
		}
		else{
			return 0;
		}	}
	
	// returns minutes per game, if no games are played returns 0
	double getPlayerMinutesPerGame(int i) {
		return player[i].getMinutesPerGame();
	}
	
	// sets tackles
	void setPlayerTackles(int i, int a) {
		if(player[i].isDefensive()) {
			((NFLDefensivePlayer) player[i]).setTackles(a);
		}
	}
	
	// returns tackles
	int getPlayerTackles(int i) {
		if(player[i].isDefensive()) {
			return ((NFLDefensivePlayer) player[i]).getTackles();
		}
		else{
			return 0;
		}
	}
	
	// sets sacks
	void setPlayerSacks(int i, int a) {
		if(player[i].isDefensive()) {
			((NFLDefensivePlayer) player[i]).setSacks(a);
		}
	}
	
	// returns sacks
	int getPlayerSacks(int i) {
		if(player[i].isDefensive()) {
			return ((NFLDefensivePlayer) player[i]).getSacks();
		}
		else{
			return 0;
		}	
	}
	
	// sets interceptions
	void setPlayerInterceptions(int i, int a) {
		if(player[i].isDefensive()) {
			((NFLDefensivePlayer) player[i]).setInterceptions(a);
		}
	}
	
	// returns interceptions
	int getPlayerInterceptions(int i) {
		if(player[i].isDefensive()) {
			return ((NFLDefensivePlayer) player[i]).getInterceptions();
		}
		else{
			return 0;
		}	
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
		if(player[i].isDefensive()) {
			return ((NFLDefensivePlayer) player[i]).getTacklesPerGame();
		}
		else{
			return 0;
		}
	}
	
	// returns fumbles per game, if no games are played returns 0
	double getPlayerFumblesPerGame(int i) {
		return player[i].getFumblesPerGame();
	}
	
	// returns interceptions per game, if no games are played returns 0
	double getPlayerInterceptionsPerGame(int i) {
		if(player[i].isDefensive()) {
			return ((NFLDefensivePlayer) player[i]).getInterceptionsPerGame();
		}
		else{
			return 0;
		}
	}
	
	// returns sacks per game, if no games are played returns 0
	double getPlayerSacksPerGame(int i) {
		if(player[i].isDefensive()) {
			return ((NFLDefensivePlayer) player[i]).getSacksPerGame();
		}
		else{
			return 0;
		}
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
	
	// returns a string all offensive players with applicable stats in tabular form
	public String toStringOffense() {
		stringValue = "Player Name\t\t";		
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerName(i) + "\t";
			}
		}
		stringValue = stringValue + "\nGames Played\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerGamesPlayed(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nMinutes Played\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerMinutesPlayed(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nPassing Yards\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerPassYards(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nRushing Yards\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerRushYards(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nTotal Yards\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerTotalYards(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nFumbles\t\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerFumbles(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nMinutes Per Game\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerMinutesPerGame(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nYards Per Game\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerYardsPerGame(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nFumbles Per Game\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isOffensive()) {
				stringValue = stringValue + getPlayerFumblesPerGame(i) + "\t\t";
			}
		}
		
		return stringValue;
	}
	
	// returns a string of all defensive playes with all applicable stats in tabular form
	public String toStringDefense() {
		stringValue = "Player Name\t\t";		
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerName(i) + "\t";
			}
		}
		stringValue = stringValue + "\nGames Played\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerGamesPlayed(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nMinutes Played\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerMinutesPlayed(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nTackles\t\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerTackles(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nSacks\t\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerSacks(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nInterceptions\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerInterceptions(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nFumbles Forced\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerFumbles(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nMinutes Per Game\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerMinutesPerGame(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nTackles Per Game\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerTacklesPerGame(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nSacks Per Game\t\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerSacksPerGame(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nInterceptions Per Game\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerInterceptionsPerGame(i) + "\t\t";
			}
		}
		stringValue = stringValue + "\nFumbles Forced Per Game\t";
		for(int i = 0; i < numberOfPlayers; i ++) {
			if(player[i].isDefensive()) {
				stringValue = stringValue + getPlayerFumblesPerGame(i) + "\t\t";
			}
		}
		
		return stringValue;
	}
	// creates a string value of all the players organized in tabular form 
	public String toString() {
		
		return "Offensive Players\n" + toStringOffense() + "\n\nDefensive Players\n" + toStringDefense();
	}
}

