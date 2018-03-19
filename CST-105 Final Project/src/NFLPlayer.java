
public abstract class NFLPlayer {

	/* Created by James Harbison 
	 * This program serves as a player class for the milestone project.  This abstract class will hold
	 * information on an individual player that can be manipulated and read back to ensure that
	 * a user of the drafting program will be able to see which stats are important as well as
	 * output a complete overview using the toString function
	 */
	
	// initialize variables
	private String name; 
	private int gamesPlayed;
	private int minutesPlayed;
	private int fumbles;
	
	// constructor no properties and sets all variables to a default value
	protected NFLPlayer(){
		name = "UNNAMED";
		gamesPlayed = 0;
		minutesPlayed = 0;
		fumbles = 0;
	}
	
	// constructor with only the name of the player involved and sets all other variables to a default value
	protected NFLPlayer(String input){
		name = input;
		gamesPlayed = 0;
		minutesPlayed = 0;
		fumbles = 0;
	}
	
	// constructor to explicitly state all variables at the initialization of the NFLPlayer 
	protected NFLPlayer(String input, int games, int minutes, int yards) {
		name = input;
		gamesPlayed = games;
		minutesPlayed = minutes;
	}
	
	// sets the player name
	public void setName(String input) {
		name = input;
	}
	
	// returns the player name
	public String getName() {
		return name;
	}
	
	// sets the games played
	public void setGamesPlayed(int a) {
		gamesPlayed = a;
	}
	
	// returns the games played
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
	// sets minutes played
	public void setMinutesPlayed(int a) {
		minutesPlayed = a;
	}
	
	// returns minutes played
	public int getMinutesPlayed() {
		return minutesPlayed;
	}
	
	// returns minutes per game rounded to 3 decimal points, if no games are played returns 0
	public double getMinutesPerGame() {
		if(gamesPlayed != 0) {
			return Math.round(minutesPlayed / (double)gamesPlayed * 1000) / 1000.0;
		}
		else {
			return 0;
		}
	}
	
	// sets fumbles
	void setFumbles(int a) {
		fumbles = a;
	}
	
	// returns fumbles
	int getFumbles() {
		return fumbles;
	}
		
	// returns fumbles per game rounded to 3 decimal points, if no games are played returns 0
	double getFumblesPerGame() {
		if(getGamesPlayed() != 0) {
			return Math.round((double)fumbles / (double)getGamesPlayed() * 1000) / 1000.0;
		}
		else {
			return 0;
		}
	}
	
	// returns a string value of all the properties listed in tabular format for easy reading
	public String toString() {
		return "Player\t\t" + name + "\nGames Played\t" + gamesPlayed + "\nMinutes Played\t" + minutesPlayed;
	}
	
	public abstract boolean isOffensive();
	
	public abstract boolean isDefensive();
}
