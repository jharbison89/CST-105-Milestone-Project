
public class NFLOffensivePlayer 
	extends NFLPlayer{
	
	/* Created by James Harbison
	 * this extends the NFLPlayer class with stats that pertain to an offensive player
	 */
	
	private int passYards;
	private int rushYards;
	private int totalYards;
		
	public NFLOffensivePlayer() {
		passYards = 0;
		rushYards = 0;
		totalYards = 0;
	}
	
	public NFLOffensivePlayer(String name) {
		setName(name);
		passYards = 0;
		rushYards = 0;
		totalYards = 0;
	}
	
	public NFLOffensivePlayer(String name, int passYards, int rushYards, int totalYards, int fumbles, int gamesPlayed, int minutesPlayed) {
		setName(name);
		this.passYards = passYards;
		this.rushYards = rushYards;
		this.totalYards = totalYards;
		setFumbles(fumbles);
		setGamesPlayed(gamesPlayed);
		setMinutesPlayed(minutesPlayed);
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
		if(getGamesPlayed() != 0) {
			return Math.round((double)totalYards / (double)getGamesPlayed() * 1000) /1000.0;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Player\t\t" + getName() + "\nGames Played\t" + getGamesPlayed() + "\nMinutes Played\t" + getMinutesPlayed() + "\nFumbles\t\t" +
				getFumbles() + "\nPassing Yards\t" + passYards + "\nRushing Yards\t" + rushYards + "\nTotal Yards\t" + totalYards; 
	}
	
	// boolean values to be used by NFLPlayer manager to determine if any given player is offensive or defensive
	public boolean isOffensive() {
		return true;
	}
	
	public boolean isDefensive() {
		return false;
	}
}
