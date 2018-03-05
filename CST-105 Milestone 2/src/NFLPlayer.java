
public class NFLPlayer {

	/* Created by James Harbison 
	 * This program serves as a player class for the milestone project.  This class will hold
	 * information on an individual player that can be manipulated and read back to ensure that
	 * a user of the drafting program will be able to see which stats are important as well as
	 * output a complete overview using the toString function
	 */
	
	// initialize variables
	String name; 
	private int passYards;
	private int rushYards;
	private int gamesPlayed;
	private int minutesPlayed;
	private int tackles;
	private int sacks;
	private int interceptions;
	private int fumbles;
	private int totalYards;
	
	// constructor no properties and sets all variables to a default value
	public NFLPlayer(){
		name = "UNNAMED";
		passYards = 0;
		rushYards = 0;
		gamesPlayed = 0;
		minutesPlayed = 0;
		tackles = 0;
		sacks = 0;
		interceptions = 0;
		fumbles = 0;
		totalYards = 0;
	}
	
	// constructor with only the name of the player involved and sets all other variables to a default value
	public NFLPlayer(String input){
		name = input;
		passYards = 0;
		rushYards = 0;
		gamesPlayed = 0;
		minutesPlayed = 0;
		tackles = 0;
		sacks = 0;
		interceptions = 0;
		fumbles = 0;
		totalYards = 0;
	}
	
	// constructor to explicitly state all variables at the initialization of the NFLPlayer 
	public NFLPlayer(String input, int pass, int rush, int games, int minutes, int tack, int saks, int intercept, int fum, int yards) {
		name = input;
		passYards = pass;
		rushYards = rush;
		gamesPlayed = games;
		minutesPlayed = minutes;
		tackles = tack;
		sacks = saks;
		interceptions = intercept;
		fumbles = fum;
		totalYards = yards;
	}
	
	// sets the player name
	void setName(String input) {
		name = input;
	}
	
	// returns the player name
	String getName() {
		return name;
	}
	
	// sets the passing yards and also updates the total yards
	void setPassYards(int a) {
		passYards = a;
		totalYards = passYards + rushYards;
	}
	
	// returns the passing yards
	int getPassYards() {
		return passYards;
	}
	
	// sets the rushing yards and also updates the total yards
	void setRushYards(int a) {
		rushYards = a;
		totalYards = passYards + rushYards;
	}
	
	// returns the rushing yards
	int getRushYards() {
		return rushYards;
	}
	
	// sets the games played
	void setGamesPlayed(int a) {
		gamesPlayed = a;
	}
	
	// returns the games played
	int getGamesPlayed() {
		return gamesPlayed;
	}
	
	// sets minutes played
	void setMinutesPlayed(int a) {
		minutesPlayed = a;
	}
	
	// returns minutes played
	int getMinutesPlayed() {
		return minutesPlayed;
	}
	
	// sets total yards
	void setTotalYards(int a) {
		totalYards = a;
	}
	
	// returns total yards
	int getTotalYards() {
		return totalYards;
	}
	
	// returns yards per game, if no games are played returns 0
	double getYardsPerGame() {
		if(gamesPlayed != 0) {
			return (double)totalYards / (double)gamesPlayed;
		}
		else {
			return 0;
		}
	}
	
	// returns minutes per game, if no games are played returns 0
	double getMinutesPerGame() {
		if(gamesPlayed != 0) {
			return (double)minutesPlayed / (double)gamesPlayed;
		}
		else {
			return 0;
		}
	}
	
	// sets tackles
	void setTackles(int a) {
		tackles = a;
	}
	
	// returns tackles
	int getTackles() {
		return tackles;
	}
	
	// sets sacks
	void setSacks(int a) {
		sacks = a;
	}
	
	// returns sacks
	int getSacks() {
		return sacks;
	}
	
	// sets interceptions
	void setInterceptions(int a) {
		interceptions = a;
	}
	
	// returns interceptions
	int getInterceptions() {
		return interceptions;
	}
	
	// sets fumbles
	void setFumbles(int a) {
		fumbles = a;
	}
	
	// returns fumbles
	int getFumbles() {
		return fumbles;
	}
	
	// returns tackles per game counting both tackles and sacks as a tackle, if no games are played returns 0
	double getTacklesPerGame() {
		if(gamesPlayed != 0) {
			return (double)(tackles + sacks) / (double)gamesPlayed;
		}
		else {
			return 0;
		}
	}
	
	// returns fumbles per game, if no games are played returns 0
	double getFumblesPerGame() {
		if(gamesPlayed != 0) {
			return (double)fumbles / (double)gamesPlayed;
		}
		else {
			return 0;
		}
	}
	
	// returns interceptions per game, if no games are played returns 0
	double getInterceptionsPerGame() {
		if(gamesPlayed != 0) {
			return (double)interceptions / (double)gamesPlayed;
		}
		else {
			return 0;
		}
	}
	
	// returns sacks per game, if no games are played returns 0
	double getSacksPerGame() {
		if(gamesPlayed != 0) {
			return sacks / gamesPlayed;
		}
		else {
			return 0;
		}
	}
	
	// returns a string value of all the properties listed in tabular format for easy reading
	public String toString() {
		return "Player\t\t" + name + "\nPassing Yards\t" + passYards + "\nRushing Yards\t" + rushYards +
				"\nGames Played\t" + gamesPlayed + "\nMinutes Played\t" + minutesPlayed + "\nTackles\t\t" +
				tackles + "\nSacks\t\t" + sacks + "\nInterceptions\t" + interceptions + "\nFumbles\t\t" + 
				fumbles +"\nTotal Yards\t" + totalYards;
	}
}
